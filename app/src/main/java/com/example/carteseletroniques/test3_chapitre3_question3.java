package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class test3_chapitre3_question3 extends AppCompatActivity {
    Button b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3_chapitre3_question3);
        b1=findViewById(R.id.a);
        b2=findViewById(R.id.b);
        b3=findViewById(R.id.c);
        b4=findViewById(R.id.d);
        MediaPlayer mediavrai=MediaPlayer.create(this,R.raw.vrai);
        MediaPlayer mediafaux=MediaPlayer.create(this,R.raw.faux);
        b1.setOnClickListener(v -> {
            b1.setBackgroundColor(Color.rgb(207,10,29));
            mediafaux.start();
            Toast.makeText(getApplicationContext()," Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        b2.setOnClickListener(v -> {
            b2.setBackgroundColor(Color.rgb(207,10,29));
            mediafaux.start();
            Toast.makeText(getApplicationContext()," Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        b3.setOnClickListener(v -> {
            b3.setBackgroundColor(Color.rgb(7,85,7));
            mediavrai.start();

            Intent intent=new Intent(getApplicationContext(),test3_chapitre3_question4.class);
            startActivity(intent);

            Toast.makeText(getApplicationContext(),"Bravo réponse correcte",Toast.LENGTH_LONG).show();
        });
        b4.setOnClickListener(v -> {
            b4.setBackgroundColor(Color.rgb(207,10,29));
            mediafaux.start();
            Toast.makeText(getApplicationContext()," Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
    }
}