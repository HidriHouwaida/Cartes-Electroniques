package com.example.carteseletroniques;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class SignUp extends AppCompatActivity {
    EditText email,password,verifypassword;
    Button bt,b;
    DBHelpeur db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        email=findViewById(R.id.email);
        password=findViewById(R.id.password);
        verifypassword=findViewById(R.id.verifypassword);
        bt=findViewById(R.id.sign_up_button);
        b=findViewById(R.id.button_c);
        db=new DBHelpeur(this);
        b.setOnClickListener(v -> {
            Intent inent=new Intent(getApplicationContext(),LoginouInscriptions.class);
            startActivity(inent);
        });
        bt.setOnClickListener(v -> {
            if(email.getText().toString().isEmpty())
            {
                email.setError("Email obligatoire!");
                email.requestFocus();}
        else if(!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches())
            {
                email.setError("Email invalide!");
                email.requestFocus();}
            else  if(password.getText().toString().isEmpty())
            {
                password.setError("Mot de passe obligatoire!");
                password.requestFocus();

            }
        else  if(password.getText().toString().length()<6)
            {
                password.setError("Le longueur de mot de passe doit étre > 6!");
                password.requestFocus();
            }
        else if(verifypassword.getText().toString().isEmpty())
            {
                verifypassword.setError(" Vérification de mot de passe obligatoire!");
                verifypassword.requestFocus();
            }
        else
            { if(password.getText().toString().equals(verifypassword.getText().toString()))
            {
                Boolean checkuser=db.checkusername(email.getText().toString());
                if(!checkuser)
                {
                    Boolean insert=db.insert(email.getText().toString(),password.getText().toString());
                    if(insert)
                    {
                        Toast.makeText(SignUp.this,"Inscription réussi",Toast.LENGTH_LONG).show();
                        Intent intent=new Intent(getApplicationContext(),menu.class);
                        startActivity(intent);
                    }
                    else
                    {
                        Toast.makeText(SignUp.this,"échec de l'enregistrement",Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(SignUp.this,"Utilisateur éxiste déja ! ",Toast.LENGTH_LONG).show();
                }
            }
             else
            {
                Toast.makeText(SignUp.this,"Mot de passe ne correspondant pas!",Toast.LENGTH_LONG).show();
            }
            }
        });

    }



}