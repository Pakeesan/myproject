package com.example.pakeesan.secondproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExerciseActivity extends AppCompatActivity {
    public void toast(View view){
        EditText edit=(EditText)findViewById(R.id.EditText);
        Toast.makeText(getApplicationContext(),"hello  "+edit.getText().toString(),Toast.LENGTH_SHORT).show();
        Intent myintent=new Intent(ExerciseActivity.this,ListActivity.class);
        startActivity(myintent);
    }
    public void Hshow(View view)
    {
        Button btn=(Button)findViewById(R.id.Hshow);
        Intent myintent=new Intent(ExerciseActivity.this,HideshowActivity.class);
        startActivity(myintent);
    }
    public void open(View view)
    {
        Button btn=(Button)findViewById(R.id.Hshow);
        Intent myintent=new Intent(ExerciseActivity.this,ConvertActivity.class);
        startActivity(myintent);
    }
    public void open2(View view)
    {
        Button btn=(Button)findViewById(R.id.Fire_btn);
        Intent myintent=new Intent(ExerciseActivity.this,FirerealActivity.class);
        startActivity(myintent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);

        WebView myweb=(WebView)findViewById(R.id.Web1);
        WebSettings setting=myweb.getSettings();
        setting.setJavaScriptEnabled(true);
        myweb.loadUrl("https://bootsnipp.com");
    }
}
