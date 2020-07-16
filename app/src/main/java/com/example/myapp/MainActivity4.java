package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity4 extends AppCompatActivity {
    ImageSwitcher is;
    ViewPager vp;
    Button b1,b2;
    int ar[]={R.drawable.lassi,R.drawable.chole,R.drawable.thali};
    int a=ar.length;
    int counter=-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        is=findViewById(R.id.is);
        vp=findViewById(R.id.vwp);
        b1=findViewById(R.id.btn);
        b2=findViewById(R.id.button);
        Image_Slider adapter = new Image_Slider(this);
        vp.setAdapter(adapter);
        is.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView i = new ImageView(getApplicationContext());
                i.setScaleType(ImageView.ScaleType.FIT_CENTER);
                i.setImageResource(R.drawable.ifood);
                return  i;
            }
        });
        Animation anout = AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        Animation anin = AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        is.setOutAnimation(anout);
        is.setOutAnimation(anin);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                if (counter==a){
                    counter=0;
                    is.setImageResource(ar[counter]);
                }else{
                    is.setImageResource(ar[counter]);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity4.this,list.class);
                startActivity(i);
            }
        });
    }
}