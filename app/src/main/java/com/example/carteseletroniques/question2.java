package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class question2 extends AppCompatActivity {
    Button bt4,bt5,bt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
        bt4=findViewById(R.id.a);
        bt5=findViewById(R.id.b);
        bt6=findViewById(R.id.c);
        final MediaPlayer mediaplayer=MediaPlayer.create(this,R.raw.faux);
        final MediaPlayer mediaplayer1=MediaPlayer.create(this,R.raw.vrai);
        bt4.setOnClickListener(v -> {
            bt4.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer.start();
            Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        bt5.setOnClickListener(v -> {
            bt5.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer1.start();
            Toast.makeText(getApplicationContext()," Bravo réponse correcte",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(getApplicationContext(),question3.class);
            startActivity(intent);});
        bt6.setOnClickListener(v -> {
            bt6.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer.start();
            Toast.makeText(getApplicationContext(),"  Réponse incorrecte",Toast.LENGTH_LONG).show();

        });
    }
}