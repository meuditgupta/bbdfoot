package com.example.bbdfootprint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class feedsc extends AppCompatActivity {
    EditText roleditText , fededitText ;
    Button subbutton;
    DatabaseReference reffe;
    studs members;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedsc);

        roleditText = (EditText) findViewById(R.id.roleditText);
        subbutton = (Button) findViewById(R.id.subbutton);
        fededitText = (EditText) findViewById(R.id.fededitText);
        members = new studs();
        reffe = FirebaseDatabase.getInstance().getReference().child("studs");
        subbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (((2180212078d > Double.parseDouble(roleditText.getText().toString()))&&(2180212000d < Double.parseDouble(roleditText.getText().toString()))) || ((1170211363 > Double.parseDouble(roleditText.getText().toString()))&&(1170211000 < Double.parseDouble(roleditText.getText().toString())))) {
                    int rolln = Integer.parseInt(roleditText.getText().toString().trim());
                    members.setFeeds(fededitText.getText().toString().trim());
                    members.setRolln(rolln);
                    reffe.push().setValue(members);
                    Toast.makeText(getApplicationContext(), "feedback send", Toast.LENGTH_LONG).show();

                }
                else {
                    Toast.makeText(getApplicationContext(), "wrong roll no", Toast.LENGTH_SHORT).show();
                }



            }
        });
    }
}
