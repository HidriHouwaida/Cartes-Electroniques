package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class question11 extends AppCompatActivity {
    Button b11,b12,b13,b14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question11);
        b11=findViewById(R.id.a);
        b12=findViewById(R.id.b);
        b13=findViewById(R.id.c);
        b14=findViewById(R.id.d);
        final MediaPlayer mediaplayer14=MediaPlayer.create(this,R.raw.faux);
        final MediaPlayer mediaplayer15=MediaPlayer.create(this,R.raw.vrai);
        b11.setOnClickListener(v -> {
            b11.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer14.start();
            Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        b12.setOnClickListener(v -> {
            b12.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer14.start();
            Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        b13.setOnClickListener(v -> {
            b13.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer15.start();
            Toast.makeText(getApplicationContext()," Bravo réponse correcte",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(getApplicationContext(),question12.class);
            startActivity(intent);
        });
    }
}