package com.example.carteseletroniques;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class menu_chapitre_2 extends AppCompatActivity {
    TextView qc,cou;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_chapitre_2);
        qc=findViewById(R.id.qcm);
        cou=findViewById(R.id.cour);
        qc.setOnClickListener(v -> {
            Intent intent=new Intent (getApplicationContext(),menu_qcm1.class);
            startActivity(intent);
        });
        cou.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),pdf1.class);
            startActivity(intent);
        });
    }
}