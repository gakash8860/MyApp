package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class MainActivity5 extends AppCompatActivity {
    ImageSwitcher is;
    Button b1,b2;
    ViewPager vp;
    int ar[]={R.drawable.itnoddles,R.drawable.itpasta,R.drawable.itpizza};
    int a=ar.length;
    int counter =-1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        is=findViewById(R.id.is);
        b1=findViewById(R.id.next);
        b2=findViewById(R.id.btn2);
        vp=findViewById(R.id.vwp);
        Image_Slider_Italian adapter = new Image_Slider_Italian(this);
        vp.setAdapter(adapter);
        is.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView i=new ImageView(getApplicationContext());
                i.setScaleType(ImageView.ScaleType.FIT_CENTER);
                i.setImageResource(R.drawable.itnoddles);
                return i;
            }
        });
        Animation anout= AnimationUtils.loadAnimation(this,android.R.anim.slide_out_right);
        Animation anin=AnimationUtils.loadAnimation(this,android.R.anim.slide_in_left);
        is.setOutAnimation(anout);
        is.setInAnimation(anin);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                if(counter==a){
                    counter=0;
                    is.setImageResource(ar[counter]);
                }
                else{

                    is.setImageResource(ar[counter]);
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity5.this, ItalianList.class);
                startActivity(i);
            }
        });
    }
}