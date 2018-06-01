package com.example.nikhil.noduesapp_v1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void OnAdd(View v){
        Intent i=new Intent(MainActivity.this,Add_Due.class);
        startActivity(i);
    }

    public void OnCheck (View v){
        Intent i=new Intent(MainActivity.this,Check_Due.class);
        startActivity(i);
    }

    public void OnRegister (View v){
        Intent i = new Intent(MainActivity.this,Register.class);
        startActivity(i);
    }
}
