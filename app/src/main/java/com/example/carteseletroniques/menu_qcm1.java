package com.example.carteseletroniques;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class menu_qcm1 extends AppCompatActivity {
    TextView tes1,tes2,tes3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_qcm1);
        tes1=findViewById(R.id.teste1);
        tes2=findViewById(R.id.teste2);
        tes3=findViewById(R.id.teste3);
        tes1.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),test1_chapitre2.class);
            startActivity(intent);
        });
        tes2.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),test2_chapitre2.class);
            startActivity(intent);
        });
        tes3.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),test3_chapitre2.class);
            startActivity(intent);
        });
    }
}