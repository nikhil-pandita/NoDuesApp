package com.example.nikhil.noduesapp_v1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Remark_NoDue extends AppCompatActivity {

    Button AddRemark;
    EditText edt2;
    private int maxLines;
    private String lastValue = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_remark__no_due);

        AddRemark = (Button)findViewById(R.id.AddR);
        edt2 = (EditText)findViewById(R.id.edt2) ;

        AddRemark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                  Toast.makeText(getApplicationContext(), "Your Nodues Entry has been Added.",
                        Toast.LENGTH_LONG).show();

                edt2.setText("");



                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i=new Intent(Remark_NoDue.this,MainActivity.class);
                        startActivity(i);
                    }
                }, 1500);

                //Server side implementation using JSON / Volley requests.

            }

        });

    }
}
