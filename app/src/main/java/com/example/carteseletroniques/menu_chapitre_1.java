package com.example.carteseletroniques;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class menu_chapitre_1 extends AppCompatActivity {
    TextView qc;
    TextView cou;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_chapitre_1);
        qc=findViewById(R.id.qcm);
        cou=findViewById(R.id.cour);
        qc.setOnClickListener(v -> {
            Intent intent=new Intent (getApplicationContext(),menu_qcm.class);
            startActivity(intent);
        });
        cou.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),pdf.class);
            startActivity(intent);
        });
    }
}