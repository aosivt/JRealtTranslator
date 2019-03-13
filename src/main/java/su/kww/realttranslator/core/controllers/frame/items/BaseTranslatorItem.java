package su.kww.realttranslator.core.controllers.frame.items;

import io.reactivex.subjects.PublishSubject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.apache.commons.codec.binary.Base64;
import su.kww.realttranslator.core.api.inside.database.entities.AdvertSite;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositoryAdvertSite;
import su.kww.realttranslator.core.controllers.frame.BaseFrameTranslators;
import su.kww.realttranslator.core.controllers.frame.items.property.TranslatorProperty;
import su.kww.realttranslator.translators.builders.ResultProcessService;
import su.kww.realttranslator.translators.builders.service.TranslatorService;
import su.kww.realttranslator.translators.builders.service.TranslatorServiceBuilder;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.stream.Collectors;

abstract class BaseTranslatorItem implements Initializable, TranslatorItem {
    @FXML
    protected ImageView logo;
    @FXML
    protected Label textLogo;

    @FXML
    protected GridPane translatorItem;

    @FXML
    protected Label addOffer;
    @FXML
    protected Label updateOffer;
    @FXML
    protected Label deleteOffer;

    @FXML
    protected ImageView settings;
    @FXML
    protected ImageView run;


    protected PublishSubject<Site> sitePublisher;

    protected Site site;

    protected TranslatorService translatorService;

    protected BaseFrameTranslators frameTranslators;

    @FXML
    void actionSettings(MouseEvent event) {

        settings.setImage(new Image("view/resources/icons/settings-pressed.png"));
        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/TranslatorProperty.fxml"));
        Stage stage1 = new Stage();
        Parent root = loader.load();
        TranslatorProperty translatorProperty = loader.getController();
        translatorProperty.setSite(site);
        translatorProperty.setSitePublisher(sitePublisher);
        translatorProperty.initFieldFromSiteSettings();
        Scene scene = new Scene(root);
        Image appIcon = new Image("view/resources/icons/realttranslator.png");
        stage1.getIcons().add(appIcon);
        stage1.setTitle("Свойства");
        stage1.setScene(scene);
        stage1.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void actionRun(MouseEvent event) {
        run.setImage(new Image("view/resources/icons/run-pressed.png"));
        ResultProcessService resultProcessService = translatorService.process(getAdvertSitesBySite(site),frameTranslators.getUserNamePassword());
        viewError(resultProcessService.getErrors());
    }

    public void viewError(Set<String> errors){}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        settings.setOnMouseEntered(en-> settings.setImage(new Image("view/resources/icons/settings-hover.png")));
        settings.setOnMouseExited(ex-> settings.setImage(new Image("view/resources/icons/settings.png")));

        run.setOnMouseEntered(en-> run.setImage(new Image("view/resources/icons/run-hover.png")));
        run.setOnMouseExited(ex-> run.setImage(new Image("view/resources/icons/run.png")));

    }

    private Image getImageLogo(byte[] bytes){
        return new Image(new ByteArrayInputStream(bytes));
    }
    private byte[] decodeImageByString(String imageDataString) {
        return Base64.decodeBase64(imageDataString);
    }

    private void setTextLogo(String text){
        textLogo.setText(text);
    }

    private void setLogo(Image imageLogo){
        logo.setImage(imageLogo);
    }

    protected TranslatorItem createLogo() {
        setLogo(getImageLogo(decodeImageByString(site.getLogo())));
        setTextLogo(site.getName());
        return this;
    }

    protected TranslatorItem fieldingInfo(){
        Set<AdvertSite> advertSites = getAdvertSitesBySite(site);
        advertSites.forEach(as->OperationAdvertSite.values()[as.getOperationId()-1].countOffer(this));
        return this;
    }

    protected Set<AdvertSite> getAdvertSitesBySite(Site site){
        return RepositoryAdvertSite.getAdvertSiteBySite(site)
//                                   .parallelStream()
                                    .stream()
                                   .filter(s->Objects.nonNull(s.getAdvert()))
//                                   .sequential()
                                   .collect(Collectors.toSet());
    }

    @Override
    public TranslatorService getTranslatorService() {
        return translatorService;
    }

    void initTranslatorService() {
        translatorService = TranslatorServiceBuilder.build(site);
    }

    public Label getAddOffer() {
        return addOffer;
    }

    public Label getUpdateOffer() {
        return updateOffer;
    }

    public Label getDeleteOffer() {
        return deleteOffer;
    }
}
