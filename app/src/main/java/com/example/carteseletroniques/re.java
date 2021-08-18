package com.example.carteseletroniques;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class re extends AppCompatActivity {
    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_re);
        i=findViewById(R.id.im);
        i.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),menu_qcm.class);
            startActivity(intent);
        });
    }
}