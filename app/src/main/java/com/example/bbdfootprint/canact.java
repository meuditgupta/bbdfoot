package com.example.bbdfootprint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class canact extends AppCompatActivity {
    private Button buttonbkcan;
    private Button buttonccd1;
    private Button buttoncang;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canact);
        initialize(savedInstanceState);
        initializeLogic();
    }
    private void initialize(Bundle savedInstanceState) {
        buttonbkcan = (Button) findViewById(R.id.buttonbkcan);
        buttonccd1 = (Button) findViewById(R.id.buttonccd1);
        buttoncang = (Button) findViewById(R.id.buttoncang);
        image = (ImageView) findViewById(R.id.image);

        buttonbkcan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonbkcan.setVisibility(View.GONE);
                image.setVisibility(View.GONE);
                buttoncang.setVisibility(View.VISIBLE);
                buttonccd1.setVisibility(View.VISIBLE);
            }
        });

        buttoncang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://firebasestorage.googleapis.com/v0/b/bbd-footprint.appspot.com/o/canteen%2Fcang.png?alt=media&token=eebaeb82-2b86-4be5-8664-65764a71c6c0";//Retrieved url as mentioned above

                Glide.with(getApplicationContext()).load(url).into(image);
                buttonbkcan.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
                buttoncang.setVisibility(View.GONE);
                buttonccd1.setVisibility(View.GONE);
            }

        });

        buttonccd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://firebasestorage.googleapis.com/v0/b/bbd-footprint.appspot.com/o/canteen%2Fccd1.png?alt=media&token=9dc62bcc-2399-422c-9aec-742bfed4701a";//Retrieved url as mentioned above

                Glide.with(getApplicationContext()).load(url).into(image);
                buttonbkcan.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
                buttoncang.setVisibility(View.GONE);
                buttonccd1.setVisibility(View.GONE);
            }
        });

    }
    private void initializeLogic() {
        image.setVisibility(View.GONE);
        buttonbkcan.setVisibility(View.GONE);
    }
}
