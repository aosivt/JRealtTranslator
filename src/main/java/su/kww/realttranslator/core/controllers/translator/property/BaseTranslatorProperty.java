package su.kww.realttranslator.core.controllers.translator.property;

import com.jfoenix.controls.JFXCheckBox;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

public abstract class BaseTranslatorProperty {
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
}
