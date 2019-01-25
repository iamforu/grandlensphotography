package com.example.ashwini.harekrishna;

import android.app.DatePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Calendar;

public class tellyour extends AppCompatActivity implements View.OnClickListener{
    SQLiteOpenHelper openHelperbook;
    EditText GetName,GetLastname,GetEmail,GetLocation ;
    SQLiteDatabase SQLITEDATABASE;

    Button btnDatePicker;
    EditText txtDate;
    private int mYear, mMonth, mDay;

    String Name,Lastname,Email, Location ;
    Boolean CheckEditTextEmpty ;
    Button Submit, ShowValues;
    String SQLiteQuery ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tellyour);
        btnDatePicker = (Button) findViewById(R.id.button6);
        txtDate = (EditText) findViewById(R.id.editText3);
        btnDatePicker.setOnClickListener(this);
        GetName = (EditText)findViewById(R.id.editText2);
        GetLastname=(EditText)findViewById(R.id.editText3);
        GetEmail=(EditText)findViewById(R.id.editText4);
        GetLocation=(EditText)findViewById(R.id.editText6);
        Submit = (Button)findViewById(R.id.button);

        Submit.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                DBCreate();

                SubmitData2SQLiteDB();

            }
        });
    }

    public void DBCreate(){

        SQLITEDATABASE = openOrCreateDatabase("tell", Context.MODE_PRIVATE, null);

        SQLITEDATABASE.execSQL("CREATE TABLE IF NOT EXISTS story (id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, name VARCHAR,last_name VARCHAR,email VARCHAR,location VARCHAR);");
    }
    public void SubmitData2SQLiteDB(){

        Name = GetName.getText().toString();
        Lastname=GetLastname.getText().toString();
        Email=GetEmail.getText().toString();



        Location=GetLocation.getText().toString();


        CheckEditTextIsEmptyOrNot( Name,Lastname,Email,Location );

        if(CheckEditTextEmpty == true)
        {

            SQLiteQuery = "INSERT INTO story (name,last_name,email,location) VALUES('"+Name+"','"+Lastname+"','"+Email+"','"+Location+"');";

            SQLITEDATABASE.execSQL(SQLiteQuery);

            Toast.makeText(tellyour.this,"Data Submit Successfully", Toast.LENGTH_LONG).show();

            ClearEditTextAfterDoneTask();
            {
                Intent a = new Intent(tellyour.this,thir.class);
                startActivity(a);
            }

        }
        else {

            Toast.makeText(tellyour.this,"Please Fill All the Fields", Toast.LENGTH_LONG).show();
        }
    }
    public void CheckEditTextIsEmptyOrNot(String Name,String Lastname,String Email,String Location){

        if(TextUtils.isEmpty(Name) || TextUtils.isEmpty(Lastname) || TextUtils.isEmpty(Email) ||   TextUtils.isEmpty(Location) ){

            CheckEditTextEmpty = false ;

        }
        else {
            CheckEditTextEmpty = true ;
        }
    }

    public void ClearEditTextAfterDoneTask(){

        GetName.getText().clear();
        GetLastname.getText().clear();
        GetEmail.getText().clear();

        GetLocation.getText().clear();



    }
    @Override
    public void onClick(View v) {

        if (v == btnDatePicker) {

            // Get Current Date
            final Calendar c = Calendar.getInstance();
            mYear = c.get(Calendar.YEAR);
            mMonth = c.get(Calendar.MONTH);
            mDay = c.get(Calendar.DAY_OF_MONTH);


            DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                    new DatePickerDialog.OnDateSetListener() {

                        @Override
                        public void onDateSet(DatePicker view, int year,
                                              int monthOfYear, int dayOfMonth) {

                            txtDate.setText(dayOfMonth + "-" + (monthOfYear + 1) + "-" + year);

                        }
                    }, mYear, mMonth, mDay);
            datePickerDialog.show();
        }
}
    }

