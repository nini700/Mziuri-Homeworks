package login;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginController {
    private final UserStorage storage = new UserStorage();

    @FXML
    private Label signupStatus;
    @FXML
    private TextField signupUsername, signupPassword, signupRePassword;

    @FXML
    private Label loginStatus;
    @FXML
    private TextField loginUsername, loginPassword;

    public void signUp(ActionEvent event) {
        String username = signupUsername.getText();
        String password = signupPassword.getText();
        String rePassword = signupRePassword.getText();

        if (username.length() == 0) {
            signupStatus.setText("Please enter username");
            return;
        }
        if (password.length() == 0) {
            signupStatus.setText("Please enter password");
            return;
        }
        if (rePassword.length() == 0) {
            signupStatus.setText("Please re-enter password");
            return;
        }
        if (!password.equals(rePassword)) {
            signupStatus.setText("Passwords should match");
            return;
        }

        User user = new User(username, password);
        storage.addUser(user);
        storage.printUsers();
        signupStatus.setText("User registered successfully!");
    }

    public void login(ActionEvent event) {
        String username = loginUsername.getText();
        String password = loginPassword.getText();

        if (username.length() == 0) {
            loginStatus.setText("Please enter username");
            return;
        }
        if (password.length() == 0) {
            loginStatus.setText("Please enter password");
            return;
        }

        if (storage.login(username, password)) {
            loginStatus.setText("Login successful! Welcome " + username);
        } else {
            loginStatus.setText("Invalid username or password");
        }
    }
}