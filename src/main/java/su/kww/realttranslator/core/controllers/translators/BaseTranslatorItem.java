package su.kww.realttranslator.core.controllers.translators;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

abstract class BaseTranslatorItem implements Initializable {
    @FXML
    protected ImageView logo;
    @FXML
    protected Label textLogo;
    @FXML
    protected ImageView settings;
    @FXML
    protected ImageView run;

    public void setTextLogo(String text){
        textLogo.setText(text);
    }

    public void setLogo(Image imageLogo){
        logo.setImage(imageLogo);
    }

    @FXML
    void actionSettings(MouseEvent event) {

        settings.setImage(new Image("view/resources/icons/settings-pressed.png"));

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

    @FXML
    void actionRun(MouseEvent event) {
        run.setImage(new Image("view/resources/icons/run-pressed.png"));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        settings.setOnMouseEntered(en-> settings.setImage(new Image("view/resources/icons/settings-hover.png")));
        settings.setOnMouseExited(ex-> settings.setImage(new Image("view/resources/icons/settings.png")));

        run.setOnMouseEntered(en-> run.setImage(new Image("view/resources/icons/run-hover.png")));
        run.setOnMouseExited(ex-> run.setImage(new Image("view/resources/icons/run.png")));
    }
}