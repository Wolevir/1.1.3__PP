package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Name 1", "Last Name 1", (byte) 33);
        userService.saveUser("Name 2", "Last Name 2", (byte) 23);
        userService.saveUser("Name 3", "Last Name 3", (byte) 14);
        userService.saveUser("Name 4", "Last Name 4", (byte) 55);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
