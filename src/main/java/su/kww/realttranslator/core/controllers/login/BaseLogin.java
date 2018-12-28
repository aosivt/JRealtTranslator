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
import su.kww.realttranslator.core.api.MessageForTranslator;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositorySite;
import su.kww.realttranslator.core.api.remote.domstor.DaggerDomstorComponent;
import su.kww.realttranslator.core.api.remote.domstor.DomstorUsernamePassword;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.core.api.remote.domstor.entities.resources.Resource;
import su.kww.realttranslator.core.api.remote.domstor.services.BaseApiConfig;
import su.kww.realttranslator.core.controllers.frame_translators.FrameTranslators;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;

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
    public FrameTranslators getFrameTranslators(){
        return this.frameTranslators;
    }

    @FXML
    public abstract void auth(ActionEvent event);

    protected Boolean checkFielding() {
        if (!Strings.isNullOrEmpty(username.getText()) && !Strings.isNullOrEmpty(pass.getText())) {
            return true;
        }
        return false;
    }

    protected void fieldMessage(String value) {
        message.setVisible(true);
        message.setText(value);
    }

    void updateByLogin(){
        synchronizeFromApiDomstor();
        anchorPane.getScene().getWindow().hide();
    }

    private void synchronizeFromApiDomstor(){
        DaggerDomstorComponent.create()
                .getDomstorApiConfig()
                .synchronize(username.getText(), pass.getText());
    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }


}