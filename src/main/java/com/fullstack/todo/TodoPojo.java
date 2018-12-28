package com.fullstack.todo;

/* 5:47 PM 
created by: ajaypalsingh , 2018-11-24
Project: HelloBean 
*/


import java.util.Date;
import java.util.Objects;

public class TodoPojo {

    private long id;
    private  String username;
    private  String description;
    private  boolean done;
    private  Date targetDate;

    public TodoPojo() {
    }

    public TodoPojo(long id, String username, String description, Date targetDate, boolean done) {
        this.id = id;
        this.username = username;
        this.description = description;
        this.targetDate = targetDate;
        this.done = done;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TodoPojo todoPojo = (TodoPojo) o;
        return id == todoPojo.id &&
                done == todoPojo.done &&
                Objects.equals(username, todoPojo.username) &&
                Objects.equals(description, todoPojo.description) &&
                Objects.equals(targetDate, todoPojo.targetDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, description, done, targetDate);
    }
}
