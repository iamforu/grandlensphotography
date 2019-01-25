package com.example.ashwini.harekrishna;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Bridecatalog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bridecatalog);
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid);
        AndroidImageAdapterbride adapterView = new AndroidImageAdapterbride(this);
        mViewPager.setAdapter(adapterView);
    }
    public void onclick(View v)


    {
        Intent i= new Intent(Bridecatalog.this,bookingactivity.class);
        startActivity(i);

    }

}
