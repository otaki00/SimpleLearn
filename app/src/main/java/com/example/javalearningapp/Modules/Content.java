package com.example.javalearningapp.Modules;

import androidx.annotation.NonNull;

public class Content {
    private long id ;
    private Course contentFor;
    private String title;
    private String thisContent;
    private boolean isDone;

    public Content() {}

    public Content(long id, String title,Course contentFor, String thisContent, boolean isDone ) {
        this.id = id;
        this.title = title;
        this.contentFor = contentFor;
        this.thisContent = thisContent;
        this.isDone = isDone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Course getContentFor() {
        return contentFor;
    }

    public void setContentFor(Course contentFor) {
        this.contentFor = contentFor;
    }

    public String getThisContent() {
        return thisContent;
    }

    public void setThisContent(String thisContent) {
        this.thisContent = thisContent;
    }

    public boolean isDone() {
        return isDone;
    }

    public void setDone(boolean done) {
        isDone = done;
    }

    @NonNull
    @Override
    public String toString() {
        return "this is about : " +this.thisContent +" for course :" +this.contentFor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
