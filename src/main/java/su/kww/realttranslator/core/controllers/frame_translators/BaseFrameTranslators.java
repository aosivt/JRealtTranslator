package su.kww.realttranslator.core.controllers.frame_translators;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import su.kww.realttranslator.core.api.remote.domstor.services.DomstorApiConfig;

import javax.inject.Inject;
import java.net.URL;
import java.util.ResourceBundle;

public abstract class BaseFrameTranslators implements Initializable {



    @FXML
    private AnchorPane anchorPane;

    @FXML
    private JFXTextField username;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    public void initialize(URL url, ResourceBundle rb) {
        username.setText("sdfgsdfgsfd");
    }


}