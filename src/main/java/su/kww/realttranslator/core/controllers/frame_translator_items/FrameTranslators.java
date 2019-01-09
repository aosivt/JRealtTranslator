package su.kww.realttranslator.core.controllers.frame_translator_items;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.subjects.PublishSubject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.inside.database.entities.SiteSettings;
import su.kww.realttranslator.core.api.inside.database.entities.UserSettings;
import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositorySite;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositorySiteSettings;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositoryUserSettings;
import su.kww.realttranslator.core.api.remote.domstor.DaggerDomstorComponent;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.core.controllers.item_translator.FrameTranslatorItem;
import su.kww.realttranslator.core.controllers.item_translator.TranslatorItem;

import java.io.EOFException;
import java.io.IOException;
import java.util.Objects;
import java.util.Set;

public class FrameTranslators extends BaseFrameTranslators {

    private static String MESSAGE_SYNC_OK = "успешно";

    private Set<EntityDomstor> sites;

    protected Double indexProgressBar = 0.0;

    private UserNamePassword userNamePassword;

    public FrameTranslators(){}

    public void addTranslator(final Site site) {
        try{
            FXMLLoader loader = createTranslatorItem(site);
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    private FXMLLoader getViewTranslatorItem(){
        return new FXMLLoader(getClass().getResource("/view/TranslatorItem.fxml"));
    }
    private VBox getBoxTranslatorItem(final Site site){
        return StatusTranslator.valueOf(getStringStatus(site)).checkActive(this);
    }

    private FXMLLoader createTranslatorItem(final Site site) throws IOException{
        FXMLLoader loader = getViewTranslatorItem();
        getBoxTranslatorItem(site).getChildren().add(loader.load());
        FrameTranslatorItem frameTranslatorItem = loader.getController();
        frameTranslatorItem.setSite(site);
        frameTranslatorItem.setSitePublisher(subscribeToSite());
        frameTranslatorItem.createLogo();
        return loader;
    }

    private PublishSubject<Site> subscribeToSite(){
        PublishSubject<Site> sitePublishSubject = PublishSubject.create();
        sitePublishSubject.subscribe(this::updateTranslatorsFromDB);
        return sitePublishSubject;
    }

    private void updateTranslatorsFromDB(Site site) {
        sites = null;
        clearListVBox();
        activateTranslatorItems();
    }

    public void activateTranslatorItems(){
        sites = RepositorySite.select(Site.class.getName());
        sites.parallelStream().filter(Objects::nonNull)
                              .map(site->{
                                  addPercentProgressBar((double) (100/sites.size()),((Site)site).getName());
                                  return (Site)site;
                              })
                              .sequential()
                              .forEach(this::addTranslator);
        succesfullSync();
    }

    private String getStringStatus(final Site site){
        return RepositorySite.isNullSiteSettings(site) ? "NULL" :
                site.getSiteSettings().isActive().toString().toUpperCase();
    }

    public void addPercentProgressBar(Double index, String textLabelProgressBar){
        indexProgressBar +=index;
        progressBar.setProgress(indexProgressBar);
        labelProgressBarr.setText(textLabelProgressBar);
    }

    public void synchronize(String username, String pass){
        clearListVBox();
        DaggerDomstorComponent.create()
                .getDomstorApiConfig()
                .synchronize(username, pass);
    }

    public void synchronize(){
        synchronize(userNamePassword.getUsername(), userNamePassword.getPassword());
    }

    private void succesfullSync(){
        progressBar.setProgress(0);
        indexProgressBar = (double)0;
        labelProgressBarr.setText(MESSAGE_SYNC_OK);
    }

    public UserNamePassword getUserNamePassword() {
        return userNamePassword;
    }

    public void setUserNamePassword(UserNamePassword userNamePassword) {
        this.userNamePassword = userNamePassword;
    }
}
