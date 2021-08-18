package com.example.carteseletroniques;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class r extends AppCompatActivity {
    TextView tes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r);
        tes=findViewById(R.id.testfinished);
        tes.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),menu_qcm2.class);
            startActivity(intent);
        });
    }
}