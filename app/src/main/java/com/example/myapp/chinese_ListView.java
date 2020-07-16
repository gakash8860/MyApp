package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class chinese_ListView extends AppCompatActivity {
    ListView lv;
    int img[]={R.drawable.friedrice,R.drawable.momos,R.drawable.chillichicken,R.drawable.chillipo,R.drawable.springrol};
    String dish[]={"Fried Rice","MOMOS","Chilli Chicken","Chilli Potato","Spring Roll"};
    String rate[] = {"65rs","50rs","175rs","90rs","45rs"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese__list_view);
        lv=findViewById(R.id.lv);
        MyChinese adapter = new MyChinese( this);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(chinese_ListView.this, dish[position]+" "+rate[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
    class MyChinese extends ArrayAdapter<String>{
        public MyChinese(@NonNull Context context){ super(context,R.layout.chinese_lzyout,dish); }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View view  = getLayoutInflater().inflate(R.layout.chinese_lzyout,parent,false);
            ImageView i;
            TextView t1,t2;
            t1=view.findViewById(R.id.textView6);
            t2=view.findViewById(R.id.textView7);
            i=view.findViewById(R.id.imageView4);
            t1.setText(dish[position]);
            t2.setText(rate[position]);
            i.setImageDrawable(getDrawable(img[position]));
            return view;
        }
    }
}