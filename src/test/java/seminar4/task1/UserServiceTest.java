package seminar4.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UserServiceTest {

    @Test
    void testCreateUser() {
// Создаем заглушку для базы да нных
        DatabaseConnectionStub databaseStub = new DatabaseConnectionStub();

// Создаем сервис пользователя с заглушкой базы данных
        UserService userService = new UserService(databaseStub);

// Создаем пользователя для добавления
        User user = new User(1, "JohnDoe");

// Вызываем метод createUser
        boolean result = userService.createUser(user);

// Проверяем, что пользователь был успешно создан (возвращено true)
        assertTrue(result);

// Проверяем, что пользователь действительно добавлен в заглушку базы данных
        User retrievedUser = databaseStub.getUserById(1);
        assertNotNull(retrievedUser);
        assertEquals(user.getId(), retrievedUser.getId());
        assertEquals(user.getName(), retrievedUser.getName());
    }

    @Test
    void testGetUserById() {
// Создаем заглушку для базы данных и добавляем в нее пользователя
        DatabaseConnectionStub databaseStub = new DatabaseConnectionStub();
        User user = new User(1, "Alice");
        databaseStub.insertUser(user);

// Создаем сервис пользователя с заглушкой базы данных
        UserService userService = new UserService(databaseStub);

// Вызываем метод getUserById
        User retrievedUser = userService.getUserById(1);

// Проверяем, что полученный пользователь соответствует ожиданиям
        assertNotNull(retrievedUser);
        assertEquals(user.getId(), retrievedUser.getId());
        assertEquals(user.getName(), retrievedUser.getName());
    }
}