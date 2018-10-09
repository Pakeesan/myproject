package com.example.pakeesan.secondproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HideshowActivity extends AppCompatActivity {

    public void hide(View view)
    {
        TextView t1=(TextView)findViewById(R.id.Te);
        t1.setVisibility(View.INVISIBLE);
    }
    public void show(View view)
    {
        TextView t1=(TextView)findViewById(R.id.Te);
        t1.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hideshow);
    }
}
