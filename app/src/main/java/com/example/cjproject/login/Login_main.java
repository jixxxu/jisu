package com.example.cjproject.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cjproject.R;
import com.example.cjproject.join.Join_Main;
import com.example.cjproject.task.Dsla;
import com.example.cjproject.task.permissionset;

public class Login_main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_main);

        Button FindIDButton = findViewById(R.id.btn_findid);
        FindIDButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FindID.class);
                startActivity(intent);
            }
        });

        Button FindPasswordButton = findViewById(R.id.btn_findpw);
        FindPasswordButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), FindPassword.class);
                startActivity(intent);
            }
        });
        Button btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), permissionset.class);
                startActivity(intent);
            }
        });



        Button GoJoinButton = findViewById(R.id.btn_ToJoin_2);
        GoJoinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Join_Main.class);
                startActivity(intent);
            }
        });

    }
}