package com.example.ashwini.harekrishna;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

import static com.example.ashwini.harekrishna.R.drawable.bride;

public class fraghome extends Fragment {
    ImageView fashionImg;
    ImageView abc;
    ImageView candid;
    ImageView bride;
    Button btnC;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //returning our layout file
        //change R.layout.yourlayoutfilename for each of your fragments
        return inflater.inflate(R.layout.activity_fraghome, container, false);

    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //you can set the title for your toolbar here for different fragments different titles
        getActivity().setTitle("welcome to IAMFORU PHOTOGRAPHY");
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        // get the button view
        fashionImg = (ImageView) getView().findViewById(R.id.image1);
        // set a onclick listener for when the button gets clicked
        fashionImg.setOnClickListener(new View.OnClickListener() {
            // Start new list activity
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(),
                        galleryone.class);
                startActivity(mainIntent);
            }
        });
        {
            // TODO Auto-generated method stub
            super.onActivityCreated(savedInstanceState);
            // get the button view
            abc = (ImageView) getView().findViewById(R.id.image4);
            // set a onclick listener for when the button gets clicked
            abc.setOnClickListener(new View.OnClickListener() {
                // Start new list activity
                public void onClick(View v) {
                    Intent mainIntent = new Intent(getActivity(),
                            couplecatlo.class);
                    startActivity(mainIntent);
                }
            });
            {
                // TODO Auto-generated method stub
                super.onActivityCreated(savedInstanceState);
                // get the button view
                bride = (ImageView) getView().findViewById(R.id.image2);
                // set a onclick listener for when the button gets clicked
                bride.setOnClickListener(new View.OnClickListener() {
                    // Start new list activity
                    public void onClick(View v) {
                        Intent mainIntent = new Intent(getActivity(),
                                Bridecatalog.class);
                        startActivity(mainIntent);
                    }
                });
                {
                    // TODO Auto-generated method stub
                    super.onActivityCreated(savedInstanceState);
                    // get the button view
                    candid = (ImageView) getView().findViewById(R.id.image3);
                    // set a onclick listener for when the button gets clicked
                    candid.setOnClickListener(new View.OnClickListener() {
                        // Start new list activity
                        public void onClick(View v) {
                            Intent mainIntent = new Intent(getActivity(),
                                    candidslider.class);
                            startActivity(mainIntent);
                        }
                    });
                    class fragment extends AppCompatActivity {
                        @Override
                        protected void onCreate(Bundle savedInstanceState) {
                            super.onCreate(savedInstanceState);
                            setContentView(R.layout.activity_fraghome);

                        }
                    }
                }

            }
        }


    }
}
