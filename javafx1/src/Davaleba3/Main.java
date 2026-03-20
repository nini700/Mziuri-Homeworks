package Davaleba3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        //--module-path /Users/mziapitskhelauri/Desktop/javafx-sdk-21.0.10/lib --add-modules javafx.controls,javafx.fxml
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 600, Color.WHITE);

        Circle face = new Circle();
        face.setCenterX(300);
        face.setCenterY(300);
        face.setRadius(150);
        face.setFill(Color.YELLOW);
        face.setStroke(Color.BLACK);
        face.setStrokeWidth(4);
        root.getChildren().add(face);


        Circle leftEye = new Circle();
        leftEye.setCenterX(255);
        leftEye.setCenterY(265);
        leftEye.setRadius(15);
        leftEye.setFill(Color.BLACK);
        root.getChildren().add(leftEye);

        Circle rightEye = new Circle();
        rightEye.setCenterX(345);
        rightEye.setCenterY(265);
        rightEye.setRadius(15);
        rightEye.setFill(Color.BLACK);
        root.getChildren().add(rightEye);


        Line mouth = new Line();
        mouth.setStartX(250);
        mouth.setStartY(360);
        mouth.setEndX(350);
        mouth.setEndY(360);
        mouth.setStroke(Color.BLACK);
        mouth.setStrokeWidth(5);
        root.getChildren().add(mouth);

        stage.setTitle("smile");
        stage.setScene(scene);
        stage.show();
    }
}