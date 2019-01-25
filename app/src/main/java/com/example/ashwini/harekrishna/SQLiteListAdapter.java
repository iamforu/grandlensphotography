package com.example.ashwini.harekrishna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;


import java.util.ArrayList;

/**
 * Created by ASHWINI on 12/19/2017.
 */

public class SQLiteListAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> userID;
    ArrayList<String> UserName;
    ArrayList<String> UserLastname;
    ArrayList<String>  Useremail;
    ArrayList<String> User_PhoneNumber;
    ArrayList<String> UserDate;
    ArrayList<String> Userlocation;
    ArrayList<String>  Uservenue;


    public SQLiteListAdapter(
            Context context2,
            ArrayList<String> id,
            ArrayList<String> name,
            ArrayList<String>  lastname,
            ArrayList<String>  email,
            ArrayList<String> phone,
            ArrayList<String>  date,
            ArrayList<String>  location,
            ArrayList<String> venue
    )
    {

        this.context = context2;
        this.userID = id;
        this.UserName = name;
        this.UserLastname=lastname;
        this.Useremail=email;
        this.User_PhoneNumber = phone;
        this.UserDate=date;
        this.Userlocation=location;
        this.Uservenue = venue ;
    }

    public int getCount() {
        // TODO Auto-generated method stub
        return userID.size();
    }

    public Object getItem(int position) {
        // TODO Auto-generated method stub
        return null;
    }

    public long getItemId(int position) {
        // TODO Auto-generated method stub
        return 0;
    }

    public View getView(int position, View child, ViewGroup parent) {

        Holder holder;

        LayoutInflater layoutInflater;

        if (child == null) {
            layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            child = layoutInflater.inflate(R.layout.listviewdatalayout, null);

            holder = new Holder();

            holder.textviewid = (TextView) child.findViewById(R.id.textViewID);
            holder.textviewname = (TextView) child.findViewById(R.id.textViewNAME);
            holder.textviewlastname=(TextView) child.findViewById(R.id.textViewLASTNAME);
            holder.textviewemail=(TextView) child.findViewById(R.id.textViewEMAIL);
            holder.textviewphone_number = (TextView) child.findViewById(R.id.textViewPHONE_NUMBER);
            holder.textviewdate = (TextView) child.findViewById(R.id.textViewDATE);
            holder.textviewlocation = (TextView) child.findViewById(R.id.textViewLOCATION);
            holder.textviewvenue = (TextView) child.findViewById(R.id.textViewVENUE);

            child.setTag(holder);

        } else {

            holder = (Holder) child.getTag();
        }
        holder.textviewid.setText(userID.get(position));
        holder.textviewname.setText(UserName.get(position));
        holder.textviewlastname.setText(UserLastname.get(position));
        holder.textviewemail.setText(Useremail.get(position));
        holder.textviewphone_number.setText(User_PhoneNumber.get(position));
        holder.textviewdate.setText(UserDate.get(position));
        holder.textviewlocation.setText(Userlocation.get(position));
        holder.textviewvenue.setText(Uservenue.get(position));


        return child;
    }

    public class Holder {
        TextView textviewid;
        TextView textviewname;
        TextView textviewlastname;
        TextView textviewemail;
        TextView textviewphone_number;
        TextView textviewdate;
        TextView textviewlocation;
        TextView textviewvenue;
    }

}