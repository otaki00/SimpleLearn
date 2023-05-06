package com.example.javalearningapp.Modules;


import android.os.Parcel;
import android.os.Parcelable;

import androidx.annotation.NonNull;

import java.util.List;

public class Course implements Parcelable {
    private long id;
    private String title;
    private String description;
    private int MyProgress;

    private List<Content> contents;

    public Course () {

    }

    public Course (long id, String title, String description, int MyProgress, List<Content> contents) {
        this.id = id;
        this.description = description;
        this.title = title;
        this.MyProgress = MyProgress;
        this.contents = contents;
    }

    public Course (long id, String title, String description, int MyProgress) {
        this.id = id;
        this.description = description;
        this.title = title;
        this.MyProgress = MyProgress;
    }


    protected Course(Parcel in) {
        id = in.readLong();
        title = in.readString();
        description = in.readString();
        MyProgress = in.readInt();
    }

    public static final Creator<Course> CREATOR = new Creator<Course>() {
        @Override
        public Course createFromParcel(Parcel in) {
            return new Course(in);
        }

        @Override
        public Course[] newArray(int size) {
            return new Course[size];
        }
    };

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getMyProgress() {
        return MyProgress;
    }

    public void setMyProgress(int MyPrograss) {
        this.MyProgress = MyPrograss;
    }

    public void setContents(List<Content> contents) {
        this.contents = contents;
    }
    public List<Content> getContents() {
        return contents;
    }



    @Override
    public String toString() {
        return  this.title + " and its about " + this.description + " and your MyProgress is : "+ this.MyProgress;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NonNull Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeString(title);
        dest.writeString(description);
        dest.writeInt(MyProgress);
//        dest.writeList(contents);
    }
}
