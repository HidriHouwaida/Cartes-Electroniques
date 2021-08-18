package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class question9 extends AppCompatActivity {
    Button b16,b17,b18;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question9);
        b16=findViewById(R.id.a);
        b17=findViewById(R.id.b);
        b18=findViewById(R.id.c);
        final MediaPlayer mediaplayer=MediaPlayer.create(this,R.raw.faux);
        final MediaPlayer mediaplayer1=MediaPlayer.create(this,R.raw.vrai);
        b16.setOnClickListener(v -> {
            b16.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer.start();
            Toast.makeText(getApplicationContext()," Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        b17.setOnClickListener(v -> {
            b17.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer1.start();
            Toast.makeText(getApplicationContext(),"Bravo réponse correcte",Toast.LENGTH_LONG).show();
            Intent intent=new Intent(getApplicationContext(),re.class);
            startActivity(intent);
        });
        b18.setOnClickListener(v -> {
            b18.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer.start();
            Toast.makeText(getApplicationContext()," Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
    }
}