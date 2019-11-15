package com.example.json;

import android.widget.LinearLayout;

import com.google.gson.annotations.SerializedName;

import java.util.Calendar;
import java.util.List;

public class Student {
    private String name;
    private int Course_Count;
    private String email;

    @SerializedName("video")
    private List<Video>mVideo;


    @SerializedName("Course")
    private Course mCourse;


    public Student(String name, int course_Count, String email,Course course,List<Video> video) {
        this.name = name;
        Course_Count = course_Count;
        this.email = email;
        mCourse = course;
        mVideo = video;
    }
}
