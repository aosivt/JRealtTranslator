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
import kww.RealtTranslator.Core.Api.Interfaces.UserNamePassword;
import kww.RealtTranslator.Core.Api.DomstorUsernamePassword;
import su.kww.realttranslator.core.controllers.frame_translators.BaseFrameTranslators;
import su.kww.realttranslator.core.controllers.frame_translators.FrameTranslators;

import java.net.URL;
import java.util.ResourceBundle;

public abstract class BaseLogin implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private JFXTextField username;

    @FXML
    private JFXPasswordField pass;

    @FXML
    private JFXButton login;

    @FXML
    private JFXButton cancel;

    @FXML
    private Label message;

    protected final static String EMPTY_USER_PASSWORD = "Одно из полей не заполненно";
    protected final static String ERROR_USER_PASSWORD = "Ошибка аутетификации";

    private FrameTranslators frameTranslators;

    public BaseLogin(){}

    public void initialize(URL url, ResourceBundle rb) {
        message.setVisible(false);
        username.setOnMouseClicked(e -> message.setVisible(false));
        pass.setOnMouseClicked(e -> message.setVisible(false));
    }

    public BaseLogin setMain(FrameTranslators frameTranslators){
        this.frameTranslators = frameTranslators;
        return this;
    }

    @FXML
    public abstract void auth(ActionEvent event);

    protected Boolean checkFielding() {
        if (!Strings.isNullOrEmpty(username.getText()) && !Strings.isNullOrEmpty(pass.getText())) {
            return true;
        }
        return false;
    }
    protected UserNamePassword createUserPass() {
        return new DomstorUsernamePassword(username.getText(), pass.getText());
    }

    protected void fieldMessage(String value) {
        message.setVisible(true);
        message.setText(value);
    }

    protected FrameTranslators getMain(){
        return frameTranslators;
    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

}