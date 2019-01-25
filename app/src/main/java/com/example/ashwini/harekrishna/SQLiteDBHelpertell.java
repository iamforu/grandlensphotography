package com.example.ashwini.harekrishna;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by ASHWINI on 1/16/2018.
 */

public class SQLiteDBHelpertell extends SQLiteOpenHelper {
    static String DATABASE_NAME="tell";

    public static final String TABLE_NAME="story";
    public static final String KEY_ID="id";
    public static final String KEY_Name="name";
    public static final String KEY_lASTNAME="lastname";
    public static final String KEY_EMAIL="email";
    public static final String KEY_LOCATION="loc";

    public SQLiteDBHelpertell(Context context) {

        super(context, DATABASE_NAME, null, 1);

    }
    @Override
    public void onCreate(SQLiteDatabase database) {

        String CREATE_TABLE="CREATE TABLE "+TABLE_NAME+" ("+KEY_ID+" INTEGER PRIMARY KEY, "+KEY_Name+" VARCHAR, "+KEY_lASTNAME+" VARCHAR, "+KEY_EMAIL+" VARCHAR, "+KEY_LOCATION+" VARCHAR)";
        database.execSQL(CREATE_TABLE);

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }
}
