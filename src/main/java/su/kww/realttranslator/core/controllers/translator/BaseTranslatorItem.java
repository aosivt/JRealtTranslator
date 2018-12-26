package su.kww.realttranslator.core.controllers.translator;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

abstract class BaseTranslatorItem {
    @FXML
    protected ImageView logo;
    @FXML
    protected Label textLogo;

    @FXML
    protected ImageView settings;

    public BaseTranslatorItem(){
        setup();
    }

    public void setTextLogo(String text){
        textLogo.setText(text);
    }

    public void setLogo(Image imageLogo){
        logo.setImage(imageLogo);
    }

    public void setup(){

    }

    @FXML
    void actionSettings(MouseEvent event) {

        try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/view/TranslatorProperty.fxml"));
        Stage stage1 = new Stage();
        Parent root = loader.load();
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
}
