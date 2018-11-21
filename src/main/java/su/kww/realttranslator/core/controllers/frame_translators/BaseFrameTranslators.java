package su.kww.realttranslator.core.controllers.frame_translators;

import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import org.apache.commons.codec.binary.Base64;

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

    protected Double indexProgressBar = 0.0;

    @FXML
    protected Label labelProgressBarr;

    final private static int DEFAULT_LABEL_PADDING = 5;

    @FXML
    void exit(ActionEvent event) {
        System.exit(0);
    }

    public void initialize(URL url, ResourceBundle rb) {

        setup();
    }

    public void addPercentProgressBar(Double index, String textLabelProgressBar){
        indexProgressBar +=index;
        progressBar.setProgress(indexProgressBar);
        labelProgressBarr.setText("проверка");
    }

    private void setup(){

        labelProgressBarr.setTextFill(Color.web("#0076a3"));
    }

    public Image getImageLogo(byte[] bytes){
        return new Image(new ByteArrayInputStream(bytes));
    }
    public static byte[] decodeImageByString(String imageDataString) {
        return Base64.decodeBase64(imageDataString);
    }



}