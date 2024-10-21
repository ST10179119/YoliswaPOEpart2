/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.easykanbanapp;

/**
 *
 * @author Yoliswa Maduna
 */
class Task {
    private String taskName;
    private String taskDescription;
    private String developerDetails;
    private int taskDuration;
    private int taskNumber;
    private String taskID;

    public Task(String taskName, String taskDescription, String developerDetails, int taskDuration, int taskNumber) {
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.developerDetails = developerDetails;
        this.taskDuration = taskDuration;
        this.taskNumber = taskNumber;
        this.taskID = createTaskID();
    }

    public boolean checkTaskDescription() {
        return taskDescription.length() <= 50;
    }

    public String createTaskID() {
        String taskPrefix = taskName.substring(0, 2).toUpperCase();
        String devSuffix = developerDetails.substring(developerDetails.length() - 3).toUpperCase();
        return taskPrefix + ":" + taskNumber + ":" + devSuffix;
    }

    public String printTaskDetails() {
        return "Task Status: To do\n" +
               "Developer Details: " + developerDetails + "\n" +
               "Task Number: " + taskNumber + "\n" +
               "Task Name: " + taskName + "\n" +
               "Task Description: " + taskDescription + "\n" +
               "Task ID: " + taskID + "\n" +
               "Duration: " + taskDuration + " hours";
    }
}