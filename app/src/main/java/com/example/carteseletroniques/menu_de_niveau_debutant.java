package com.example.carteseletroniques;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class menu_de_niveau_debutant extends AppCompatActivity {
    TextView chap1,chap2,chap3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_de_niveau_debutant);
        chap1=findViewById(R.id.chapitre_1);
        chap2=findViewById(R.id.chapitre_2);
        chap3=findViewById(R.id.chapitre_3);
        chap1.setOnClickListener(v -> {
        Intent intent=new Intent(getApplicationContext(),menu_chapitre_1.class);
        startActivity(intent);
        });
        chap2.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),menu_chapitre_2.class);
            startActivity(intent);
        });
        chap3.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),menu_chapitre3.class);
            startActivity(intent);
        });
    }
}