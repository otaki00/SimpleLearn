package com.example.javalearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.TextView;

import com.example.javalearningapp.Modules.Content;
import com.example.javalearningapp.Modules.Course;
import com.example.javalearningapp.Modules.Layouts.ContentAdapter;
import com.example.javalearningapp.Repository.CourseRepo;

import java.util.ArrayList;
import java.util.List;

public class CourseDetailActivity extends AppCompatActivity {

    Course currentCourse;

    CheckBox checkBox;

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        currentCourse = getIntent().getParcelableExtra("COURSE");

        setTitle(currentCourse.getTitle());
//        TextView mytext  = findViewById(R.id.courseTitle);
//        mytext.setText(currentCourse.getTitle());
        CourseRepo courseRepo = new CourseRepo();


//        i put the fake data here because i got error on Parcelable, and there's no time to do more searches
//        this is temporary solution
        String contentForLesson1 =  new StringBuilder()
                .append("In this Lesson we will see what is java,")
                .append(" Java is a programming language and computing platform first released by Sun Microsystems in 1995.")
                .append("It basically an OOP based language, this means that you need to follow OOP approach to build your app in the most professional way")
                .append("We Will Talk about later. Now Lets dive into it")
                .toString();
        Content lessonOne = new Content(1, "lesson 1: intro to java",currentCourse, contentForLesson1, false);


        String contentForLesson2 =  new StringBuilder()
                .append(" Now Lets write your first code in java \n")
                .append("System.out.println(\"hello world! this is my first code \")\n")
                .append("through this Line of code you can print \"hello world\" in the console")
                .toString();

        Content lesson2 = new Content(2, "lesson 2: print with java",currentCourse, contentForLesson2, false);

        List<Content> contents = new ArrayList<Content>();
        contents.add(lessonOne);
        contents.add(lesson2);

//        checkBox = findViewById(R.id.checkBoxDone);

        listView = (ListView) findViewById(R.id.contentList);
        ContentAdapter contentAdapter = new ContentAdapter(getApplicationContext(), contents);
        listView.setAdapter(contentAdapter);


    }
}