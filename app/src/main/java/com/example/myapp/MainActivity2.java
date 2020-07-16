package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.CellSignalStrength;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    EditText ename,email,epass,epass2,elast,ephone;
    Spinner sp;
    String ar[] = {"India","Afghanistan","Bangladesh","Canada","Denmark","Egypt","Finland","Germany","Hawaii","Indonesia","Japan","Kenya","Libreia","Malaysia","Maldives","Mexico","Nepal","Oman","Pakistan","Qatar","Russia","Singapore","Turkey","Ukraine","Zimbabwe"};
    RadioGroup rgroup;
    CheckBox cb;
    Button b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ename=findViewById(R.id.tname);
        elast=findViewById(R.id.tlast);
        email=findViewById(R.id.tmail);
        epass=findViewById(R.id.tpass);
        epass2=findViewById(R.id.tpass2);
        ephone=findViewById(R.id.tphone);
        sp=findViewById(R.id.spinner);
        rgroup=findViewById(R.id.rgroup);
        cb=findViewById(R.id.checkBox);
        b=findViewById(R.id.subbtn);
        ArrayAdapter ard = new ArrayAdapter(this,android.R.layout.simple_spinner_item,ar);
        ard.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(ard);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (cb.isChecked()){
                    String a,b,c,d,e,f,g,h;
                    a=ename.getText().toString();
                    b=elast.getText().toString();
                    c=email.getText().toString();
                    d=epass.getText().toString();
                    e=epass2.getText().toString();
                    f=ephone.getText().toString();
                    g=sp.getSelectedItem().toString();

                    if (d.equals(e)){
                        RadioButton rb =findViewById(rgroup.getCheckedRadioButtonId());
                        if (rb!=null){
                            h=rb.getText().toString();
                            if(a.equals(null) || b.equals(null) || c.equals(null) || d.equals(null) || e.equals(null) || f.equals(null) || g.equals(null) || h.equals(null)){
                                Toast.makeText(MainActivity2.this, "Plz fill all details", Toast.LENGTH_SHORT).show();

                            }
                            else{

                                Intent i =new Intent(MainActivity2.this,MainActivity3.class);
                                startActivity(i);

                            }
                        }else {
                            Toast.makeText(MainActivity2.this, "Please Select Gender", Toast.LENGTH_SHORT).show();
                        }
                    }else {
                        Toast.makeText(MainActivity2.this, "Password Doesn't Match", Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(MainActivity2.this, "Please Select Terms & Conditions", Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
}