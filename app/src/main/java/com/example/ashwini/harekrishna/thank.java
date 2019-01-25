package com.example.ashwini.harekrishna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class thank extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank);
    }
    public void onclick (View view){
        Intent i = new Intent(thank.this,thir.class);
        startActivity(i);
    }
}
