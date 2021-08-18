package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class test1 extends AppCompatActivity {
    //déclaration des variables
    Button bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test1);
            //initialisation des variables
            bt1=findViewById(R.id.a);
            bt2=findViewById(R.id.b);
            bt3=findViewById(R.id.c);
        final MediaPlayer mediaplayer=MediaPlayer.create(this,R.raw.faux);
        final MediaPlayer mediaplayer1=MediaPlayer.create(this,R.raw.vrai);
                          bt1.setOnClickListener(v -> {
                           bt1.setBackgroundColor(Color.rgb(207,10,29));
                              mediaplayer.start();
                              Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();
                                                   });
                           bt2.setOnClickListener(v -> {
                            bt2.setBackgroundColor(Color.rgb(207,10,29));
                               mediaplayer.start();
                               Toast.makeText(getApplicationContext(),"Réponse incorrecte",Toast.LENGTH_LONG).show();
                               });
                           bt3.setOnClickListener(v -> {
                            bt3.setBackgroundColor(Color.rgb(7,85,7));
                              mediaplayer1.start();
                              Toast.makeText(getApplicationContext()," Bravo réponse correcte",Toast.LENGTH_LONG).show();
                            Intent intent=new Intent(getApplicationContext(),question2.class);
                            startActivity(intent);
                           });
    }
}