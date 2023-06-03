package com.demo.springboot.myfirstwebapp.todo;

import jakarta.persistence.*;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
public class Todo {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username", nullable = false)
    private String userName;

    @Column(name = "description", nullable = false)
    @Size(min=10, message="Description must be at least 10 Chars")
    private String description;

    @Column(name = "target_date", nullable = false)
    @NotNull(message = "Target date cannot be empty")
    @FutureOrPresent(message = "Target date must be in the future")
    private LocalDate targetDate;

    @Column(name = "is_done", nullable = false)
    private boolean done;

    public Todo() {}

    public Todo(String userName, String description, LocalDate targetDate, boolean done) {
        this.userName = userName;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    public Todo(int id, String userName, String description, LocalDate targetDate, boolean done) {
        this.id = id;
        this.userName = userName;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(LocalDate targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", description='" + description + '\'' +
                ", targetDate=" + targetDate +
                ", done=" + done +
                '}';
    }
}
