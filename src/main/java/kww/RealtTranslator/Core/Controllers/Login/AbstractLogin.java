package kww.RealtTranslator.Core.Controllers.Login;

import com.google.common.base.Strings;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import kww.RealtTranslator.Core.Api.Interfaces.IUserNamePassword;
import kww.RealtTranslator.Core.Api.UsernamePassword;
import kww.RealtTranslator.Core.Controllers.Main.AbstractMain;
import kww.RealtTranslator.Core.Controllers.Main.Main;

import java.net.URL;
import java.util.ResourceBundle;

public abstract class AbstractLogin implements Initializable {

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

    protected final static String EMPTY_USER_PASSWORD = "Одно из полей не заполненны";
    protected final static String ERROR_USER_PASSWORD = "Ошибка аутетификации";

    private Main mainController;

    public AbstractLogin(){}

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    public void initialize(URL url, ResourceBundle rb) {
        message.setVisible(false);
        username.setOnMouseClicked(e -> message.setVisible(false));
        pass.setOnMouseClicked(e -> message.setVisible(false));
    }

    protected IUserNamePassword auth() {
        return checkFielding() ? createUserPass() : null;
    }

    private Boolean checkFielding() {
        if (!Strings.isNullOrEmpty(username.getText()) && !Strings.isNullOrEmpty(pass.getText())) {
            return true;
        }
        return false;
    }

    private IUserNamePassword createUserPass() {
        IUserNamePassword iUserNamePassword = new UsernamePassword(username.getText(), pass.getText());

        return iUserNamePassword;
    }

    protected void fieldMessage(String value) {
        message.setVisible(true);
        message.setText(value);
    }

    public AbstractLogin setMain(Main main){
        mainController = main;
        return this;
    }

    protected AbstractMain getMain(){
        return mainController;
    }


}