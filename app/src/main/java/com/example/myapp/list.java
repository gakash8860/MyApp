package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class list extends AppCompatActivity {
    ListView lv;
    String dish[]={"Brinjal","Lady Finger(Bhindi)","Paalak Paneer","Aalo Ghobhi","Matar Paneer","Shahi Paneer","Chole Bhature","Lassi"};
    String rate[] = {"50rs","55rs","95rs","45rs","95rs","120rs","50rs","25rs"};
    int img[]={R.drawable.brinjal,R.drawable.bhindi,R.drawable.palak,R.drawable.aloghobhi,R.drawable.matarpaneer,R.drawable.shahi,R.drawable.chole,R.drawable.lassi};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        lv = findViewById(R.id.lv);
        MyAdapter adapter = new MyAdapter(this);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(list.this, dish[position]+ " "+rate[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
    class MyAdapter extends  ArrayAdapter<String>{
        public MyAdapter(@NonNull Context context){super(context, R.layout.foodi,dish);}

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.foodi,parent,false);
            ImageView i;
            TextView t1,t2;
            i=view.findViewById(R.id.imageView2);
            t1=view.findViewById(R.id.t1);
            t2=view.findViewById(R.id.t2);
            t1.setText(dish[position]);
            t2.setText(rate[position]);
            i.setImageDrawable(getDrawable(img[position]));
            return view;
        }
    }
}
