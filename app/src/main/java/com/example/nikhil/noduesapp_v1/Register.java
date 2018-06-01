package com.example.nikhil.noduesapp_v1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Register extends AppCompatActivity {

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        button = (Button) findViewById(R.id.RegisterButton);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Toast.makeText(getApplicationContext(), "User Registered Succesfully!",
                        Toast.LENGTH_LONG).show();


                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Intent i = new Intent(Register.this, MainActivity.class);
                        startActivity(i);
                    }
                }, 1500);
            }
        });
    }
}
