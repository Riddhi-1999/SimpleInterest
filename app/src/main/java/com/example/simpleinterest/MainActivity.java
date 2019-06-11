package com.example.simpleinterest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editText,editText1,editText2;
    Button buton;
    int p,r,t,si;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=findViewById(R.id.editText);
        editText1=findViewById(R.id.editText1);
        editText2=findViewById(R.id.editText2);
        buton=findViewById(R.id.button);

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                si=0;
                String s=editText.getText().toString().trim();
                p=Integer.parseInt(s);

                String s2=editText1.getText().toString().trim();
                r=Integer.parseInt(s2);

                String s3=editText2.getText().toString().trim();
                t=Integer.parseInt(s3);

                si=(p*r*t)/100;
                String s1=String.valueOf(si);
                Toast.makeText(MainActivity.this, "SIMPLE INTEREST IS " +s1, Toast.LENGTH_SHORT).show();


            }
        });

    }
}
