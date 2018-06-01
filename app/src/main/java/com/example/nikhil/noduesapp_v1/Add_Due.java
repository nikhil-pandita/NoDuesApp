package com.example.nikhil.noduesapp_v1;

import android.content.Intent;
import android.icu.text.SimpleDateFormat;
import android.icu.util.Calendar;
import android.icu.util.TimeZone;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;

public class Add_Due extends AppCompatActivity {

    TextView Time,Rollno;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__due);

        Rollno = (TextView)findViewById(R.id.edt1);
        Time = (TextView)findViewById(R.id.Time);
        button = (Button)findViewById(R.id.button);

        Calendar c = Calendar.getInstance();
        SimpleDateFormat df = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
        String formattedDate = df.format(c.getTime());
        Time.setText(formattedDate);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),Form_Due.class);
                startActivity(i);
            }

        });
        /*long date = System.currentTimeMillis();
        SimpleDateFormat sdf = sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String dateString = sdf.format(date);
        Time.setText(dateString);*/


       /* Date date = new Date(location.getTime());
        DateFormat dateFormat = android.text.format.DateFormat.getDateFormat(getApplicationContext());
        Time.setText("Time: " + dateFormat.format(date));*/
    }


}
