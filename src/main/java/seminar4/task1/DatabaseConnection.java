package seminar4.task1;

// Интерфейс DatabaseConnection, представляющий соединение с базой данных
public interface DatabaseConnection {
    void connect();
    void disconnect();
    boolean isConnected();
    boolean insertUser(User user);
    User getUserById(int userId);
}