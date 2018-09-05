package com.hayag.shsstudentregistration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, "Record Submitted!", Toast.LENGTH_SHORT).show();
    }
}
