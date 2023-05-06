package com.example.javalearningapp.Controller;

import com.example.javalearningapp.Modules.Content;
import com.example.javalearningapp.Modules.Course;
import com.example.javalearningapp.Modules.CourseList;

import java.util.List;

public interface CourseController {
    // this for create fake data just for test
    Course createCourse ();
    Course getCourse(String courseTitle);
    List<Content> GetCourseContent(long courseId);
    Course createCourse (String title, String description, List<Content> courseContent);

    CourseList getAllCourses();
}
