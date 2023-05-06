package com.example.javalearningapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.javalearningapp.Controller.RecyclerViewInterface;
import com.example.javalearningapp.Modules.Course;
import com.example.javalearningapp.Modules.CourseList;
import com.example.javalearningapp.Modules.Layouts.CourseRecyclerViewAdapter;
import com.example.javalearningapp.Repository.CourseRepo;

public class MainActivity extends AppCompatActivity implements RecyclerViewInterface {

    CourseRepo courseRepo = new CourseRepo();

    CourseList courseList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.courseView);

        courseRepo.createCourse();

        courseList = courseRepo.getAllCourses();

        CourseRecyclerViewAdapter courseRecyclerViewAdapter = new CourseRecyclerViewAdapter(this, courseList.getCourses(), this);
        recyclerView.setAdapter(courseRecyclerViewAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    @Override
    public void onClickItem(int position) {

        Intent intent = new Intent(MainActivity.this, CourseDetailActivity.class);
        intent.putExtra("COURSE" , courseList.getCourses().get(position));
        startActivity(intent);
    }
}