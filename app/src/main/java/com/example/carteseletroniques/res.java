package com.example.carteseletroniques;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class res extends AppCompatActivity {
     ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res);
        i=findViewById(R.id.im);
        i.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),menu_qcm1.class);
            startActivity(intent);
        });
    }
}