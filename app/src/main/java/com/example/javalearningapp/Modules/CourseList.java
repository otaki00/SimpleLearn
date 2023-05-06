package com.example.javalearningapp.Modules;

import java.util.ArrayList;
import java.util.List;

public class CourseList {
    private long id;
    private String title;
    private List<Course> courses;

    public CourseList ( ){ }

//    public CourseList(long id, String title, List<Course> courses ) {
//        this.id = id;
//        this.title = title;
//        this.courses = courses;
//    }

    public CourseList(long id, String title ) {
        this.id = id;
        this.title = title;
        this.courses = new ArrayList<Course>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course) {
        this.courses.add(course) ;
    }
}
