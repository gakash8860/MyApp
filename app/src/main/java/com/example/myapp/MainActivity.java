package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=findViewById(R.id.imageView);
        i.setImageResource(R.drawable.download);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
            Intent i = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(i);
            finish();
            }
        },1500);
    }
}