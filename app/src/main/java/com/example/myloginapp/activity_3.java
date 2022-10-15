package com.example.myloginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_3 extends AppCompatActivity {

    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);

        button2=(Button)findViewById(R.id.button2);

        button2.setOnClickListener(view2 -> {

                Intent intent=new Intent(activity_3.this,activity_4.class);
                startActivity(intent);

        });

    }

}