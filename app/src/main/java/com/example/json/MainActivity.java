package com.example.json;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Gson gson = new Gson();

        // convertinG OBJECT TO JOSON \|/
//        Student student = new Student("Mithun",5,"mithun@gmail.com");
//        String json=gson.toJson(student);
//

        // convertinG JSON TO OBJECT  \|/
//        String json = "{\"Course_Count\":5,\"email\":\"mithun@gmail.com\",\"name\":\"Mithun\"}";
//        Student student = gson.fromJson(json, Student.class);
//
//        Log.d("TEST",json);\



        //convertinG OBJECT(OBJECT INSIDE OBJECT) TO JOSON \|/
//
//        String json ="{\"Course_Count\":2,\"email\":\"BABBIRA.COM\",\"Course\":{\"description\":\"Bootcamp\",\"name\":\"Java\"},\"name\":\"Mithun\"}";
//        Student student =gson.fromJson(json, Student.class);





//        List<Video> videos = new ArrayList<>();
//        videos.add(new Video("Intro","4"));
//        videos.add(new Video("Exercise files","8"));
//        videos.add(new Video("Installation","12"));



//        //convertinG  OBJECT(OBJECT INSIDE OBJECT TO JSON )  \|/
//        Course course = new Course("Java","Bootcamp");
//        Student student = new Student("Mithun",2,"BABBIRA.COM",course,videos);
//        String json =gson.toJson(student);





        String json ="{\"Course_Count\":2,\"email\":\"BABBIRA.COM\",\"Course\":{\"description\":\"Bootcamp\",\"name\":\"Java\"},\"video\":[{\"duration\":\"4\",\"name\":\"Intro\"},{\"duration\":\"8\",\"name\":\"Exercise files\"},{\"duration\":\"12\",\"name\":\"Installation\"}],\"name\":\"Mithun\"}";
        Student student = gson.fromJson(json,Student.class);



        Log.d("Test",student.toString());
//        Log.d("Test",json);



    }
}



