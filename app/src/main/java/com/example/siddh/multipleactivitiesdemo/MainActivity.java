package com.example.siddh.multipleactivitiesdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView myListview = (ListView) findViewById(R.id.myListView);
        final ArrayList<String> friends = new ArrayList<String>();
        friends.add("Siddhant");
        friends.add("Gera");
        friends.add("Shubham");
        friends.add("Arpit");
        friends.add("Prakhar");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String> (this, android.R.layout.simple_list_item_1, friends);
        myListview.setAdapter(arrayAdapter);

        myListview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("Friend", friends.get(position));
                startActivity(intent);

            }

        });
    }
}
