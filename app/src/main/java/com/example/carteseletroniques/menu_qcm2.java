package com.example.carteseletroniques;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class menu_qcm2 extends AppCompatActivity {
    TextView tex1,tex2,tex3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_qcm2);
        tex1=findViewById(R.id.teste1);
        tex2=findViewById(R.id.teste2);
        tex3=findViewById(R.id.teste3);
        tex1.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),test1_chapitre3.class);
            startActivity(intent);
        });
        tex2.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),test2_chapitre3.class);
            startActivity(intent);
        });
        tex3.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),test3_chapitre3.class);
            startActivity(intent);
        });
    }
}