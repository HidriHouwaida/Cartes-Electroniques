package com.example.carteseletroniques;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class pdf1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf1);
        PDFView pdf;
        pdf=findViewById(R.id.pdfview);
        pdf.fromAsset("chapitre2.pdf").load();
    }
}