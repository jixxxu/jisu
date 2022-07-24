package com.example.cjproject.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.cjproject.R;
import com.example.cjproject.login.Join_Complete;

public class task_request_list extends AppCompatActivity {

    TextView textView;
    String[] items ={"내위치설정","정왕동", "배곧동"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.task_request_list);

        LinearLayout Task_linear = findViewById(R.id.linear_task1);
        Task_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), task_request.class);
                startActivity(intent);
            }
        });

        Button alarmbutton = findViewById(R.id.alarmbutton);
        alarmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), task_list.class);
                startActivity(intent);
            }
        });

    }
}