package CurrencyExchange;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader
                .load(getClass().getResource("/CurrencyExchange/pages/main.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Currency Exchange");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}