package CurrencyExchange;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;

public class Controller {
    @FXML
    private ChoiceBox<String> fromChoice;
    @FXML
    private ChoiceBox<String> toChoice;
    @FXML
    private Spinner<Double> amountSpinner;
    @FXML
    private Label resultLabel;

    @FXML
    public void initialize() {
        fromChoice.setItems(FXCollections.observableArrayList("GEL", "USD", "GBP", "EUR"));
        toChoice.setItems(FXCollections.observableArrayList("GEL", "USD", "GBP", "EUR"));

        fromChoice.setValue("GEL");
        toChoice.setValue("USD");

        SpinnerValueFactory<Double> valueFactory =
                new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 1000000, 1, 0.5);
        amountSpinner.setValueFactory(valueFactory);

        amountSpinner.valueProperty().addListener((obs, oldVal, newVal) -> calculate());
        fromChoice.valueProperty().addListener((obs, oldVal, newVal) -> calculate());
        toChoice.valueProperty().addListener((obs, oldVal, newVal) -> calculate());

        calculate();
    }

    private void calculate() {
        String from = fromChoice.getValue();
        String to = toChoice.getValue();
        Double amount = amountSpinner.getValue();

        if (from == null || to == null || amount == null) {
            resultLabel.setText("please fill all lines");
            return;
        }

        if (amount < 0) {
            resultLabel.setText("money amount should not be negative");
            return;
        }

        double result = CurrencyExchange.convert(amount, from, to);
        resultLabel.setText(String.format("%.2f %s = %.2f %s", amount, from, result, to));
    }
}