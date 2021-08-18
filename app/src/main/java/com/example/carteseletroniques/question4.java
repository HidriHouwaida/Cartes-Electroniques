package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class question4 extends AppCompatActivity {
    Button bt7,bt8,bt9,bt10;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question4);
        bt7=findViewById(R.id.a);
        bt8=findViewById(R.id.b);
        bt9=findViewById(R.id.c);
        bt10=findViewById(R.id.d);
        final MediaPlayer mediaplayer=MediaPlayer.create(this,R.raw.faux);
        final MediaPlayer mediaplayer1=MediaPlayer.create(this,R.raw.vrai);
        bt7.setOnClickListener(v -> {
            bt7.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer.start();
            Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();});
        bt8.setOnClickListener(v -> {
            bt8.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer.start();
            Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();
            });
        bt9.setOnClickListener(v -> {
            bt9.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer1.start();
            Toast.makeText(getApplicationContext()," Bravo réponse correcte",Toast.LENGTH_LONG).show();
            i=i+1;
            if(i>2)
            {
                Intent intent=new Intent(getApplicationContext(),question5.class);
                startActivity(intent);
            }
        });
        bt10.setOnClickListener(v -> {
            bt10.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer1.start();
            Toast.makeText(getApplicationContext()," Bravo réponse correcte",Toast.LENGTH_LONG).show();
            i=i+1;
            if(i>2)
            {
                Intent intent=new Intent(getApplicationContext(),question5.class);
                startActivity(intent);
            }
        });


    }
}