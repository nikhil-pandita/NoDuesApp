package com.example.nikhil.noduesapp_v1;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.DatePicker;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class Check_Due extends Activity implements View.OnClickListener {

    Button chekinfo;
    EditText EdtDOB;
    private DatePickerDialog DOBDialog;
    private SimpleDateFormat dateFormatter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check__due);
        findViewsById();
        setDateTimeField();

        chekinfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Disp_Form_Due.class);
                startActivity(i);
            }
        });

    }

    private void findViewsById() {
        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        chekinfo = (Button)findViewById(R.id.CheckInfo);
        EdtDOB = (EditText) findViewById(R.id.edtDOB);
        EdtDOB.setInputType(InputType.TYPE_NULL);
        EdtDOB.requestFocus();
    }

    private void setDateTimeField() {
        EdtDOB.setOnClickListener(this);

        Calendar newCalendar = Calendar.getInstance();

            DOBDialog = new DatePickerDialog(this, new OnDateSetListener() {

                public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                    Calendar newDate = Calendar.getInstance();
                    newDate.set(year, monthOfYear, dayOfMonth);
                    EdtDOB.setText(dateFormatter.format(newDate.getTime()));
                }

            }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));

        }

    public void onClick(View view) {
        if(view == EdtDOB) {
            DOBDialog.show();
        }
    }
    }




