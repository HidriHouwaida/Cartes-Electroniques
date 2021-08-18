package com.example.carteseletroniques;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Note extends AppCompatActivity {
    //déclaration des variables
    //**********************************************************************************************
    ImageView supprimer,ajouter,affichage,pencil;
    EditText editText;
    DBNote dbNote;
    //**********************************************************************************************
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
        //initialisation des varaiables
        //******************************************************************************************
        supprimer=findViewById(R.id.supprimer);
        ajouter=findViewById(R.id.ajouter);
        affichage=findViewById(R.id.affiche);
        editText=findViewById(R.id.edittext);
        pencil=findViewById(R.id.pencil);
        dbNote=new DBNote(this);
        //******************************************************************************************

        supprimer.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Supprime.class);
            startActivity(intent);
        });
        ajouter.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),NoteEdit.class);
            startActivity(intent);
        });
        affichage.setOnClickListener(v -> {
            Intent intent=getIntent();
            editText.setText(intent.getStringExtra("Note"));
            editText.setBackgroundColor(intent.getIntExtra("couleur",1));
            if(!intent.getStringExtra("textcolor").equals("textcolor"))
            {
                editText.setTextColor(Color.BLACK);
                editText.setBackgroundResource(R.drawable.cadre);
            }
        });
        pencil.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),NoteEdit.class);
            intent.putExtra("note",editText.getText().toString());
            startActivity(intent);

        });
    }
}