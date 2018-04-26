package com.skripsi23.appubblik;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button msk = (Button) findViewById(R.id.masuk);


        msk.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View r) {

                // TODO Auto-generated method stub

                Intent intent = new Intent(getApplicationContext(), Home.class);

                startActivity(intent);


            }
        });
    }

}