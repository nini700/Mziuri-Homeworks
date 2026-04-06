package Davaleba3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Controller {
    @FXML
    private CheckBox balloonsCheck;
    @FXML
    private CheckBox heartsCheck;
    @FXML
    private CheckBox starsCheck;

    public void generate(ActionEvent event) throws Exception {
        List<String> chosen = new ArrayList<>();
        if (balloonsCheck.isSelected()) chosen.add("🎈");
        if (heartsCheck.isSelected()) chosen.add("❤️");
        if (starsCheck.isSelected()) chosen.add("⭐");

        if (chosen.isEmpty()) return;

        AnchorPane cardRoot = new AnchorPane();
        cardRoot.setPrefSize(600, 400);
        cardRoot.setStyle("-fx-background-color: #fff0f5;");

        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            String symbol = chosen.get(random.nextInt(chosen.size()));
            Text text = new Text(symbol);
            text.setLayoutX(random.nextInt(560));
            text.setLayoutY(random.nextInt(370) + 20);
            text.setStyle("-fx-font-size: 24;");
            cardRoot.getChildren().add(text);
        }

        Button backButton = new Button("Go Back");
        backButton.setLayoutX(260);
        backButton.setLayoutY(360);
        backButton.setOnAction(e -> {
            try {
                Parent root = FXMLLoader.load(getClass().getResource("/Davaleba3/pages/main.fxml"));
                Stage stage = (Stage) backButton.getScene().getWindow();
                stage.setScene(new Scene(root));
                stage.show();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });
        cardRoot.getChildren().add(backButton);

        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(cardRoot));
        stage.show();
    }
}