package com.example.cjproject.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cjproject.R;
import com.example.cjproject.join.Join_area;
import com.example.cjproject.join.Join_carinform;
import com.example.cjproject.login.Login_main;

public class car_regist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.car_regist);

        Button gocarinform = findViewById(R.id.gocarinform);
        gocarinform.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Join_carinform.class );
                startActivity(intent);
            }
        });
        Button godeliverystatus = findViewById(R.id.godeliverystatus);
        godeliverystatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), delivery_status.class);
                startActivity(intent);
            }
        });
    }
}