package com.example.carteseletroniques;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBNote extends SQLiteOpenHelper {

    public DBNote( Context context) {
        super(context, "Note.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(" create table "+"note"+"(ID INTEGER PRIMARY KEY ,Note TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists "+"note");
    }
    public void insert(String note)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("note",note);
        db.insert("note",null,contentValues);
    }
    public Cursor getnote()
    {   SQLiteDatabase database=this.getWritableDatabase();
        return database.rawQuery(" select * from "+"note",null);
    }
    public void delete(String i)
    {
        SQLiteDatabase sqLiteDatabase=this.getWritableDatabase();
        sqLiteDatabase.delete("note", " ID=?", new String[]{i});
    }

}

