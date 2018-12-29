package su.kww.realttranslator.core.controllers.frame_translator_items;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.VBox;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.inside.database.entities.SiteSettings;
import su.kww.realttranslator.core.controllers.item_translator.FrameTranslatorItem;
import su.kww.realttranslator.core.controllers.item_translator.TranslatorItem;

import java.io.IOException;

public class FrameTranslators extends BaseFrameTranslators {

    enum ActiveTranslator{
        TRUE{
            @Override
            public VBox checkActive(FrameTranslators frameTranslators) {
                return frameTranslators.activeBox;
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


    protected Double indexProgressBar = 0.0;

    public FrameTranslators(){}


    public void addTranslator(final Site site) {

        site.setSiteSettings(new SiteSettings());
        site.getSiteSettings().setActive(true);
        System.out.println(site.getSiteSettings().isActive().toString().toUpperCase());

        FXMLLoader loader = getViewTranslatorItem();
        getControllerTranslatorItemByLoader(loader).setSite(site)
                                                   .createLogo();

        ActiveTranslator.valueOf(site.getSiteSettings().isActive().toString());
//            notActiveBox.getChildren().add(loader.load());
//            site.get
//            activeBox
//            withoutSetupBox

//            byte[] bytesLogo = FrameTranslators.decodeImageByString(site.getLogo());
//            ((TranslatorItem)loader.getController()).setLogo(getImageLogo(bytesLogo));
    }

    FXMLLoader getViewTranslatorItem(){
        return new FXMLLoader(getClass().getResource("/view/TranslatorItem.fxml"));
    }
    TranslatorItem getControllerTranslatorItemByLoader(final FXMLLoader loader){
        return ((FrameTranslatorItem)loader.getController());
    }

    public void addPercentProgressBar(Double index, String textLabelProgressBar){
        indexProgressBar +=index;
        progressBar.setProgress(indexProgressBar);
        labelProgressBarr.setText("проверка");
    }

}
