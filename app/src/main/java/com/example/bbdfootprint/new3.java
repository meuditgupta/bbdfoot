package com.example.bbdfootprint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class new3 extends AppCompatActivity {
    private EditText edittext3search;
    private Button allsearch;
    private Button stablue;
    private ImageView himageView;
    private Button hblue;
    private Button uniblue;
    private Button canblue;
    private ImageView staimageview2;
    private Button nitblue;
    private ImageView canimageview4;
    private ImageView unimageview5;
    private ImageView nitimageview3;
    private Button showsta;
    private Button showh;
    private Button showuni;
    private Button shownit;
    private Button showcan;
    private Button fedb;
    private Button buttonnoti;


    private Intent hbpri = new Intent();
    private Intent nitbpri = new Intent();
    private Intent stabpri = new Intent();
    private Intent canbpri = new Intent();
    private Intent unibpri = new Intent();
    private Intent fedin = new Intent();
    private Intent notein = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new3);
        initialize(savedInstanceState);
        initializeLogic();
    }

    private void initialize(Bundle savedInstanceState) {
        edittext3search = (EditText) findViewById(R.id.editText3search);
        allsearch = (Button) findViewById(R.id.allsearch);
        stablue = (Button) findViewById(R.id.stablue);
        hblue = (Button) findViewById(R.id.hblue);
        uniblue = (Button) findViewById(R.id.uniblue);
        canblue = (Button) findViewById(R.id.canblue);
        nitblue = (Button) findViewById(R.id.nitblue);
        staimageview2 = (ImageView) findViewById(R.id.staimageView2);
        himageView = (ImageView) findViewById(R.id.himageView);
        canimageview4 = (ImageView) findViewById(R.id.canimageView4);
        unimageview5 = (ImageView) findViewById(R.id.uniimageView5);
        nitimageview3 = (ImageView) findViewById(R.id.nitimageView3);
        showsta = (Button) findViewById(R.id.showsta);
        showh = (Button) findViewById(R.id.showh);
        showuni = (Button) findViewById(R.id.showuni);
        showcan = (Button) findViewById(R.id.showcan);
        shownit = (Button) findViewById(R.id.shownit);
        fedb = (Button) findViewById(R.id.fedb);
        buttonnoti = (Button) findViewById(R.id.buttonnoti);

        allsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (("architcture".equals(edittext3search.getText().toString()) || "bca".equals(edittext3search.getText().toString()))||("hblock".equals(edittext3search.getText().toString())||"hotel management".equals(edittext3search.getText().toString()))) {
                    stablue.setVisibility(View.GONE);
                    hblue.setVisibility(View.VISIBLE);
                    uniblue.setVisibility(View.GONE);
                    canblue.setVisibility(View.GONE);
                    nitblue.setVisibility(View.GONE);
                    himageView.setVisibility(View.VISIBLE);
                    staimageview2.setVisibility(View.GONE);
                    canimageview4.setVisibility(View.GONE);
                    unimageview5.setVisibility(View.GONE);
                    nitimageview3.setVisibility(View.GONE);
                }
                else {
                    if (("nitm".equals(edittext3search.getText().toString()) || "accounts department".equals(edittext3search.getText().toString())) || ("btech".equals(edittext3search.getText().toString()) || "scholership department".equals(edittext3search.getText().toString()))) {
                        stablue.setVisibility(View.GONE);
                        hblue.setVisibility(View.GONE);
                        uniblue.setVisibility(View.GONE);
                        canblue.setVisibility(View.GONE);
                        nitblue.setVisibility(View.VISIBLE);
                        himageView.setVisibility(View.GONE);
                        staimageview2.setVisibility(View.GONE);
                        canimageview4.setVisibility(View.GONE);
                        unimageview5.setVisibility(View.GONE);
                        nitimageview3.setVisibility(View.VISIBLE);
                    } else {
                        if (("stadium".equals(edittext3search.getText().toString()) || "match".equals(edittext3search.getText().toString())) || ("consert".equals(edittext3search.getText().toString()) || "playground".equals(edittext3search.getText().toString()))) {
                            stablue.setVisibility(View.VISIBLE);
                            hblue.setVisibility(View.GONE);
                            uniblue.setVisibility(View.GONE);
                            canblue.setVisibility(View.GONE);
                            nitblue.setVisibility(View.GONE);
                            himageView.setVisibility(View.GONE);
                            staimageview2.setVisibility(View.VISIBLE);
                            canimageview4.setVisibility(View.GONE);
                            unimageview5.setVisibility(View.GONE);
                            nitimageview3.setVisibility(View.GONE);
                        } else {
                            if (("university".equals(edittext3search.getText().toString()) || "examnation department".equals(edittext3search.getText().toString())) || ("mba".equals(edittext3search.getText().toString()) || "library".equals(edittext3search.getText().toString()))) {
                                stablue.setVisibility(View.GONE);
                                hblue.setVisibility(View.GONE);
                                uniblue.setVisibility(View.VISIBLE);
                                canblue.setVisibility(View.GONE);
                                nitblue.setVisibility(View.GONE);
                                himageView.setVisibility(View.GONE);
                                staimageview2.setVisibility(View.GONE);
                                canimageview4.setVisibility(View.GONE);
                                unimageview5.setVisibility(View.VISIBLE);
                                nitimageview3.setVisibility(View.GONE);
                            } else {
                                if (("canteen".equals(edittext3search.getText().toString()) || "temptation".equals(edittext3search.getText().toString())) || ("cafe coffee day".equals(edittext3search.getText().toString()) || "student mall".equals(edittext3search.getText().toString()))) {
                                    stablue.setVisibility(View.GONE);
                                    hblue.setVisibility(View.GONE);
                                    uniblue.setVisibility(View.GONE);
                                    canblue.setVisibility(View.VISIBLE);
                                    nitblue.setVisibility(View.GONE);
                                    himageView.setVisibility(View.GONE);
                                    staimageview2.setVisibility(View.GONE);
                                    canimageview4.setVisibility(View.VISIBLE);
                                    unimageview5.setVisibility(View.GONE);
                                    nitimageview3.setVisibility(View.GONE);
                                } else {
                                    Toast.makeText(getApplicationContext(), "wrong", Toast.LENGTH_SHORT).show();
                                }
                            }
                        }
                    }
                }
            }
        });

        buttonnoti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                notein.setClass(getApplicationContext(), noticescr.class);
                startActivity(notein);

            }
        });

        fedb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fedin.setClass(getApplicationContext(), feedsc.class);
                startActivity(fedin);

            }
        });

        stablue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stabpri.setClass(getApplicationContext(), staact.class);
                startActivity(stabpri);

            }
        });
        hblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hbpri.setClass(getApplicationContext(), hact.class);
                startActivity(hbpri);

            }
        });
        uniblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unibpri.setClass(getApplicationContext(), uniact.class);
                startActivity(unibpri);

            }
        });
        canblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canbpri.setClass(getApplicationContext(), canact.class);
                startActivity(canbpri);

            }
        });
        nitblue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nitbpri.setClass(getApplicationContext(), nitact.class);
                startActivity(nitbpri);

            }
        });
        showsta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stablue.setVisibility(View.VISIBLE);
                hblue.setVisibility(View.GONE);
                uniblue.setVisibility(View.GONE);
                canblue.setVisibility(View.GONE);
                nitblue.setVisibility(View.GONE);
                himageView.setVisibility(View.GONE);
                staimageview2.setVisibility(View.VISIBLE);
                canimageview4.setVisibility(View.GONE);
                unimageview5.setVisibility(View.GONE);
                nitimageview3.setVisibility(View.GONE);

            }
        });
        showh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stablue.setVisibility(View.GONE);
                hblue.setVisibility(View.VISIBLE);
                uniblue.setVisibility(View.GONE);
                canblue.setVisibility(View.GONE);
                nitblue.setVisibility(View.GONE);
                himageView.setVisibility(View.VISIBLE);
                staimageview2.setVisibility(View.GONE);
                canimageview4.setVisibility(View.GONE);
                unimageview5.setVisibility(View.GONE);
                nitimageview3.setVisibility(View.GONE);
            }
        });
        showuni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stablue.setVisibility(View.GONE);
                hblue.setVisibility(View.GONE);
                uniblue.setVisibility(View.VISIBLE);
                canblue.setVisibility(View.GONE);
                nitblue.setVisibility(View.GONE);
                himageView.setVisibility(View.GONE);
                staimageview2.setVisibility(View.GONE);
                canimageview4.setVisibility(View.GONE);
                unimageview5.setVisibility(View.VISIBLE);
                nitimageview3.setVisibility(View.GONE);
            }
        });
        showcan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stablue.setVisibility(View.GONE);
                hblue.setVisibility(View.GONE);
                uniblue.setVisibility(View.GONE);
                canblue.setVisibility(View.VISIBLE);
                nitblue.setVisibility(View.GONE);
                himageView.setVisibility(View.GONE);
                staimageview2.setVisibility(View.GONE);
                canimageview4.setVisibility(View.VISIBLE);
                unimageview5.setVisibility(View.GONE);
                nitimageview3.setVisibility(View.GONE);
            }
        });
        shownit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stablue.setVisibility(View.GONE);
                hblue.setVisibility(View.GONE);
                uniblue.setVisibility(View.GONE);
                canblue.setVisibility(View.GONE);
                nitblue.setVisibility(View.VISIBLE);
                himageView.setVisibility(View.GONE);
                staimageview2.setVisibility(View.GONE);
                canimageview4.setVisibility(View.GONE);
                unimageview5.setVisibility(View.GONE);
                nitimageview3.setVisibility(View.VISIBLE);
            }
        });
    }

    private void initializeLogic() {
        stablue.setVisibility(View.GONE);
        hblue.setVisibility(View.GONE);
        uniblue.setVisibility(View.GONE);
        canblue.setVisibility(View.GONE);
        nitblue.setVisibility(View.GONE);
        himageView.setVisibility(View.GONE);
        staimageview2.setVisibility(View.GONE);
        canimageview4.setVisibility(View.GONE);
        unimageview5.setVisibility(View.GONE);
        nitimageview3.setVisibility(View.GONE);
    }
}
