package com.firejobcourse.apps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
<<<<<<< HEAD
import android.widget.Button;
=======
>>>>>>> d957cfdfa0be153e71b890366d83a72b63a77c58
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeAct extends AppCompatActivity {
    ImageView btn_lokers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
<<<<<<< HEAD

        ImageView btn_loker;

        btn_loker=findViewById(R.id.btn_loker);

        btn_loker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gotoloker= new Intent(HomeAct.this, MenuLoker.class);
                startActivity(gotoloker);
=======
        btn_lokers=findViewById(R.id.btn_loker);
        btn_lokers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gotosignin= new Intent(HomeAct.this, MainLoker.class);
                startActivity(gotosignin);
>>>>>>> d957cfdfa0be153e71b890366d83a72b63a77c58
            }
        });
    }
}
