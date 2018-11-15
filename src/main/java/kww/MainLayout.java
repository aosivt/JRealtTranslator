package kww;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;
import kww.RealtTranslator.Core.Controllers.Login.Login;
import kww.RealtTranslator.Core.Controllers.Main.Main;

public class MainLayout  extends Application {



    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/View/Main.fxml"));
        Parent root = loader.load();
        Main main = loader.getController();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("");
        stage.show();


        Stage stage1 = new Stage();
        FXMLLoader loader2 = new FXMLLoader(getClass().getResource("/View/Login.fxml"));
        Parent root1 = loader2.load();
        Login login = loader2.getController();
        login.setMain(main);
        stage1.setScene(new Scene(root1));
        stage1.setTitle("Авторизация");
        stage1.initModality(Modality.WINDOW_MODAL);

        stage1.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}