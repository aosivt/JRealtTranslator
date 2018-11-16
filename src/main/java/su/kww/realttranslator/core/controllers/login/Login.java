package su.kww.realttranslator.core.controllers.login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import kww.RealtTranslator.Core.Api.Interfaces.UserNamePassword;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author villan
 */
public class Login extends BaseLogin implements Initializable {

    @Override
    public void auth(ActionEvent event) {

        if (checkFielding()){
            final UserNamePassword userNamePassword = createUserPass();
            getMain()
                    .getDomstorApiConfig()
                    .setUserNamePassword(userNamePassword)
                    .getLogin()
                    .firstOrError()
                    .doOnError(e->fieldMessage(ERROR_USER_PASSWORD + e.getMessage()))
                    .subscribe(this::checkLogin)
                    .dispose();
        }
        fieldMessage(EMPTY_USER_PASSWORD);
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

    private void checkLogin(LoginEntity login){
        System.out.println(login.getAgencyName());
    }

}
