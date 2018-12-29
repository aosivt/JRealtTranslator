package su.kww.realttranslator.core.controllers.frame_translator_items;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.inside.database.entities.SiteSettings;
import su.kww.realttranslator.core.api.inside.database.entities.interfaces.EntityDomstor;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositorySite;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositorySiteSettings;
import su.kww.realttranslator.core.controllers.item_translator.FrameTranslatorItem;
import su.kww.realttranslator.core.controllers.item_translator.TranslatorItem;

import java.io.EOFException;
import java.io.IOException;
import java.util.Set;

public class FrameTranslators extends BaseFrameTranslators {

    private enum ActiveTranslator{
        TRUE{
            @Override
            public VBox checkActive(FrameTranslators frameTranslators) {
                return frameTranslators.activeBox;
            }
        },
        NULL{
            @Override
            public VBox checkActive(FrameTranslators frameTranslators) {
                return frameTranslators.withoutSetupBox;
            }
        },
        FALSE{
            @Override
            public VBox checkActive(FrameTranslators frameTranslators) {
                return frameTranslators.notActiveBox;
            }
        };
        public abstract VBox checkActive(FrameTranslators frameTranslators);
    }

    private Set<EntityDomstor> sites;

    protected Double indexProgressBar = 0.0;

    public FrameTranslators(){}

    public void addTranslator(final Site site) {
        try{
            FXMLLoader loader = createTranslatorItem(site);
            getBoxTranslatorItem(site).getChildren().add(loader.load());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    private FXMLLoader getViewTranslatorItem(){
        return new FXMLLoader(getClass().getResource("/view/TranslatorItem.fxml"));
    }
    private FrameTranslatorItem getControllerTranslatorItemByLoader(final FXMLLoader loader){
        return ((FrameTranslatorItem)loader.getController());
    }

    private VBox getBoxTranslatorItem(final Site site){
        return ActiveTranslator.valueOf(getStringStatus(site)).checkActive(this);
    }

    private FXMLLoader createTranslatorItem(final Site site){
        FXMLLoader loader = getViewTranslatorItem();
        FrameTranslatorItem frameTranslatorItem = loader.getController();
        frameTranslatorItem.createLogo();

        return loader;
    }

    public void activateTranslatorItems(){
        sites = RepositorySite.select(Site.class.getName());
        sites.parallelStream().map(s->(Site)s).forEach(this::addTranslator);
    }

    private SiteSettings getSiteSettingsBySite(Site site){
        return RepositorySiteSettings.defaultCreate(site);
    }

    private String getStringStatus(final Site site){
        return RepositorySite.isNullSiteSettings(site) ? "NULL" : site.getSiteSettings().isActive().toString().toUpperCase();
    }

    public void addPercentProgressBar(Double index, String textLabelProgressBar){
        indexProgressBar +=index;
        progressBar.setProgress(indexProgressBar);
        labelProgressBarr.setText(textLabelProgressBar);
    }
}
