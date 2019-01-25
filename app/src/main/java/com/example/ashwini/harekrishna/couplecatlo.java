package com.example.ashwini.harekrishna;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class couplecatlo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_couplecatlo);
        ViewPager mViewPager = (ViewPager) findViewById(R.id.viewPageAndroid1);
        AndroidImageAdaptercoup adapterView = new AndroidImageAdaptercoup(this);
        mViewPager.setAdapter(adapterView);
    }
    public void onclick(View v)


    {
        Intent i= new Intent(couplecatlo.this,bookingactivity.class);
        startActivity(i);

    }
}
