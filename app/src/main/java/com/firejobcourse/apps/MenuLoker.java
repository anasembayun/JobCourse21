package com.firejobcourse.apps;

import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;

public class MenuLoker extends AppCompatActivity {
    Button btn_continoue;
    LinearLayout btn_back;
    EditText username, password, email_address;
    String USERNAME_KEY= "usernamekey";
    String Username_key= "";
    DatabaseReference reference;
}