package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class test1_chapitre2 extends AppCompatActivity {
    Button b4,b5,b6;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1_chapitre2);
      b4=findViewById(R.id.e);
      b5=findViewById(R.id.f);
      b6=findViewById(R.id.g);
        final MediaPlayer mediaplayer2=MediaPlayer.create(this,R.raw.faux);
        final MediaPlayer mediaplayer3=MediaPlayer.create(this,R.raw.vrai);
      b4.setOnClickListener(v -> {
          b4.setBackgroundColor(Color.rgb(207,10,29));
          mediaplayer2.start();
          Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();

      });
      b5.setOnClickListener(v -> {
          b5.setBackgroundColor(Color.rgb(7,85,7));
          mediaplayer3.start();
          Toast.makeText(getApplicationContext(),"Bravo réponse correcte",Toast.LENGTH_LONG).show();
          i=i+1;
          if(i>=2)
          {
              Intent intent=new Intent(getApplicationContext(),question2_chapitre2.class);
              startActivity(intent);
          }
      });
      b6.setOnClickListener(v -> {
          b6.setBackgroundColor(Color.rgb(7,85,7));
          mediaplayer3.start();
          Toast.makeText(getApplicationContext(),"Bravo réponse correcte",Toast.LENGTH_LONG).show();
          i=i+1;
          if(i>=2)
          {
              Intent intent=new Intent(getApplicationContext(),question2_chapitre2.class);
              startActivity(intent);
          }
      });
    }
}