package com.firejobcourse.apps;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeAct extends AppCompatActivity {
    ImageView btn_lokers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btn_lokers=findViewById(R.id.btn_loker);
        btn_lokers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent gotosignin= new Intent(HomeAct.this, MainLoker.class);
                startActivity(gotosignin);
            }
        });
    }
}
