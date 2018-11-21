package su.kww.realttranslator.core.controllers.frame_translators;

import javafx.fxml.FXMLLoader;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.controllers.translator.TranslatorItem;

import java.io.IOException;

public class FrameTranslators extends BaseFrameTranslators {


    public FrameTranslators(){}


    public void addTranslator(Site site) {

        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/TranslatorItem.fxml"));
            notActiveBox.getChildren().add(loader.load());
            ((TranslatorItem)loader.getController()).setTextLogo(site.getName());
            byte[] bytesLogo = FrameTranslators.decodeImageByString(site.getLogo());
            ((TranslatorItem)loader.getController()).setLogo(getImageLogo(bytesLogo));
        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }

    }

}
