package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    Button b1,b2,b3,b4;
    ImageView i1,i2,i3,i4;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        b1=findViewById(R.id.indfood);
        b2=findViewById(R.id.itfood);
        b3=findViewById(R.id.chfood);
        b4=findViewById(R.id.mxfood);
        i1=findViewById(R.id.india);
        i1.setImageResource(R.drawable.ifood);
        i2=findViewById(R.id.italian);
        i2.setImageResource(R.drawable.ifood);
        i3=findViewById(R.id.chinese);
        i3.setImageResource(R.drawable.chinese);
        i4=findViewById(R.id.mexican);
        i4.setImageResource(R.drawable.mexican);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity4.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity5.class);
                startActivity(i);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity6.class);
                startActivity(i);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity3.this,MainActivity7.class);
                startActivity(i);
            }
        });
    }
}