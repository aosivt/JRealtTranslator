package su.kww.realttranslator.core.controllers.item_translator.property;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.inside.database.entities.SiteSettings;

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

    private Site site;

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

    private SiteSettings createSiteSettings(){
        SiteSettings siteSettings = new SiteSettings();
        siteSettings.setActive(isEnableTranslator.isDisableVisualFocus());
        siteSettings.setAgencyId(1);
        siteSettings.setAgentId(1);
        siteSettings.setFilialId(1);
        siteSettings.setLogin(loginResource.getText());
        siteSettings.setPassword(passwordResource.getText());
        siteSettings.setAutorunEnabled(isAutoTranslator.isDisableVisualFocus());
        siteSettings.setExternalPhone(singlePhoneNumber.getText());
        return siteSettings;
    }

    public void setSite(Site site){
        this.site = site;
    }
}
