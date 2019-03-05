package com.example.androidfirebasedb;

public class Post {
    private String title, content, time, doorOpen;

    public Post(){

    }

    public Post(String title, String content,String doorOpen,String time){
        this.title = title;
        this.content = content;
        this.doorOpen = doorOpen;
        this.time = time;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content){
        this.content = content;
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
}

