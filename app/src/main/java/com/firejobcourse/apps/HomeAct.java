package com.firejobcourse.apps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeAct extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        ImageView btn_loker;

        btn_loker=findViewById(R.id.btn_loker);

        btn_loker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gotoloker= new Intent(HomeAct.this, MenuLoker.class);
                startActivity(gotoloker);
            }
        });
    }
}
