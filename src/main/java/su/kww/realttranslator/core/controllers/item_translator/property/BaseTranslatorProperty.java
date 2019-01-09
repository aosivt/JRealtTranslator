package su.kww.realttranslator.core.controllers.item_translator.property;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import io.reactivex.subjects.PublishSubject;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import su.kww.realttranslator.core.api.inside.database.entities.Site;
import su.kww.realttranslator.core.api.inside.database.entities.SiteSettings;
import su.kww.realttranslator.core.api.inside.database.entities.UserSettings;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositorySite;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositorySiteSettings;
import su.kww.realttranslator.core.api.inside.database.repositories.RepositoryUserSettings;
import su.kww.realttranslator.core.api.inside.utils.HibernateUtil;
import su.kww.realttranslator.core.api.remote.domstor.entities.login.LoginEntity;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.Objects;
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

    protected PublishSubject<Site> sitePublisher;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    @FXML
    public void close(MouseEvent mouseEvent) {
        ((Stage)ancorPaneTranslatorProperty.getScene().getWindow()).close();
    }
    @FXML
    public void saveProperty(MouseEvent mouseEvent) {
        SiteSettings siteSettings = createSiteSettings();
        RepositorySiteSettings.update(siteSettings);
        site.setSiteSettings(siteSettings);
        ((Stage)ancorPaneTranslatorProperty.getScene().getWindow()).close();
        sitePublisher.onNext(site);
    }

    private SiteSettings createSiteSettings(){
        final LoginEntity loginEntity = getLoginEntity();
        SiteSettings siteSettings = new SiteSettings();
        siteSettings.setSite(site);
        siteSettings.setSiteId(site.getId());
        siteSettings.setActive(isEnableTranslator.isSelected());
        siteSettings.setAutorunEnabled(isAutoTranslator.isSelected());
        siteSettings.setAgencyId(loginEntity.getAgencyId());
        siteSettings.setFilialId(loginEntity.getFilialId());
        siteSettings.setAgentId(loginEntity.getUserId());
        siteSettings.setLogin(loginResource.getText());
        siteSettings.setPassword(passwordResource.getText());
        siteSettings.setExternalPhone(singlePhoneNumber.getText());
        return siteSettings;
    }

    public void setSite(Site site){
        this.site = site;
    }

    public void setSitePublisher(PublishSubject<Site> sitePublisher){
        this.sitePublisher = sitePublisher;
    }

    private LoginEntity getLoginEntity(){
        LoginEntity loginEntity = null;
        UserSettings userSettings = RepositoryUserSettings.getExistUserSettings();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            loginEntity = objectMapper.readValue(userSettings.getJson(),LoginEntity.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return loginEntity;
    }

    public void initFieldFromSiteSettings(){
        if (Objects.nonNull(site.getSiteSettings())){
            isAutoTranslator.setSelected(site.getSiteSettings().isAutorunEnabled());
            isEnableTranslator.setSelected(site.getSiteSettings().isActive());
            loginResource.setText(site.getSiteSettings().getLogin());
            passwordResource.setText(site.getSiteSettings().getPassword());
            singlePhoneNumber.setText(site.getSiteSettings().getExternalPhone());
        }

    }
}
