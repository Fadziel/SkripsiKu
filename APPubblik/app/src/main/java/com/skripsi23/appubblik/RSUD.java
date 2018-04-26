package com.skripsi23.appubblik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class RSUD extends AppCompatActivity {

    ImageButton androidImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rsud);

        androidImageButton = (ImageButton) findViewById(R.id.BPJS);


        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View m) {

                // TODO Auto-generated method stub

                Intent intent = new Intent(getApplicationContext(), BPJS.class);

                startActivity(intent);

            }
        });

        androidImageButton = (ImageButton) findViewById(R.id.Gmap);


        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View n) {

                // TODO Auto-generated method stub

                Intent intent = new Intent(getApplicationContext(), RSUDMAP.class);

                startActivity(intent);

            }
        });

    }
}
