package com.skripsi23.appubblik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Home extends AppCompatActivity {

    ImageButton androidImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        androidImageButton =(ImageButton) findViewById(R.id.RSUD);


        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View r) {

                // TODO Auto-generated method stub

                Intent intent = new Intent(getApplicationContext(), RSUD.class);

                startActivity(intent);

            }
        });

        androidImageButton =(ImageButton) findViewById(R.id.Kuliner);


        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View s) {

                // TODO Auto-generated method stub

                Intent intent = new Intent(getApplicationContext(), Kuliner.class);

                startActivity(intent);

            }
        });

        androidImageButton =(ImageButton) findViewById(R.id.Shop);


        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View t) {

                // TODO Auto-generated method stub

                Intent intent = new Intent(getApplicationContext(), Shop.class);

                startActivity(intent);

            }
        });

        androidImageButton =(ImageButton) findViewById(R.id.EKTP);


        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View u) {

                // TODO Auto-generated method stub

                Intent intent = new Intent(getApplicationContext(), EKTP.class);

                startActivity(intent);

            }
        });

        androidImageButton =(ImageButton) findViewById(R.id.PAJAK);


        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View d) {

                // TODO Auto-generated method stub

                Intent intent = new Intent(getApplicationContext(), Pajak.class);

                startActivity(intent);

            }
        });

        androidImageButton =(ImageButton) findViewById(R.id.PERIZINAN);


        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View p) {

                // TODO Auto-generated method stub

                Intent intent = new Intent(getApplicationContext(), Polisi.class);

                startActivity(intent);

            }
        });

        androidImageButton =(ImageButton) findViewById(R.id.WISATA);


        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View d) {

                // TODO Auto-generated method stub

                Intent intent = new Intent(getApplicationContext(), Wisata.class);

                startActivity(intent);

            }
        });

        androidImageButton =(ImageButton) findViewById(R.id.PERBANKAN);


        androidImageButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View p) {

                // TODO Auto-generated method stub

                Intent intent = new Intent(getApplicationContext(), Perbankan.class);

                startActivity(intent);

            }
        });
    }

}
