package Davaleba2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;

import java.util.Random;

public class Controller {
    @FXML
    private AnchorPane anchorPane;

    public void changeColor(ActionEvent event) {
        Random random = new Random();
        int r = random.nextInt(256);
        int g = random.nextInt(256);
        int b = random.nextInt(256);
        anchorPane.setStyle("-fx-background-color: rgb(" + r + ", " + g + ", " + b + ");");
    }
}