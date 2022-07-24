package com.example.cjproject.task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cjproject.R;
import com.example.cjproject.join.Join_carinform;

public class register_list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_list);

        Button bacodecode = findViewById(R.id.bacodecode);
        bacodecode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Bacode.class);
                startActivity(intent);
            }
        });

        Button registcarbutton = findViewById(R.id.registcarbutton);
        registcarbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Join_carinform.class);
                startActivity(intent);
            }
        });
    }
}