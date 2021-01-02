package com.example.bbdfootprint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class staact extends AppCompatActivity {
    private Button buttonba;
    private Button buttonl;
    private Button buttonr;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staact);
        initialize(savedInstanceState);
        initializeLogic();
    }
    private void initialize(Bundle savedInstanceState){
        buttonba = (Button) findViewById(R.id.buttonba);
        buttonl = (Button) findViewById(R.id.buttonl);
        buttonr = (Button) findViewById(R.id.buttonr);
        image = (ImageView) findViewById(R.id.image);

        buttonba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonba.setVisibility(View.GONE);
                image.setVisibility(View.GONE);
                buttonl.setVisibility(View.VISIBLE);
                buttonr.setVisibility(View.VISIBLE);
            }
        });
        buttonl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://firebasestorage.googleapis.com/v0/b/bbd-footprint.appspot.com/o/stadium%2Fleftstag.jpg?alt=media&token=cb74d62b-50f1-4a08-a93b-b2155f676710";//Retrieved url as mentioned above

                Glide.with(getApplicationContext()).load(url).into(image);
                buttonba.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
                buttonl.setVisibility(View.GONE);
                buttonr.setVisibility(View.GONE);

            }
        });
        buttonr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://firebasestorage.googleapis.com/v0/b/bbd-footprint.appspot.com/o/stadium%2Frightstag.jpg?alt=media&token=23c28135-3fac-4c95-bb42-5256fc611c6e";//Retrieved url as mentioned above

                Glide.with(getApplicationContext()).load(url).into(image);
                buttonba.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
                buttonl.setVisibility(View.GONE);
                buttonr.setVisibility(View.GONE);

            }
        });
    }
    private void initializeLogic(){
        image.setVisibility(View.GONE);
        buttonba.setVisibility(View.GONE);
    }
}
