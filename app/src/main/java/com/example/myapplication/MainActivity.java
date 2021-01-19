package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

  private   TextView nm,cert;
   private ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    //    nm=findViewById(R.id.name);
        cert=findViewById(R.id.certi);
        img=findViewById(R.id.pic);

        String nm=DbQuery.myprofile.getName();

    }
}