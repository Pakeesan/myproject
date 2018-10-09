package com.example.pakeesan.secondproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn =(Button)findViewById(R.id.Open_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent myIntent=new Intent(MainActivity.this,welcomeActivity.class);
                startActivity(myIntent);
            }
        });

        Button sendbtn=(Button)findViewById(R.id.Send_btn);
        sendbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Intent myIntent=new Intent(Intent.ACTION_VIEW);
                myIntent.setData(Uri.parse("sms:"));
                    myIntent.putExtra("sms_body","in using");
                    startActivity(myIntent);

            }
        });

        Button exe=(Button)findViewById(R.id.Ex_btn);
        exe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myIntent=new Intent(MainActivity.this,ExerciseActivity.class);
                startActivity(myIntent);
            }
        });
    }
}
