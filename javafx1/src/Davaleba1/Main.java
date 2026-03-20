package Davaleba1;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        //--module-path /Users/mziapitskhelauri/Desktop/javafx-sdk-21.0.10/lib --add-modules javafx.controls,javafx.fxml
        launch();
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root, 600, 400, Color.DARKSLATEBLUE);

        Text text = new Text();
        text.setText("გამარჯობა ეს არის აპლიკაცია");
        text.setFont(Font.font("DialogInput", 24));
        text.setFill(Color.LIGHTYELLOW);
        text.setX(600 / 2.0 - 180);
        text.setY(400 / 2.0);
        root.getChildren().add(text);

        Image image = new Image("icon.png");
        stage.getIcons().add(image);

        stage.setResizable(false);
        stage.setTitle("დავალება 1");
        stage.setScene(scene);
        stage.show();
    }
}