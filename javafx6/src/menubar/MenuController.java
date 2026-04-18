package menubar;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void newWindow(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setY(50);
        stage.setX(50);
        stage.show();
        System.out.println("New window opened");
    }

    public void close(ActionEvent event) {
        stage.close();
    }
}
