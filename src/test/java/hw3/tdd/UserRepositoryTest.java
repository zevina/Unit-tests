package hw3.tdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    @DisplayName("Добавление в список аутентиф. пользователей")
    void addUser() {
        UserRepository userRepository = new UserRepository();

        User user1 = new User("Lena", "123", true);
        user1.authenticate("Lena", "123"); //верный пароль
        userRepository.addUser(user1); //пользователь добавлен

        User user2 = new User("Nina", "456", false);
        user2.authenticate("Nina", "123"); //неверный пароль (не аутентифицирован)
        userRepository.addUser(user2); //пользователь не добавлен

        User user3 = new User("Lev", "789", true); //пользователь не аутентифицирован

        assertEquals(1, userRepository.getAuthUsers().size());
    }

    @Test
    void findByName() {
        UserRepository userRepository = new UserRepository();

        User user1 = new User("Lena", "123", true);
        user1.authenticate("Lena", "123"); //верный пароль
        userRepository.addUser(user1); //пользователь добавлен

        User user2 = new User("Nina", "456", false);
        user2.authenticate("Nina", "123"); //неверный пароль (не аутентифицирован)
        userRepository.addUser(user2); //пользователь не добавлен

        User user3 = new User("Lev", "789", true); //пользователь не аутентифицирован

        assertTrue(userRepository.findByName("Lena"));
        assertFalse(userRepository.findByName("Nina"));
        assertFalse(userRepository.findByName("Lev"));
    }

    @Test
    void unloggingUsers() {
        UserRepository userRepository = new UserRepository();

        User user1 = new User("Lena", "123", true);
        user1.authenticate("Lena", "123"); //верный пароль
        userRepository.addUser(user1); //пользователь добавлен

        User user2 = new User("Nina", "456", false);
        user2.authenticate("Nina", "456"); //верный пароль
        userRepository.addUser(user2); //пользователь добавлен

        User user3 = new User("Lev", "789", true); //пользователь не аутентифицирован

        assertEquals(2, userRepository.getAuthUsers().size());
        userRepository.unloggingUsers();
        assertEquals(1, userRepository.getAuthUsers().size());
    }
}