package com.example.nikhil.noduesapp_v1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class nodues_show_all extends AppCompatActivity {

    Button GoHome;
    Button GoForm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nodues_show_all);

        GoForm = (Button) findViewById(R.id.GoForm);
        GoHome = (Button) findViewById(R.id.GoHome);

        GoHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "Loggin Out",
                        Toast.LENGTH_LONG).show();


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i = new Intent(nodues_show_all.this, MainActivity.class);
                        startActivity(i);
                    }
                }, 1500);


            }
        });
        GoForm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(), Disp_Form_Due.class);
                startActivity(i);
            }

        });

    }
}
