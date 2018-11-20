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
import su.kww.realttranslator.core.api.inside.database.repositoies.RepositorySite;
import su.kww.realttranslator.core.api.remote.domstor.DaggerDomstorComponent;
import su.kww.realttranslator.core.api.remote.domstor.DomstorUsernamePassword;
import su.kww.realttranslator.core.api.remote.domstor.UserNamePassword;
import su.kww.realttranslator.core.api.remote.domstor.entities.resources.Resource;
import su.kww.realttranslator.core.api.remote.domstor.services.BaseApiConfig;
import su.kww.realttranslator.core.controllers.frame_translators.FrameTranslators;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.stream.Collectors;

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

    void updateByLogin(){
        synchronize();
    }

    BaseApiConfig getBaseApiConfig(){
        return DaggerDomstorComponent.create()
                                .getDomstorApiConfig()
                                .setUserNamePassword(createUserPass());
    }

    protected void synchronize() {
        getBaseApiConfig()
                .getLogin()
                .firstOrError()
                .doOnError(e->fieldMessage(MessageForTranslator.ERROR_USER_PASSWORD + e.getMessage()))
                .subscribe(s->getMain().addPercentProgressBar(50.0d,"Обновление внешних данных"))
                .dispose();

//        getBaseApiConfig()
//                .getAdverts()
//                .firstOrError()
//                .doOnError(e->fieldMessage(MessageForTranslator.ERROR_USER_PASSWORD + e.getMessage()))
//                .subscribe(s->{
//                    s.get(0);
//                }).dispose();

        getBaseApiConfig()
                .getResources()
                .doOnError(e->fieldMessage(MessageForTranslator.ERROR_USER_PASSWORD + e.getMessage()))
                .subscribe(this::updateSite).dispose();
    }



    private Set<Site> updateSite(Set<Resource> resources){
        return resources.parallelStream().map(RepositorySite::create).map(s->(Site)RepositorySite.update(s)).sequential().collect(Collectors.toSet());
    }

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }


}