package com.example.ashwini.harekrishna;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends Activity {

    SQLiteDBHelperbook SQLITEHELPER;
    SQLiteDatabase SQLITEDATABASE;
    Cursor cursor;
    SQLiteListAdapter ListAdapter ;

    ArrayList<String> ID_ArrayList = new ArrayList<String>();
    ArrayList<String> NAME_ArrayList = new ArrayList<String>();
    ArrayList<String> Lastname_ArrayList = new ArrayList<String>();
    ArrayList<String> EMAIL_ArrayList = new ArrayList<String>();
    ArrayList<String> PHONE_NUMBER_ArrayList = new ArrayList<String>();
    ArrayList<String> DATE_ArrayList = new ArrayList<String>();
    ArrayList<String> LOCATION_ArrayList = new ArrayList<String>();
    ArrayList<String> VENUE_ArrayList = new ArrayList<String>();
    ListView LISTVIEW;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        LISTVIEW = (ListView) findViewById(R.id.listView1);

        SQLITEHELPER = new SQLiteDBHelperbook(this);

    }

    @Override
    protected void onResume() {

        ShowSQLiteDBdatabook() ;

        super.onResume();
    }

    private void ShowSQLiteDBdatabook() {

        SQLITEDATABASE = SQLITEHELPER.getWritableDatabase();

        cursor = SQLITEDATABASE.rawQuery("SELECT * FROM book ", null);

        ID_ArrayList.clear();
        NAME_ArrayList.clear();
        Lastname_ArrayList.clear();
        EMAIL_ArrayList.clear();
        PHONE_NUMBER_ArrayList.clear();
        DATE_ArrayList.clear();
        LOCATION_ArrayList.clear();
        VENUE_ArrayList.clear();

        if (cursor.moveToFirst()) {
            do {
                ID_ArrayList.add(cursor.getString(cursor.getColumnIndex(SQLiteDBHelperbook.KEY_ID)));

                NAME_ArrayList.add(cursor.getString(cursor.getColumnIndex(SQLiteDBHelperbook.KEY_Name)));

                Lastname_ArrayList.add(cursor.getString(cursor.getColumnIndex(SQLiteDBHelperbook.KEY_lASTNAME)));

                EMAIL_ArrayList.add(cursor.getString(cursor.getColumnIndex(SQLiteDBHelperbook.KEY_EMAIL)));

                PHONE_NUMBER_ArrayList.add(cursor.getString(cursor.getColumnIndex(SQLiteDBHelperbook.KEY_PhoneNumber)));

                DATE_ArrayList.add(cursor.getString(cursor.getColumnIndex(SQLiteDBHelperbook.KEY_DATE)));

                LOCATION_ArrayList.add(cursor.getString(cursor.getColumnIndex(SQLiteDBHelperbook.KEY_LOCATION)));

                VENUE_ArrayList.add(cursor.getString(cursor.getColumnIndex(SQLiteDBHelperbook.KEY_VENUE)));

            } while (cursor.moveToNext());
        }

        ListAdapter = new SQLiteListAdapter(ListViewActivity.this,

                ID_ArrayList,
                NAME_ArrayList,
                Lastname_ArrayList,
                EMAIL_ArrayList,
                PHONE_NUMBER_ArrayList,
                DATE_ArrayList,
                LOCATION_ArrayList,
                VENUE_ArrayList

        );

        LISTVIEW.setAdapter(ListAdapter);

        cursor.close();
    }
}