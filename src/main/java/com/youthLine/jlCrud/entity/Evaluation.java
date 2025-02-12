package com.youthLine.jlCrud.entity;

import com.google.gson.JsonArray;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity

@Table(name = "evaluation")
public class Evaluation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @Column(name = "current_state_ids")
    private String currentState;

    public Evaluation(){
    }

    public Evaluation(LocalDateTime timestamp, String currentState) {
        this.timestamp = timestamp;
        this.currentState = currentState;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    @Override
    public String toString() {
        return "Evaluation{" +
                "id=" + id +
                ", timestamp=" + timestamp +
                ", currentState=" + currentState +
                '}';
    }
}
