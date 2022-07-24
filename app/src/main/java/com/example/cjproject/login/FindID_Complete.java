package com.example.cjproject.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cjproject.R;

public class FindID_Complete extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_find_id_complete);

        Button FindPasswordButton2 = findViewById(R.id.btn_findpw2);
        FindPasswordButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FindPassword.class);
                startActivity(intent);
            }
        });

        Button LoginButton3 = findViewById(R.id.btn_ToLogin_3);
        LoginButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Login_main.class);
                startActivity(intent);
            }
        });

    }
}