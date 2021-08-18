package com.example.carteseletroniques;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class ForgetPassWord extends AppCompatActivity {
    TextInputEditText email;
    Button b;
    DBHelpeur db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pass_word);
        b=findViewById(R.id.bt);
        email=findViewById(R.id.em);
        db=new DBHelpeur(this);
        b.setOnClickListener(v -> {
            Cursor cursor=db.getpassword(email.getText().toString());
            if (cursor.getCount() == 0) {
                Toast.makeText(getApplicationContext(),"Erreur",Toast.LENGTH_SHORT).show();
            } else {
                StringBuilder buffer = new StringBuilder();
                while (cursor.moveToNext()) {
                    buffer.append("MotDepasse: ").append(cursor.getString(0)).append("\n");

                }
                sendEmail(buffer.toString());

            }
        });
    }
    public void sendEmail(String message)
    {
        JavaMailAPi javaMailAPi=new JavaMailAPi(this,email.getText().toString(),"Votre Mot De Passe"
                ,message);
        javaMailAPi.execute();
    }
}