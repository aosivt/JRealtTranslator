package su.kww.realttranslator.core.controllers.frame_translators;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public abstract class BaseFrameTranslators implements Initializable {



    @FXML
    protected AnchorPane anchorPane;

    @FXML
    protected JFXTextField username;

    @FXML
    protected ProgressBar progressBar;

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



}