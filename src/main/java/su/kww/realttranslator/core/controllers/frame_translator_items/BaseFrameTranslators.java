package su.kww.realttranslator.core.controllers.frame_translator_items;

import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import org.apache.commons.codec.binary.Base64;
import su.kww.realttranslator.core.controllers.item_translator.TranslatorItem;

import java.io.ByteArrayInputStream;
import java.net.URL;
import java.util.ResourceBundle;

public abstract class BaseFrameTranslators implements Initializable {

    @FXML
    protected AnchorPane anchorPane;

    @FXML
    protected JFXTextField username;

    @FXML
    protected ProgressBar progressBar;

    @FXML
    protected JFXTabPane translatorsTabPane;

    @FXML
    protected VBox activeBox;

    @FXML
    protected VBox notActiveBox;

    @FXML
    protected VBox withoutSetupBox;

    @FXML
    protected Label labelProgressBarr;

    @FXML
    protected ImageView sync;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    public void initialize(URL url, ResourceBundle rb) {
        labelProgressBarr.setTextFill(Color.web("#0076a3"));
        sync.setOnMouseEntered(en-> sync.setImage(new Image("view/resources/icons/sync-hover.png")));
        sync.setOnMouseExited(ex-> sync.setImage(new Image("view/resources/icons/sync.png")));
    }








}