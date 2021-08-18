package com.example.carteseletroniques;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;

public class LoginouInscriptions extends AppCompatActivity {
    TextView t,forgotpassword;
    GoogleSignInClient  mGoogleSignInClient;
    EditText email,password;
    Button signin;
    DBHelpeur db;
    private static final int RC_SIGN_IN=100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginou_inscriptions);
        t=findViewById(R.id.crana);
        email=findViewById(R.id.inputemail);
        forgotpassword=findViewById(R.id.forgot);
        password=findViewById(R.id.inputpassword);
        signin=findViewById(R.id.button_sign_in);
        forgotpassword.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),ForgetPassWord.class);
            startActivity(intent);
        });
        db=new DBHelpeur(this);
        signin.setOnClickListener(v -> {
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
                password.setError("Longueur de mot de passe doit étre > 6!");
                password.requestFocus();
            }
            else
            {
                Boolean checkuserpass=db.checkuseremailpassword(email.getText().toString(),password.getText().toString());
                if(checkuserpass==true)
                {
                    Toast.makeText(getApplicationContext(),"connexion réussie",Toast.LENGTH_LONG).show();
                    Intent intent=new Intent(getApplicationContext(),menu.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Données invalides",Toast.LENGTH_LONG).show();
                }
            }
        });
        t.setOnClickListener(v -> {
            Intent gameActivity= new Intent(LoginouInscriptions.this, SignUp.class);
            startActivity(gameActivity);
        });
        GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                .requestEmail()
                .build();
        mGoogleSignInClient = GoogleSignIn.getClient(this, gso);
        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(this);
        SignInButton signInButton = findViewById(R.id.sign_in_button);
        signInButton.setSize(SignInButton.SIZE_STANDARD);
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                signIn();

            }
        });}
        private void signIn(){
            Intent signInIntent = mGoogleSignInClient.getSignInIntent();
            startActivityForResult(signInIntent,RC_SIGN_IN);

    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        // Result returned from launching the Intent from GoogleSignInClient.getSignInIntent(...);
        if (requestCode == RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);
            handleSignInResult(task);
        }
    }
    private void handleSignInResult(Task<GoogleSignInAccount> completedTask) {
        try {
            GoogleSignInAccount account = completedTask.getResult(ApiException.class);
            GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
            if (acct != null) {
                String personName = acct.getDisplayName();
                String personGivenName = acct.getGivenName();
                String personId = acct.getId();
                Uri personPhoto = acct.getPhotoUrl();
                Toast.makeText(this," Bienvenue "+personName,Toast.LENGTH_LONG).show();
            }
            startActivity(new Intent (LoginouInscriptions.this,menu.class));
        } catch (ApiException e) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            Log.d("Message",e.toString());

        }
    }


}