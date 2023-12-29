package hw3.tdd;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    // Список аутентифицированных пользователей
    List<User> authUsers = new ArrayList<>();

    public List<User> getAuthUsers() {
        return authUsers;
    }

    public String printAuthUsers() {
        String authUsersStr = "";
        for (User user : authUsers) {
            authUsersStr = authUsersStr + "\n" + user.name;
        }
        return authUsersStr;
    }

    public void addUser(User user) {
        if (user.isAuthenticate) {
            this.authUsers.add(user);
        }
    }

    // Поиск пользователя в списке аутентифицированных пользователей
    public boolean findByName(String username) {
        for (User user : authUsers) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    // Разлогинить всех пользователей, кроме админов
    public void unloggingUsers() {
        for (User user : authUsers) {
            if (!user.isAdmin) {
                user.isAuthenticate = false;
            }
        }
        List<User> updateUsers = new ArrayList<>();
        for (User user : authUsers) {
            if (user.isAuthenticate) {
                updateUsers.add(user);
            }
        }
        authUsers = updateUsers;
    }

}