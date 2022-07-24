package com.example.cjproject.join;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.cjproject.R;
import com.example.cjproject.login.Join_Complete;

public class Join_carinform extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.join_carinform);


        Button btn_next4 = findViewById(R.id.btn_next4);
        btn_next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Join_Complete.class);
                startActivity(intent);
            }
        });



    }
}