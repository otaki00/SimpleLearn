package com.example.javalearningapp.Repository;

import com.example.javalearningapp.Controller.CourseController;
import com.example.javalearningapp.Modules.Content;
import com.example.javalearningapp.Modules.Course;
import com.example.javalearningapp.Modules.CourseList;

import java.util.ArrayList;
import java.util.List;

public class CourseRepo implements CourseController {

    private CourseList myList = new CourseList(1, "Coding Courses");
    @Override
    public Course createCourse() {

        Course java = new Course(1, "Java Course", "through this tutorial you get the basics of java", 0);


        String contentForLesson1 =  new StringBuilder()
                .append("In this Lesson we will see what is java,")
                .append(" Java is a programming language and computing platform first released by Sun Microsystems in 1995.")
                .append("It basically an OOP based language, this means that you need to follow OOP approach to build your app in the most professional way")
                .append("We Will Talk about later, But Now Lets write your first code in java \n")
                .append("System.out.println(\"hello world! this is my first code \")")
                .append("through this Line of code you can print \"hello world\" in the console")
                .toString();
        Content lessonOne = new Content(1, "lesson 1: intro to java",java, contentForLesson1, false);


        String contentForLesson2 =  new StringBuilder()
                .append("In this Lesson we will see what is java,")
                .append(" Java is a programming language and computing platform first released by Sun Microsystems in 1995.")
                .append("It basically an OOP based language, this means that you need to follow OOP approach to build your app in the most professional way")
                .append("We Will Talk about later, But Now Lets write your first code in java \n")
                .append("System.out.println(\"hello world! this is my first code \")")
                .append("through this Line of code you can print \"hello world\" in the console")
                .toString();
        Content lesson2 = new Content(2, "lesson 2: print with java",java, contentForLesson2, false);

        List<Content> contents = new ArrayList<Content>();
        contents.add(lessonOne);
        contents.add(lesson2);

        java.setContents(contents);

        myList.addCourse(java);




        return java;
    }

    @Override
    public Course getCourse(String courseTitle) {

        for(Course course: myList.getCourses()){
            if(course.getTitle().toLowerCase() == courseTitle.toLowerCase()){
                return  course;
            }
        }

        return null;
    }

    @Override
    public List<Content> GetCourseContent(long courseId) {
        for(Course course: myList.getCourses()){
            if(course.getId() == courseId){
                return  course.getContents();
            }
        }

        return null;
    }

    @Override
    public Course createCourse(String title, String description, List<Content> courseContent) {
        long courseId = 0;
        for(Course course: myList.getCourses()){
            courseId++;
        }
        Course newCourse = new Course(courseId, title, description, 0,courseContent);
        myList.addCourse(newCourse);

        return newCourse;
    }

    @Override
    public CourseList getAllCourses() {
        return myList;
    }
}
