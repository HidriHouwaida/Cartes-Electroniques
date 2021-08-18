package com.example.carteseletroniques;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelpeur extends SQLiteOpenHelper {
    //le nom de mon base de donnée
    public DBHelpeur( Context context) {
        super(context,"Login.db",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase MyDB) {
    MyDB.execSQL("create Table users(userEmail Text Primary key ,password Text)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int i, int i1) {
       MyDB.execSQL("Drop Table if exists users");
    }
    //méthode pour inserer les données
    public Boolean insert(String userEmail,String password)
    {
        SQLiteDatabase MyDB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("useremail",userEmail);
        contentValues.put("password",password);
        long result=MyDB.insert("users",null,contentValues);
        return result != -1;

    }
    //méthode pour vérifier si l'email  existe déja
    public Boolean checkusername(String useremail)
    {
        SQLiteDatabase MyDB=this.getWritableDatabase();
         Cursor cursor=MyDB.rawQuery("select * from users where useremail=?",new String[]{useremail});
        return cursor.getCount() > 0;
    }
    //méthode pour vérifier si l'utilisateur existe déja
    public Boolean checkuseremailpassword(String useremail,String password)
    {
        SQLiteDatabase MyDB=this.getWritableDatabase();
        Cursor cursor=MyDB.rawQuery("select * from users where useremail=? and password=?",new String[]{useremail,password});
        return cursor.getCount() > 0;
    }
    public Cursor getpassword(String email)
    {
        SQLiteDatabase MyDB=this.getWritableDatabase();
        return MyDB.rawQuery("select password from users where userEmail=?",new String []{email});
    }
}
