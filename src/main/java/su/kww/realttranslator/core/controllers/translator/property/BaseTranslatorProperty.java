package su.kww.realttranslator.core.controllers.translator.property;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public abstract class BaseTranslatorProperty implements Initializable {
    @FXML
    protected JFXCheckBox isEnableTranslator;
    @FXML
    protected JFXCheckBox isAutoTranslator;
    @FXML
    protected JFXTextField loginResource;
    @FXML
    protected JFXTextField passwordResource;
    @FXML
    protected JFXTextField singlePhoneNumber;

    @FXML
    protected AnchorPane ancorPaneTranslatorProperty;

    @FXML
    protected Button ok;

    @FXML
    protected Button cancel;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    public void close(MouseEvent mouseEvent) {
        ((Stage)ancorPaneTranslatorProperty.getScene().getWindow()).close();
    }
    @FXML
    public void saveProperty(MouseEvent mouseEvent) {

        ((Stage)ancorPaneTranslatorProperty.getScene().getWindow()).close();
    }
}
