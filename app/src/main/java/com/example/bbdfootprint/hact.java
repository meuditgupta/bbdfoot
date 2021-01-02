package com.example.bbdfootprint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
public class hact extends AppCompatActivity {
    private Button buttonbac;
    private Button buttong;
    private Button buttonf1;
    private Button buttonf2;
    private Button buttonf3;
    private Button buttonf4;
    private Button buttonf5;
    private Button buttonf6;
    private ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hact);
        initialize(savedInstanceState);
        initializeLogic();
    }
    private void initialize(Bundle saveedInstanceState) {
        buttonbac = (Button) findViewById(R.id.buttonbac);
        buttong = (Button) findViewById(R.id.buttong);
        buttonf1 = (Button) findViewById(R.id.buttonf1);
        buttonf2 = (Button) findViewById(R.id.buttonf2);
        buttonf3 = (Button) findViewById(R.id.buttonf3);
        buttonf4 = (Button) findViewById(R.id.buttonf4);
        buttonf5 = (Button) findViewById(R.id.buttonf5);
        buttonf6 = (Button) findViewById(R.id.buttonf6);
        image = (ImageView) findViewById(R.id.image);

        buttonbac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonbac.setVisibility(View.GONE);
                image.setVisibility(View.GONE);
                buttong.setVisibility(View.VISIBLE);
                buttonf1.setVisibility(View.VISIBLE);
                buttonf2.setVisibility(View.VISIBLE);
                buttonf3.setVisibility(View.VISIBLE);
                buttonf4.setVisibility(View.VISIBLE);
                buttonf5.setVisibility(View.VISIBLE);
                buttonf6.setVisibility(View.VISIBLE);
            }
        });
        buttong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://firebasestorage.googleapis.com/v0/b/bbd-footprint.appspot.com/o/grounde.jpg?alt=media&token=818672cf-023e-4e7c-a7db-be36c6e4d86f";//Retrieved url as mentioned above

                Glide.with(getApplicationContext()).load(url).into(image);


                buttonbac.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
                buttong.setVisibility(View.GONE);
                buttonf1.setVisibility(View.GONE);
                buttonf2.setVisibility(View.GONE);
                buttonf3.setVisibility(View.GONE);
                buttonf4.setVisibility(View.GONE);
                buttonf5.setVisibility(View.GONE);
                buttonf6.setVisibility(View.GONE);
            }
        });
        buttonf1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://firebasestorage.googleapis.com/v0/b/bbd-footprint.appspot.com/o/floor%201e.jpg?alt=media&token=a2545f73-875e-4f76-ba57-ea31e6a13839";//Retrieved url as mentioned above

                Glide.with(getApplicationContext()).load(url).into(image);
                buttonbac.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
                buttong.setVisibility(View.GONE);
                buttonf1.setVisibility(View.GONE);
                buttonf2.setVisibility(View.GONE);
                buttonf3.setVisibility(View.GONE);
                buttonf4.setVisibility(View.GONE);
                buttonf5.setVisibility(View.GONE);
                buttonf6.setVisibility(View.GONE);
            }
        });
        buttonf2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://firebasestorage.googleapis.com/v0/b/bbd-footprint.appspot.com/o/floor%202e.jpg?alt=media&token=19bbba3e-4e83-4ccd-b0ef-f585904aeb7f";//Retrieved url as mentioned above

                Glide.with(getApplicationContext()).load(url).into(image);

                buttonbac.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
                buttong.setVisibility(View.GONE);
                buttonf1.setVisibility(View.GONE);
                buttonf2.setVisibility(View.GONE);
                buttonf3.setVisibility(View.GONE);
                buttonf4.setVisibility(View.GONE);
                buttonf5.setVisibility(View.GONE);
                buttonf6.setVisibility(View.GONE);
            }
        });
        buttonf3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://firebasestorage.googleapis.com/v0/b/bbd-footprint.appspot.com/o/thirde.jpg?alt=media&token=b05bd050-d64d-4c87-8a87-812665a1e0c6";//Retrieved url as mentioned above

                Glide.with(getApplicationContext()).load(url).into(image);
                buttonbac.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
                buttong.setVisibility(View.GONE);
                buttonf1.setVisibility(View.GONE);
                buttonf2.setVisibility(View.GONE);
                buttonf3.setVisibility(View.GONE);
                buttonf4.setVisibility(View.GONE);
                buttonf5.setVisibility(View.GONE);
                buttonf6.setVisibility(View.GONE);
            }
        });
        buttonf4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://firebasestorage.googleapis.com/v0/b/bbd-footprint.appspot.com/o/arcfloor4re.jpg?alt=media&token=ad809f06-996c-4762-a91a-921d79cab72f";//Retrieved url as mentioned above

                Glide.with(getApplicationContext()).load(url).into(image);
                buttonbac.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
                buttong.setVisibility(View.GONE);
                buttonf1.setVisibility(View.GONE);
                buttonf2.setVisibility(View.GONE);
                buttonf3.setVisibility(View.GONE);
                buttonf4.setVisibility(View.GONE);
                buttonf5.setVisibility(View.GONE);
                buttonf6.setVisibility(View.GONE);
            }
        });
        buttonf5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://firebasestorage.googleapis.com/v0/b/bbd-footprint.appspot.com/o/hotfloor5r.jpg?alt=media&token=4dd291e6-b1ad-4cba-b7d0-74e2e76eee7c";//Retrieved url as mentioned above

                Glide.with(getApplicationContext()).load(url).into(image);
                buttonbac.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
                buttong.setVisibility(View.GONE);
                buttonf1.setVisibility(View.GONE);
                buttonf2.setVisibility(View.GONE);
                buttonf3.setVisibility(View.GONE);
                buttonf4.setVisibility(View.GONE);
                buttonf5.setVisibility(View.GONE);
                buttonf6.setVisibility(View.GONE);
            }
        });
        buttonf6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url="https://firebasestorage.googleapis.com/v0/b/bbd-footprint.appspot.com/o/floor6e.jpg?alt=media&token=12651258-ba4e-4686-9a72-a16eabb55cb5";//Retrieved url as mentioned above

                Glide.with(getApplicationContext()).load(url).into(image);
                buttonbac.setVisibility(View.VISIBLE);
                image.setVisibility(View.VISIBLE);
                buttong.setVisibility(View.GONE);
                buttonf1.setVisibility(View.GONE);
                buttonf2.setVisibility(View.GONE);
                buttonf3.setVisibility(View.GONE);
                buttonf4.setVisibility(View.GONE);
                buttonf5.setVisibility(View.GONE);
                buttonf6.setVisibility(View.GONE);
            }
        });
    }
    private void initializeLogic() {
        image.setVisibility(View.GONE);
        buttonbac.setVisibility(View.GONE);
    }
}
