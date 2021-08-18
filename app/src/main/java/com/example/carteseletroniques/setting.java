package com.example.carteseletroniques;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.appcompat.widget.SwitchCompat;

public class setting extends AppCompatActivity {
    SwitchCompat s;
    ImageView im;
    SeekBar h;
    TextView note;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        if(AppCompatDelegate.getDefaultNightMode()==AppCompatDelegate.MODE_NIGHT_YES)
        {
            setTheme(R.style.Theme_Dark);
        }
        else
        {
            setTheme(R.style.Theme_Design_Light);
        }
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        s=findViewById(R.id.swt);
        im=findViewById(R.id.imagenuit);
        h=findViewById(R.id.seek);
        int cbrightness= Settings.System.getInt(getContentResolver(),Settings.System.SCREEN_BRIGHTNESS,0);
        h.setProgress(cbrightness);
        note=findViewById(R.id.note);
        h.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                Context context=getApplicationContext();
                boolean canwrite=Settings.System.canWrite(context);
                if(canwrite)
                {
                    int sbrightness=progress*255/255;
                    Settings.System.putInt(context.getContentResolver(),Settings.System.SCREEN_BRIGHTNESS_MODE,Settings.System.SCREEN_BRIGHTNESS_MODE_MANUAL);
                    Settings.System.putInt(context.getContentResolver(),Settings.System.SCREEN_BRIGHTNESS,sbrightness);
                }
                else
                {
                    Intent intent=new Intent(Settings.ACTION_MANAGE_WRITE_SETTINGS);
                    context.startActivity(intent);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        s.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked)
            {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
            }
            else
            {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            }
        });
        note.setOnClickListener(v -> {
            Intent intent=new Intent(getApplicationContext(),Note.class);
            startActivity(intent);
        });
    }
}