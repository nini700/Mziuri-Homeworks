package Davaleba3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.util.Random;

public class Controller {
    @FXML
    private Button clickButton;

    public void clickMe(ActionEvent event) {
        Random random = new Random();
        double x = random.nextInt(550);
        double y = random.nextInt(350);
        clickButton.setLayoutX(x);
        clickButton.setLayoutY(y);
    }
}