package com.example.bbdfootprint;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class noticescr extends AppCompatActivity {
    TextView textViewn1,textViewn2, textViewn3,textViewn4;
    Button buttonrs;
    DatabaseReference reffn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticescr);

        textViewn1 = (TextView) findViewById(R.id.textViewn1);
        textViewn2 = (TextView) findViewById(R.id.textViewn2);
        textViewn3 = (TextView) findViewById(R.id.textViewn3);
        textViewn4 = (TextView) findViewById(R.id.textViewn4);
        buttonrs = (Button) findViewById(R.id.buttonrs);


        reffn = FirebaseDatabase.getInstance().getReference().child("notices").child("notes");
        reffn.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                String nto = dataSnapshot.child("nto").getValue().toString();
                String ntto = dataSnapshot.child("ntto").getValue().toString();
                String ntth = dataSnapshot.child("ntth").getValue().toString();
                String ntf = dataSnapshot.child("ntf").getValue().toString();

                textViewn1.setText(nto);
                textViewn2.setText(ntto);
                textViewn3.setText(ntth);
                textViewn4.setText(ntf);


            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        buttonrs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reffn = FirebaseDatabase.getInstance().getReference().child("notices").child("notes");
                reffn.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String nto = dataSnapshot.child("nto").getValue().toString();
                        String ntto = dataSnapshot.child("ntto").getValue().toString();
                        String ntth = dataSnapshot.child("ntth").getValue().toString();
                        String ntf = dataSnapshot.child("ntf").getValue().toString();

                        textViewn1.setText(nto);
                        textViewn2.setText(ntto);
                        textViewn3.setText(ntth);
                        textViewn4.setText(ntf);


                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });



    }
}
