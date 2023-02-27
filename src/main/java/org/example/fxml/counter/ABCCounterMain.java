package org.example.fxml.counter;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ABCCounterMain extends Application {
    public static void main(String[] args){
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/views/first.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("ABC Counter");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

}
