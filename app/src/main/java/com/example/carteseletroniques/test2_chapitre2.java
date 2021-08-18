package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class test2_chapitre2 extends AppCompatActivity {
    Button b1,b2,b3,b4,b5;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2_chapitre2);
        b1=findViewById(R.id.e);
        b2=findViewById(R.id.f);
        b3=findViewById(R.id.g);
        b4=findViewById(R.id.h);
        b5=findViewById(R.id.k);
        final MediaPlayer mediaplayer14=MediaPlayer.create(this,R.raw.faux);
        final MediaPlayer mediaplayer15=MediaPlayer.create(this,R.raw.vrai);
        b1.setOnClickListener(v -> {
            b1.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer15.start();
            i=i+1;
            if(i>=3)
            {
                Intent intent=new Intent(getApplicationContext(),question2_test2.class);
                startActivity(intent);
            }
            Toast.makeText(getApplicationContext(),"Bravo réponse correcte",Toast.LENGTH_LONG).show();
        });
        b2.setOnClickListener(v -> {
            b2.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer14.start();
            Toast.makeText(getApplicationContext()," Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        b3.setOnClickListener(v -> {
            b3.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer15.start();
            i=i+1;
            if(i>=3)
            {
                Intent intent=new Intent(getApplicationContext(),question2_test2.class);
                startActivity(intent);
            }
            Toast.makeText(getApplicationContext(),"Bravo réponse correcte",Toast.LENGTH_LONG).show();
        });
        b4.setOnClickListener(v -> {
            b4.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer14.start();
            Toast.makeText(getApplicationContext()," Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        b5.setOnClickListener(v -> {
            b5.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer15.start();
            i=i+1;
            if(i>=3)
            {
                Intent intent=new Intent(getApplicationContext(),question2_test2.class);
                startActivity(intent);
            }
            Toast.makeText(getApplicationContext(),"Bravo réponse correcte",Toast.LENGTH_LONG).show();
        });

    }
}