package kww.RealtTranslator.Core.Controllers.Main;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import kww.RealtTranslator.Core.Api.Interfaces.IUserNamePassword;

import java.net.URL;
import java.util.ResourceBundle;

public abstract class AbstractMain implements Initializable {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private JFXTextField username;

    private IUserNamePassword usernamePassword;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    public void initialize(URL url, ResourceBundle rb) {
        username.setText("sdfgsdfgsfd");
    }
    public void setUsernamePassword(IUserNamePassword usernamePassword){
        this.usernamePassword = usernamePassword;
    }
    public void setUserName(String value){

        username.setText(value);
    }

}