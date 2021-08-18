package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class test2 extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);
        b1=findViewById(R.id.a);
        b2=findViewById(R.id.b);
        b3=findViewById(R.id.c);
        final MediaPlayer mediaplayer2=MediaPlayer.create(this,R.raw.faux);
        final MediaPlayer mediaplayer3=MediaPlayer.create(this,R.raw.vrai);
        b1.setOnClickListener(v -> {
            b1.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer3.start();
            Toast.makeText(getApplicationContext(),"Bravo réponse correcte",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(getApplicationContext(),question6.class);
            startActivity(intent);
        });
        b2.setOnClickListener(v -> {
            b2.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer2.start();
            Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        b3.setOnClickListener(v -> {
            b3.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer2.start();
            Toast.makeText(getApplicationContext()," Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
    }
}