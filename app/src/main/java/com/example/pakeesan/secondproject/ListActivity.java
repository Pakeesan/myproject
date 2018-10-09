package com.example.pakeesan.secondproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        ListView list1=(ListView)findViewById(R.id.List1);
        final ArrayList<String> friends=new ArrayList<String>();
        friends.add("pakee");
        friends.add("rakav");
        friends.add("ayi");
        friends.add("gowrii");
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,friends);
        list1.setAdapter(adapter);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
                Toast.makeText(getApplicationContext(),"hello"+friends.get(position),Toast.LENGTH_SHORT).show();

            }
        });
    }
}
