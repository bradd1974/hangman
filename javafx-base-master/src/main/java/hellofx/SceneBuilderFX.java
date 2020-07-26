package hellofx;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class SceneBuilderFX extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("layout.fxml"));
        stage.setResizable(false);
        stage.setScene(new Scene(root, 500, 450));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}