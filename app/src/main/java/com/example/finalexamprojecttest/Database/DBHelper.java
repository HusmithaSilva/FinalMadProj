package com.example.finalexamprojecttest.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "student_final.db";

    public static final String TABLE_NAME1 = "User Table";
    public static final String col_1 = "uID";
    public static final String col_2 = "Name";
    public static final String col_3 = "Password";
    public static final String col_4 = "Type";

    public static final String TABLE_NAME2 = "Message Table";
    public static final String col_5 = "mID";
    public static final String col_6 = "User";
    public static final String col_7 = "Subject";
    public static final String col_8 = "Message";



    public DBHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
