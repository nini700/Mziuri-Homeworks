package Davaleba2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller {
    @FXML
    private ImageView imageView;
    @FXML
    private Button prevButton;
    @FXML
    private Button nextButton;

    private final Image[] images = {
            new Image(getClass().getResourceAsStream("/Davaleba2/pages/images/photo1.jpg")),
            new Image(getClass().getResourceAsStream("/Davaleba2/pages/images/photo2.jpg")),
            new Image(getClass().getResourceAsStream("/Davaleba2/pages/images/photo3.jpg")),
            new Image(getClass().getResourceAsStream("/Davaleba2/pages/images/photo4.jpg")),
            new Image(getClass().getResourceAsStream("/Davaleba2/pages/images/photo5.jpg")),
            new Image(getClass().getResourceAsStream("/Davaleba2/pages/images/photo6.jpg")),
            new Image(getClass().getResourceAsStream("/Davaleba2/pages/images/photo7.jpg")),
            new Image(getClass().getResourceAsStream("/Davaleba2/pages/images/photo8.jpg")),
            new Image(getClass().getResourceAsStream("/Davaleba2/pages/images/photo9.jpg")),
            new Image(getClass().getResourceAsStream("/Davaleba2/pages/images/photo10.jpg"))
    };

    private int pointer = 0;

    @FXML
    public void initialize() {
        imageView.setImage(images[0]);
        prevButton.setDisable(true);
    }

    public void next(ActionEvent event) {
        pointer++;
        imageView.setImage(images[pointer]);
        prevButton.setDisable(false);
        if (pointer == images.length - 1) {
            nextButton.setDisable(true);
        }
    }

    public void prev(ActionEvent event) {
        pointer--;
        imageView.setImage(images[pointer]);
        nextButton.setDisable(false);
        if (pointer == 0) {
            prevButton.setDisable(true);
        }
    }
}