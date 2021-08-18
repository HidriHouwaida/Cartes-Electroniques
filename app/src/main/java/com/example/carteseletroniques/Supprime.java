package com.example.carteseletroniques;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Supprime extends AppCompatActivity {
    DBNote dbNote;
    EditText editText;
    Button supprimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supprime);
        dbNote=new DBNote(this);
        editText=findViewById(R.id.edittext);
        supprimer=findViewById(R.id.supprimer);
        supprimer.setOnClickListener(v -> dbNote.delete(editText.getText().toString()));

    }
}