package br.com.mguibtech.introtesteautomatizados;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

public class UserServiceTest {

  private UserService userSerivice = new UserService();

  // Cenario
  @Test
  public void createUser_ReturnsUsers() {
    // AAA
    // Arange
    User user = new User("marcosGuibson", "123456");

    // ACT
    List<User> users = userSerivice.create(user);

    // Assert
    assertEquals(1, users.size());
    assertEquals(user, users.get(0));
  }

  @Test
  public void createUser_ThrowsException() {

    User user = new User("marcosGuibson", "123456");
    userSerivice.create(user);

    assertThrows(RuntimeException.class,
        () -> userSerivice.create(user));
  }
}
