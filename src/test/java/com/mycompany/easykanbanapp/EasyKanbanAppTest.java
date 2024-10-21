/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.easykanbanapp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Yoliswa Maduna
 */
public class EasyKanbanAppTest {
    @Test
    public void testCheckUserNameValid() {
        Login login = new Login();
        login.username = "kyl_1";
        assertTrue(login.checkUserName());
    }

    @Test
    public void testCheckUserNameInvalid() {
        Login login = new Login();
        login.username = "kyle!!!!!";
        assertFalse(login.checkUserName());
    }

    @Test
    public void testCheckPasswordValid() {
        Login login = new Login();
        login.password = "Ch&&sec@ke99!";
        assertTrue(login.checkPasswordComplexity());
    }

    @Test
    public void testCheckPasswordInvalid() {
        Login login = new Login();
        login.password = "password";
        assertFalse(login.checkPasswordComplexity());
    }

    @Test
    public void testTaskDescriptionValid() {
        Task task = new Task("Login Feature", "Create login to authenticate users", "Robun Harrison", 8, 0);
        assertTrue(task.checkTaskDescription());
    }

    @Test
    public void testTaskDescriptionInvalid() {
        Task task = new Task("Task", "This task description is way too long to be valid", "Robun Harrison", 8, 0);
        assertFalse(task.checkTaskDescription());
    }
}