package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class test3 extends AppCompatActivity {
    Button bt15,bt26,bt37;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);
        bt15=findViewById(R.id.a);
        bt26=findViewById(R.id.b);
        bt37=findViewById(R.id.c);
        final MediaPlayer mediaplayer12=MediaPlayer.create(this,R.raw.faux);
        final MediaPlayer mediaplayer13=MediaPlayer.create(this,R.raw.vrai);
        bt15.setOnClickListener(v -> {
            bt15.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer12.start();
            Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        bt26.setOnClickListener(v -> {
            bt26.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer12.start();
            Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        bt37.setOnClickListener(v -> {
            bt37.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer13.start();
            Toast.makeText(getApplicationContext()," Bravo réponse correcte",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(getApplicationContext(),question10.class);
            startActivity(intent);
        });
    }
}