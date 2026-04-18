package login;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {
    private Map<String, User> users;

    public UserStorage() {
        users = new HashMap<>();
    }

    public void addUser(User user) {
        users.put(user.getUsername(), user);
    }

    public boolean login(String username, String password) {
        if (!users.containsKey(username)) {
            return false;
        }
        return users.get(username).getPassword().equals(password);
    }

    public void printUsers() {
        users.values()
                .forEach(System.out::println);
        System.out.println();
    }
}