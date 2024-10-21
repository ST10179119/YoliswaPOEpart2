/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.easykanbanapp;

import javax.swing.*;

/**
 *
 * @author Yoliswa Maduna
 */
class Login {
    String username;
    String password;
    private String firstName;
    private String lastName;

    public boolean registerUser() {
        username = JOptionPane.showInputDialog("Enter username (must contain '_' and no more than 5 characters):");
        if (!checkUserName()) {
            JOptionPane.showMessageDialog(null, "Username is not correctly formatted. Please ensure that username or password is correct.");
            return false;
        }

        password = JOptionPane.showInputDialog("Enter password (at least 8 characters, 1 capital, 1 number, 1 special):");
        if (!checkPasswordComplexity()) {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted.");
            return false;
        }

        firstName = JOptionPane.showInputDialog("Enter your first name:");
        lastName = JOptionPane.showInputDialog("Enter your last name:");

        JOptionPane.showMessageDialog(null, "Username and password successfully captured.");
        return true;
    }

    public boolean loginUser() {
        String inputUsername = JOptionPane.showInputDialog("Enter username to login:");
        String inputPassword = JOptionPane.showInputDialog("Enter password to login:");

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            JOptionPane.showMessageDialog(null, "Welcome " + firstName + ", " + lastName + ", it is great to see you again.");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Username or password incorrect, please try again.");
            return false;
        }
    }

    public boolean checkUserName() {
        return username.contains("_") && username.length() <= 5;
    }

    public boolean checkPasswordComplexity() {
        return password.length() >= 8 &&
               password.chars().anyMatch(Character::isUpperCase) &&
               password.chars().anyMatch(Character::isDigit) &&
               password.chars().anyMatch(ch -> "!@#$%^&*()_+[]{}|;':\",.<>?/`~".indexOf(ch) >= 0);
    }
}
    

