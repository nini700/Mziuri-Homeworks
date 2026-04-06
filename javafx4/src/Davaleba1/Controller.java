package Davaleba1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class Controller {
    @FXML
    private RadioButton catRadio;
    @FXML
    private RadioButton dogRadio;
    @FXML
    private RadioButton rabbitRadio;
    @FXML
    private RadioButton birdRadio;
    @FXML
    private TextField nameTextField;
    @FXML
    private Label resultLabel;

    private ToggleGroup group;

    @FXML
    public void initialize() {
        group = new ToggleGroup();
        catRadio.setToggleGroup(group);
        dogRadio.setToggleGroup(group);
        rabbitRadio.setToggleGroup(group);
        birdRadio.setToggleGroup(group);
    }

    public void submit(ActionEvent event) {
        RadioButton selected = (RadioButton) group.getSelectedToggle();
        if (selected == null || nameTextField.getText().isEmpty()) {
            resultLabel.setText("გთხოვთ აირჩიოთ ცხოველი და შეიყვანოთ სახელი!");
            return;
        }
        String animal = selected.getText();
        String name = nameTextField.getText();
        resultLabel.setText("შენ აირჩიე " + animal + " სახელად " + name);
    }
}