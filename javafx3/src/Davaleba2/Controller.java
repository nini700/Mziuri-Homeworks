package Davaleba2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;

public class Controller {

    public void switchToYellow(ActionEvent event) throws Exception {
        switchScene(event, "/Davaleba2/pages/yellow.fxml");
    }

    public void switchToRed(ActionEvent event) throws Exception {
        switchScene(event, "/Davaleba2/pages/red.fxml");
    }

    public void switchToGreen(ActionEvent event) throws Exception {
        switchScene(event, "/Davaleba2/pages/green.fxml");
    }

    public void goBack(ActionEvent event) throws Exception {
        switchScene(event, "/Davaleba2/pages/main.fxml");
    }

    private void switchScene(ActionEvent event, String path) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(path));
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }
}