package com.example.bbdfootprint;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    private double h = 0;
    private EditText editText;
    private Button button;
    private Button buttoninfo;
    private EditText editTextcour;
    private Intent sec = new Intent();
    private Intent guid = new Intent();
    DatabaseReference reffer;
    logins logs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize(savedInstanceState);
        initializeLogic();
    }

    private void initializeLogic(Bundle savedinstancState) {
    }

    @SuppressLint("WrongViewCast")
    private void initialize(Bundle savedInstanceState){
        editText = (EditText) findViewById(R.id.editText);
        editTextcour = (EditText) findViewById(R.id.editTextcour);
        button = (Button) findViewById(R.id.button);
        buttoninfo = (Button) findViewById(R.id.buttoninfo);
        logs = new logins();
        reffer = FirebaseDatabase.getInstance().getReference().child("logins");

        buttoninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                guid.setClass(getApplicationContext(),guide.class);
                startActivity(guid);

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if ((((2180212078d > Double.parseDouble(editText.getText().toString()))&&(2180212000d < Double.parseDouble(editText.getText().toString())))&&"mca".equals(editTextcour.getText().toString()))||(((1170211363 > Double.parseDouble(editText.getText().toString()))&&(1170211000 < Double.parseDouble(editText.getText().toString())))&& "bca".equals(editTextcour.getText().toString()))){
                    int rooln = Integer.parseInt(editText.getText().toString().trim());
                    logs.setCourse(editTextcour.getText().toString().trim());
                    logs.setRooln(rooln);
                    reffer.push().setValue(logs);
                    sec.setClass(getApplicationContext(),new3.class);
                    startActivity(sec);
                }
                else {
                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    private void initializeLogic(){
    }

}
