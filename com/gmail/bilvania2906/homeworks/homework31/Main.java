package com.gmail.bilvania2906.homeworks.homework31;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        UserRepository userRepository = new UserRepository();

        userRepository.addUser(new User(1, "Ivan", "Ivan228@gmail.com"));
        userRepository.addUser(new User(2, "Dasha", "Dasha777@gmail.com"));
        userRepository.addUser(new User(3, "Nikita", "Nikita666@gmail.com.com"));

        int searchId = 2;
        Optional<User> userById = userRepository.findUserById(searchId);
        userById.ifPresentOrElse(
                user -> System.out.println("User found by ID: " + user),
                () -> System.out.println("User with ID " + searchId + " not found.")
        );

        String searchEmail = "Ivan228@gmail.com";
        Optional<User> userByEmail = userRepository.findUserByEmail(searchEmail);
        userByEmail.ifPresentOrElse(
                user -> System.out.println("User found by email: " + user),
                () -> System.out.println("User with email " + searchEmail + " not found.")
        );

        Optional<List<User>> allUsers = userRepository.findAllUsers();
        allUsers.ifPresentOrElse(
                users -> System.out.println("Total users: " + users.size()),
                () -> System.out.println("No users found.")
        );
    }
}
