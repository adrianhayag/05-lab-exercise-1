package com.hayag.shsstudentregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(this);


        Spinner dropdown = findViewById(R.id.spinner1);
        String[] items = new String[]{"ABM", "BSIT", "BSCoE", "BSMT", "MSIT", "MSCS"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Record Submitted!", Toast.LENGTH_SHORT).show();
    }
}
