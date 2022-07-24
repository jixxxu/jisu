package com.example.cjproject.join;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cjproject.R;
import com.example.cjproject.login.Login_main;
import com.example.cjproject.task.Bacode;
import com.example.cjproject.task.Tracking;
import com.example.cjproject.task.map_detail;

public class app_start extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_start);

        Button btn_ToJoin_1 = findViewById(R.id.btn_ToJoin_1);
        btn_ToJoin_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Join_Main.class);
                startActivity(intent);
            }
        });

        Button btn_ToLogin_1 = findViewById(R.id.btn_ToLogin_1);
        btn_ToLogin_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), map_detail.class);
                startActivity(intent);
            }
        });
    }
}