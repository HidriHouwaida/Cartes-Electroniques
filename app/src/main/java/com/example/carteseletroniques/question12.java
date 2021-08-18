package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class question12 extends AppCompatActivity {
    Button b13;
    Button b14;
    Button b15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question12);
        b13=findViewById(R.id.a);
        b14=findViewById(R.id.b);
        b15=findViewById(R.id.c);
        final MediaPlayer mediaplayer5=MediaPlayer.create(this,R.raw.faux);
        final MediaPlayer mediaplayer6=MediaPlayer.create(this,R.raw.vrai);
        b13.setOnClickListener(v -> {
            b13.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer6.start();
            Toast.makeText(getApplicationContext()," Bravo réponse correcte",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(getApplicationContext(),question13.class);
            startActivity(intent);
        });
        b14.setOnClickListener(v -> {
            b14.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer5.start();
            Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        b15.setOnClickListener(v -> {
            b15.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer5.start();
            Toast.makeText(getApplicationContext()," Réponse incorrecte",Toast.LENGTH_LONG).show();
        });

    }
}