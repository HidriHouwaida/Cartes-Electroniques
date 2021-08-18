package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class question2_chapitre2 extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2_chapitre2);
        bt1=findViewById(R.id.a);
        bt2=findViewById(R.id.b);
        bt3=findViewById(R.id.c);
        bt4=findViewById(R.id.d);
        final MediaPlayer mediaplayer=MediaPlayer.create(this,R.raw.faux);
        final MediaPlayer mediaplayer1=MediaPlayer.create(this,R.raw.vrai);
        bt1.setOnClickListener(v -> {
            bt1.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer1.start();
            i=i+1;
            if(i>=3)
            {
                Intent intent=new Intent(getApplicationContext(),question3_chapitre2.class);
                startActivity(intent);
            }
            Toast.makeText(getApplicationContext(),"Bravo réponse correcte",Toast.LENGTH_LONG).show();
        });
        bt2.setOnClickListener(v -> {
            bt2.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer1.start();
            i=i+1;
            if(i>=3)
            {
                Intent intent=new Intent(getApplicationContext(),question3_chapitre2.class);
                startActivity(intent);
            }
            Toast.makeText(getApplicationContext(),"Bravo réponse correcte",Toast.LENGTH_LONG).show();
        });
        bt3.setOnClickListener(v -> {
            bt3.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer1.start();
            i=i+1;
            if(i>=3)
            {
                Intent intent=new Intent(getApplicationContext(),question3_chapitre2.class);
                startActivity(intent);
            }
            Toast.makeText(getApplicationContext()," Bravo réponse correcte",Toast.LENGTH_LONG).show();
        });
        bt4.setOnClickListener(v -> {
            bt4.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer.start();
            Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
    }
}