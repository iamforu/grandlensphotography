package com.example.ashwini.harekrishna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class bookinglist extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookinglist);
    }
    public void abcd (View view){
        Intent a =new Intent(bookinglist.this,ListViewActivity.class);
        startActivity(a);
    }
}
