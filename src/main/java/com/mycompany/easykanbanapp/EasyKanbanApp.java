/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.easykanbanapp;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yoliswa Maduna
 */
public class EasyKanbanApp {
    private static Login login;
    private static List<Task> tasks = new ArrayList<>();
    private static int totalHours = 0;

    public static void main(String[] args) {
        login = new Login();

        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        
        if (login.registerUser()) {
            while (true) {
                String menu = "1. Add Tasks\n2. Show Report (Coming Soon)\n3. Quit";
                String optionString = JOptionPane.showInputDialog(menu);
                
                if (optionString == null || optionString.isEmpty()) {
                    break; // Exit if the user cancels
                }
                int option = Integer.parseInt(optionString);

                switch (option) {
                    case 1:
                        addTasks();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Coming Soon");
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Exiting...");
                        return;
                    default:
                        JOptionPane.showMessageDialog(null, "Invalid option, please try again.");
                }
            }
        }
    }

    private static void addTasks() {
        String numTasksString = JOptionPane.showInputDialog("How many tasks do you wish to enter?");
        int numTasks = Integer.parseInt(numTasksString);

        for (int i = 0; i < numTasks; i++) {
            String taskName = JOptionPane.showInputDialog("Enter task name:");
            String taskDescription = JOptionPane.showInputDialog("Enter task description (max 50 characters):");
            String developerDetails = JOptionPane.showInputDialog("Enter developer details:");
            String taskDurationString = JOptionPane.showInputDialog("Enter task duration in hours:");
            int taskDuration = Integer.parseInt(taskDurationString);

            Task task = new Task(taskName, taskDescription, developerDetails, taskDuration, i);
            if (task.checkTaskDescription()) {
                tasks.add(task);
                totalHours += taskDuration;
                JOptionPane.showMessageDialog(null, task.printTaskDetails());
            } else {
                JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
            }
        }

        JOptionPane.showMessageDialog(null, "Total hours across all tasks: " + totalHours);
    }
}


 
        
    
     
        
    

