package su.kww.realttranslator.core.controllers.login;

import com.google.common.base.Strings;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import su.kww.realttranslator.core.api.remote.domstor.DaggerDomstorComponent;
import su.kww.realttranslator.core.controllers.frame_translator_items.FrameTranslators;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public abstract class BaseLogin implements Initializable {

    @FXML
    protected AnchorPane anchorPane;

    @FXML
    protected JFXTextField username;

    @FXML
    protected JFXPasswordField pass;

    @FXML
    protected JFXButton login;

    @FXML
    protected JFXButton cancel;

    @FXML
    protected Label message;


    public void initialize(URL url, ResourceBundle rb) {
        message.setVisible(false);
        username.setOnMouseClicked(e -> message.setVisible(false));
        pass.setOnMouseClicked(e -> message.setVisible(false));
    }

    @FXML
    public abstract void auth(ActionEvent event);

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void actionForgotPassword(ActionEvent event) {
        try {
            Desktop.getDesktop().browse(new URL("http://domstor.ru/restore/").toURI());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }

}