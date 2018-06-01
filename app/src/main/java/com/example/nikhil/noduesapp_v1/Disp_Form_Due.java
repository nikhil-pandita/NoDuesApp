package com.example.nikhil.noduesapp_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.nikhil.noduesapp_v1.Adapters.DispDueAdapter;
import com.example.nikhil.noduesapp_v1.Adapters.UsersAdapter;

import java.util.ArrayList;

public class Disp_Form_Due extends AppCompatActivity {

    ArrayList<Nodues_DispInfo> arrayoffaults = new ArrayList<Nodues_DispInfo>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_disp__form__due);

        DispDueAdapter adapter = new DispDueAdapter(this, arrayoffaults);

        ListView listView2 = (ListView) findViewById(R.id.lvIDispDue);

        Nodues_DispInfo noduesdisp1 = new Nodues_DispInfo("Accounts","Nil");
        Nodues_DispInfo noduesdisp2 = new Nodues_DispInfo("Hostel","Nil");
        Nodues_DispInfo noduesdisp3 = new Nodues_DispInfo("Library","I");
        Nodues_DispInfo noduesdisp4 = new Nodues_DispInfo("Sports","II");
        Nodues_DispInfo noduesdisp5 = new Nodues_DispInfo("Academics","Nil");

        arrayoffaults.add(noduesdisp1);
        arrayoffaults.add(noduesdisp2);
        arrayoffaults.add(noduesdisp3);
        arrayoffaults.add(noduesdisp4);
        arrayoffaults.add(noduesdisp5);

        listView2.setAdapter(adapter);

        listView2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id) {
                Intent i = new Intent(getApplicationContext(),nodues_show_all.class);
                startActivity(i);
            }
        });

    }

}
