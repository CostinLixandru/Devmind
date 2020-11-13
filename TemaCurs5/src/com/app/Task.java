package com.app;

import java.util.Random;

public class Task {
    private Random random = new Random();
    private String taskName;
    private Integer taskId;
    private Integer executionTime;
    private static Integer numberOfTasks = 0;


    public Integer getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(Integer executionTime) {
        this.executionTime = executionTime;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public static Integer getNumberOfTasks() {
        return numberOfTasks;
    }


    public void run(){
        try {
            Thread.sleep(executionTime);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public Integer generateId(int n){
        return random.nextInt(n);
    }

    public void performInitialization(){
        this.setExecutionTime((generateId(20)+1)*1000);
        run();
        numberOfTasks++;
        this.setTaskId(generateId(1000));
        this.setTaskName("com.app.Task"+ getTaskId());

    }

    public void performDestruction(){
        numberOfTasks--;
        System.out.println(getTaskName());
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskName='" + taskName + '\'' +
                ", taskId=" + taskId +
                ", executionTime=" + executionTime + ", numberOfTasks="+ numberOfTasks+
                '}';
    }
}
