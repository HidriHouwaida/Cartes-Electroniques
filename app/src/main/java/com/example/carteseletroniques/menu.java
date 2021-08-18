package com.example.carteseletroniques;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

public class menu extends AppCompatActivity {
    Button button1;
    ImageView im,home,lougout,setting,share,aboutus;
    DrawerLayout d;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        button1=findViewById(R.id.debutant);
        im=findViewById(R.id.men);
        home=findViewById(R.id.home);
        lougout=findViewById(R.id.logout);
        d=findViewById(R.id.drawer_layoutmenu);
        setting=findViewById(R.id.setting);
        share=findViewById(R.id.share);
        aboutus=findViewById(R.id.aboutus);
        button1.setOnClickListener(v -> {
         Intent intent=new Intent(menu.this,menu_de_niveau_debutant.class);
         startActivity(intent);

        });
        im.setOnClickListener(v -> d.openDrawer(GravityCompat.START));
        home.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),MainActivity.class);
            startActivity(intent);
        });
        lougout.setOnClickListener(v -> finish());
        setting.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),setting.class);
            startActivity(intent);
        });
        share.setOnClickListener(v -> {
            Intent intent=new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            String body="Download this App";
            String sub="http://play.google.com";
            intent.putExtra(Intent.EXTRA_TEXT,body);
            intent.putExtra(Intent.EXTRA_TEXT,sub);
            startActivity(Intent.createChooser(intent,"ShareVia"));
        });
        aboutus.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),aboutus.class);
            startActivity(intent);
        });
    }
}