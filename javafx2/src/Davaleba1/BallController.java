package Davaleba1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class BallController {
    @FXML
    private Circle myCircle;

    private final Color[] colors = {
            Color.RED,
            Color.BLACK,
            Color.GREEN,
            Color.BLUE,
            Color.ORANGE
    };
    private int colorPointer = 0;

    public void up(ActionEvent event) {
        myCircle.setCenterY(myCircle.getCenterY() - 10);
    }

    public void down(ActionEvent event) {
        myCircle.setCenterY(myCircle.getCenterY() + 10);
    }

    public void left(ActionEvent event) {
        myCircle.setCenterX(myCircle.getCenterX() - 10);
    }

    public void right(ActionEvent event) {
        myCircle.setCenterX(myCircle.getCenterX() + 10);
    }

    public void upLeft(ActionEvent event) {
        myCircle.setCenterX(myCircle.getCenterX() - 10);
        myCircle.setCenterY(myCircle.getCenterY() - 10);
    }

    public void upRight(ActionEvent event) {
        myCircle.setCenterX(myCircle.getCenterX() + 10);
        myCircle.setCenterY(myCircle.getCenterY() - 10);
    }

    public void downLeft(ActionEvent event) {
        myCircle.setCenterX(myCircle.getCenterX() - 10);
        myCircle.setCenterY(myCircle.getCenterY() + 10);
    }

    public void downRight(ActionEvent event) {
        myCircle.setCenterX(myCircle.getCenterX() + 10);
        myCircle.setCenterY(myCircle.getCenterY() + 10);
    }


    public void makeRed(ActionEvent event) {
        myCircle.setFill(Color.RED);
    }

    public void changeColor(ActionEvent event) {
        if (colorPointer == colors.length) {
            colorPointer %= colors.length;
        }
        myCircle.setFill(colors[colorPointer++]);
    }
}