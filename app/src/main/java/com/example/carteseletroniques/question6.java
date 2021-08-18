package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class question6 extends AppCompatActivity {
    Button b4,b5,b6,b7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question6);
        b4=findViewById(R.id.a);
        b5=findViewById(R.id.b);
        b6=findViewById(R.id.c);
        b7=findViewById(R.id.d);
        final MediaPlayer mediaplayer4=MediaPlayer.create(this,R.raw.faux);
        final MediaPlayer mediaplayer5=MediaPlayer.create(this,R.raw.vrai);
        b4.setOnClickListener(v -> {
            b4.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer4.start();
            Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        b5.setOnClickListener(v -> {
            b5.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer4.start();
            Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        b6.setOnClickListener(v -> {
            b6.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer5.start();
            Toast.makeText(getApplicationContext()," Bravo réponse correcte",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(getApplicationContext(),question7.class);
            startActivity(intent);
        });
        b7.setOnClickListener(v -> {
            b7.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer4.start();
            Toast.makeText(getApplicationContext()," Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
    }
}