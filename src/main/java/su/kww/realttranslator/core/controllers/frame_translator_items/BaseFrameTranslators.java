package su.kww.realttranslator.core.controllers.frame_translator_items;

import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXTabPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.net.URL;
import java.util.ResourceBundle;

public abstract class BaseFrameTranslators implements Initializable {

    @FXML
    protected GridPane anchorPane;

    @FXML
    protected JFXProgressBar progressBar;

    @FXML
    protected TabPane translatorsTabPane;

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

    protected void clearListVBox(){
        activeBox.getChildren().clear();
        notActiveBox.getChildren().clear();
        withoutSetupBox.getChildren().clear();
        System.gc();
    }
}