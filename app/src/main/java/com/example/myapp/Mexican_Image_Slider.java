package com.example.myapp;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class Mexican_Image_Slider extends PagerAdapter {
        int img[]={R.drawable.burritos_with_minced_meat_filling,R.drawable.chicken_quesadillas,R.drawable.chili_con_carnejpg,R.drawable.mexican,R.drawable.tacos};
        Context context;
    public Mexican_Image_Slider(Context con){
    this.context=con;
    }
    @Override
    public int getCount() {
    return img.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view==object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ImageView imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);

        imageView.setImageResource(img[position]);
        ( container).addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ( container).removeView((ImageView) object);

    }
}
