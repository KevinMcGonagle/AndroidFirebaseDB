package com.example.androidfirebasedb;

public class Post {
    private String name, colour, time, doorOpen, quantity, shape, timeSchedule;

    public Post(){

    }

    public Post(String name, String colour,String doorOpen,String time,String quantity,String shape,String timeSchedule){
        this.name = name;
        this.colour = colour;
        this.doorOpen = doorOpen;
        this.time = time;
        this.quantity = quantity;
        this.shape = shape;
        this.timeSchedule = timeSchedule;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDoorOpen() {
        return doorOpen;
    }

    public void setDoorOpen(String doorOpen) {
        this.doorOpen = doorOpen;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getTimeSchedule() {
        return timeSchedule;
    }

    public void setTimeSchedule(String timeSchedule) {
        this.timeSchedule = timeSchedule;
    }
}

