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

public class ItalianList extends AppCompatActivity {
    ListView lv;
    int[] img = {R.drawable.italiannnn,R.drawable.itnoddles,R.drawable.itpasta,R.drawable.itpizza};
    String dish[] = {"Pizza","Noddles","Pasta","Italianio Pizaa"};
    String rate[] = {"350rs","120rs","175rs","600rs"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italianlist);
        lv=findViewById(R.id.itlist);
        Myfood adaper = new Myfood(this);
        lv.setAdapter(adaper);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(ItalianList.this, dish[position]+" "+rate[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
    class  Myfood extends ArrayAdapter<String>{
    public Myfood(@NonNull Context context){
        super(context,R.layout.itlistfood,dish);
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View view =getLayoutInflater().inflate(R.layout.itlistfood,parent,false);
        ImageView i;
        TextView t1,t2;
        t1=view.findViewById(R.id.textView);
        t2=view.findViewById(R.id.textView2);
        i=view.findViewById(R.id.imageView3);
        t1.setText(dish[position]);
        t2.setText(rate[position]);
        i.setImageDrawable(getDrawable(img[position]));

        return view;
    }
    }

}