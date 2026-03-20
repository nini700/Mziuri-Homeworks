package Davaleba2;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        //--module-path /Users/mziapitskhelauri/Desktop/javafx-sdk-21.0.10/lib --add-modules javafx.controls,javafx.fxml
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.WHITE);

        Rectangle square = new Rectangle();
        square.setX(100);
        square.setY(100);
        square.setWidth(150);
        square.setHeight(150);
        square.setFill(Color.GREEN);
        root.getChildren().add(square);


        Line diagonal1 = new Line();
        diagonal1.setStartX(100);
        diagonal1.setStartY(100);
        diagonal1.setEndX(250);
        diagonal1.setEndY(250);
        diagonal1.setStroke(Color.YELLOW);
        diagonal1.setStrokeWidth(2);
        root.getChildren().add(diagonal1);


        //yay!
        Line diagonal2 = new Line();
        diagonal2.setStartX(250);
        diagonal2.setStartY(100);
        diagonal2.setEndX(100);
        diagonal2.setEndY(250);
        diagonal2.setStroke(Color.YELLOW);
        diagonal2.setStrokeWidth(2);
        root.getChildren().add(diagonal2);


        Line topLine = new Line();
        topLine.setStartX(400);
        topLine.setStartY(100);
        topLine.setEndX(600);
        topLine.setEndY(100);
        topLine.setStroke(Color.BLUE);
        topLine.setStrokeWidth(2);
        root.getChildren().add(topLine);

        Line bottomLine = new Line();
        bottomLine.setStartX(400);
        bottomLine.setStartY(400);
        bottomLine.setEndX(600);
        bottomLine.setEndY(400);
        bottomLine.setStroke(Color.BLUE);
        bottomLine.setStrokeWidth(2);
        root.getChildren().add(bottomLine);


        Line leftLine = new Line();
        leftLine.setStartX(400);
        leftLine.setStartY(100);
        leftLine.setEndX(400);
        leftLine.setEndY(400);
        leftLine.setStroke(Color.BLUE);
        leftLine.setStrokeWidth(2);
        root.getChildren().add(leftLine);


        Line rightLine = new Line();
        rightLine.setStartX(600);
        rightLine.setStartY(100);
        rightLine.setEndX(600);
        rightLine.setEndY(400);
        rightLine.setStroke(Color.BLUE);
        rightLine.setStrokeWidth(2);
        root.getChildren().add(rightLine);

        stage.setTitle("დავალება 2");
        stage.setScene(scene);
        stage.show();
    }
}