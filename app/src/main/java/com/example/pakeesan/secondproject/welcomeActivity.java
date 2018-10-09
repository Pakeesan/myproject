package com.example.pakeesan.secondproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class welcomeActivity extends AppCompatActivity {
    public void sky(View view)
    {
        ImageView img1st=(ImageView)findViewById(R.id.img1);
        img1st.animate().alpha(0).setDuration(4000);
        ImageView img2nd=(ImageView)findViewById(R.id.img2);
        img2nd.animate().alpha(1).setDuration(4000);
        img2nd.animate().translationXBy(1000).setDuration(6000);
        img1st.animate().rotationYBy(3600).setDuration(6000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
}
