package su.kww.realttranslator.core.controllers.login;

import com.google.common.base.Strings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import su.kww.realttranslator.core.api.MessageForTranslator;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.remote.domstor.DaggerDomstorComponent;
import su.kww.realttranslator.core.api.remote.domstor.DomstorUsernamePassword;
import su.kww.realttranslator.core.controllers.frame_translator_items.FrameTranslators;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author villan
 */
public class Login extends BaseLogin implements Initializable {

    private FrameTranslators frameTranslators;
    @Override
    public synchronized void auth(ActionEvent event) {
        if (checkFielding()){
            updateByLogin();
            return;
        }
        fieldMessage(MessageForTranslator.EMPTY_USER_PASSWORD);
    }

    public void setMain(FrameTranslators frameTranslators){
        this.frameTranslators = frameTranslators;
    }

    private Boolean checkFielding() {
        return !Strings.isNullOrEmpty(username.getText()) && !Strings.isNullOrEmpty(pass.getText());
    }

    private void fieldMessage(String value) {
        message.setVisible(true);
        message.setText(value);
    }

    private void updateByLogin(){
        frameTranslators.setUserNamePassword(new DomstorUsernamePassword(username.getText(),pass.getText()));
        frameTranslators.synchronize();
        anchorPane.getScene().getWindow().hide();
    }
}
