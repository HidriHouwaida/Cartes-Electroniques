package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class test3_chapitre2 extends AppCompatActivity {
    Button b11,b12,b13,b14;int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3_chapitre2);
        b11=findViewById(R.id.a);
        b12=findViewById(R.id.b);
        b13=findViewById(R.id.c);
        b14=findViewById(R.id.d);
        final MediaPlayer mediaplayer14=MediaPlayer.create(this,R.raw.faux);
        final MediaPlayer mediaplayer15=MediaPlayer.create(this,R.raw.vrai);
        b11.setOnClickListener(v -> {
            b11.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer15.start();
            i=i+1;
            if(i>=3)
            {
                Intent intent=new Intent(getApplicationContext(),question2_test3.class);
                startActivity(intent);
            }
            Toast.makeText(getApplicationContext(),"Bravo réponse correcte",Toast.LENGTH_LONG).show();
        });
        b12.setOnClickListener(v -> {
            b12.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer14.start();
            Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        b13.setOnClickListener(v -> {
            b13.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer15.start();
            i=i+1;
            if(i>=3)
            {
                Intent intent=new Intent(getApplicationContext(),question2_test3.class);
                startActivity(intent);
            }
            Toast.makeText(getApplicationContext()," Bravo réponse correcte",Toast.LENGTH_LONG).show();
        });
        b14.setOnClickListener(v -> {
            b14.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer15.start();
            i=i+1;
            if(i>=3)
            {
                Intent intent=new Intent(getApplicationContext(),question2_test3.class);
                startActivity(intent);
            }
            Toast.makeText(getApplicationContext()," Bravo réponse correcte",Toast.LENGTH_LONG).show();
        });
    }
}