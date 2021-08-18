package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class question2_test2 extends AppCompatActivity {
    Button b7,b8,b9;int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2_test2);
        b7=findViewById(R.id.a);
        b8=findViewById(R.id.b);
        b9=findViewById(R.id.c);
        final MediaPlayer mediaplayer17=MediaPlayer.create(this,R.raw.faux);
        final MediaPlayer mediaplayer18=MediaPlayer.create(this,R.raw.vrai);
        b7.setOnClickListener(v -> {
            b7.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer18.start();
            i=i+1;
            if(i>=2)
            {
                Intent intent=new Intent(getApplicationContext(),question3_test2.class);
                startActivity(intent);
            }
            Toast.makeText(getApplicationContext(),"Bravo réponse correcte",Toast.LENGTH_LONG).show();
        });
        b8.setOnClickListener(v -> {
            b8.setBackgroundColor(Color.rgb(207,10,29));
            mediaplayer17.start();
            Toast.makeText(getApplicationContext()," Réponse incorrecte",Toast.LENGTH_LONG).show();
        });
        b9.setOnClickListener(v -> {
            b9.setBackgroundColor(Color.rgb(7,85,7));
            mediaplayer18.start();
            i=i+1;
            if(i>=2)
            {
                Intent intent=new Intent(getApplicationContext(),question3_test2.class);
                startActivity(intent);
            }
            Toast.makeText(getApplicationContext(),"Bravo réponse correcte",Toast.LENGTH_LONG).show();
        });
    }
}