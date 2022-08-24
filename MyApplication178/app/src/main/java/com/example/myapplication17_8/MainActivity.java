package com.example.myapplication17_8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
       ArrayList<Student> studentArrlist = new ArrayList<>();
       int currentStudent =8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(currentStudent == studentArrlist.size()){
            currentStudent = 8;
        }


        ImageView imageView = findViewById(R.id.imageView);
        TextView studentName = findViewById(R.id.textView);
        TextView studentAge = findViewById(R.id.textView2);
        TextView studentGrade = findViewById(R.id.textView3);
        Button Finish = findViewById(R.id.button);


        Student s1 = new Student("Salem",16, R.drawable.students);
        Student s2 = new Student("Salem",16, R.drawable.students);

        studentArrlist.add(s1);
        studentArrlist.add(s2);



    }


}