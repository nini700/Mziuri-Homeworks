package Davaleba1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Optional;

public class Controller {
    private int clickCount = 0;

    public void buttonClick(ActionEvent event) {
        clickCount++;
        if (clickCount == 5) {
            clickCount = 0;
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Gamortva");
            alert.setHeaderText("Gamortva");
            alert.setContentText("Gindat gamortva?");
            Optional<ButtonType> result = alert.showAndWait();
            if (result.isPresent() && result.get() == ButtonType.OK) {
                Platform.exit();
            }
        }
    }
}