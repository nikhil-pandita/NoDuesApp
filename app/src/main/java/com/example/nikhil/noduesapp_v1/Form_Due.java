package com.example.nikhil.noduesapp_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.nikhil.noduesapp_v1.Adapters.UsersAdapter;

import java.util.ArrayList;

public class Form_Due extends AppCompatActivity {

    ArrayList<Nodues_F> arrayoffaults = new ArrayList<Nodues_F>();

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form__due);

        UsersAdapter adapter = new UsersAdapter(this, arrayoffaults);

// Create the adapter to convert the array to views

// Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lvItems);

        // Construct the data source

        Nodues_F nodues1 = new Nodues_F("Accounts");
        Nodues_F nodues2 = new Nodues_F("Hostel");
        Nodues_F nodues3 = new Nodues_F("Library");
        Nodues_F nodues4 = new Nodues_F("Sports");
        Nodues_F nodues5 = new Nodues_F("Academics");

        arrayoffaults.add(nodues1);
        arrayoffaults.add(nodues2);
        arrayoffaults.add(nodues3);
        arrayoffaults.add(nodues4);
        arrayoffaults.add(nodues5);


       /* for (int i =0;i<=5;i++)
        {*/

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent i = new Intent(getApplicationContext(),Remark_NoDue.class);
                startActivity(i);
            }
        });

}

}
