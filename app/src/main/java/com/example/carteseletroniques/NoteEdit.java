package com.example.carteseletroniques;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import com.divyanshu.colorseekbar.ColorSeekBar;

public class NoteEdit extends AppCompatActivity {
    ImageView save,getnote;
    EditText editText;
    ColorSeekBar colorSeekBar;
    int m;
    String textcolor;
    DBNote dbNote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note_edit);
        save=findViewById(R.id.save);
        editText=findViewById(R.id.edittext);
        colorSeekBar=findViewById(R.id.seekbar);
        getnote=findViewById(R.id.getnote);
        dbNote=new DBNote(this);
        save.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Note.class);
            intent.putExtra("Note",editText.getText().toString());
            intent.putExtra("couleur",m);
            intent.putExtra("textcolor",textcolor);
            dbNote.insert(editText.getText().toString());
            startActivity(intent);
        });
        colorSeekBar.setOnColorChangeListener(i -> {
            editText.setTextColor(Color.WHITE);
            editText.setBackgroundResource(R.drawable.cadrewhite);
            editText.setBackgroundColor(i);
            m=i;
            textcolor="textcolor";
        });
        Intent intent=getIntent();
        editText.setText("   " +intent.getStringExtra("note"));
        getnote.setOnClickListener(v -> {
            Cursor cursor=dbNote.getnote();
            if(cursor.getCount()==0)
            {
                showmessage("Erreur","Tu n'as pas encore des notes");
            }
            else
            {StringBuffer buffer=new StringBuffer();
                while(cursor.moveToNext())
                {
                    buffer.append(" "+cursor.getString(0)+"\n");
                    buffer.append(" "+cursor.getString(1)+"\n"+"\n"+"\n");
                }
                showmessage("     Vos Notes      ",buffer.toString());
            }
        });
    }
    public  void showmessage(String title,String message)
    {
        AlertDialog.Builder alert=new AlertDialog.Builder(this);
        alert.setCancelable(true);
        alert.setTitle(title);
        alert.setMessage(message);
        alert.show();
    }
}