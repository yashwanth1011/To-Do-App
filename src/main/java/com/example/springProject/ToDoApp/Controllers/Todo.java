package com.example.springProject.ToDoApp.Controllers;

import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public class Todo {

    private int id;
    private String name;

    @Size(min = 10, message = "Please Enter more than 10 Characters")
    private String task;
    private LocalDate date;
    private boolean done;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTask() {
        return task;
    }

    public LocalDate getDate() {
        return date;
    }

    public boolean isDone() {
        return done;
    }

    public Todo(int id, String name, String task, LocalDate date, boolean done) {
        this.id = id;
        this.name = name;
        this.task = task;
        this.date = date;
        this.done = done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "Todo[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", task='" + task + '\'' +
                ", date=" + date +
                ", done=" + done +
                ']';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }
}
