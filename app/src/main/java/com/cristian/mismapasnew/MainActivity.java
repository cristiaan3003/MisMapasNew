package com.cristian.mismapasnew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //boton 1
    public void irMapa(View v){

        Intent i= new Intent(this, MapsActivity.class);
        startActivity(i);
    }
    //boton 2
    public void irMapa2(View v){

        Intent i= new Intent(this, MapsActivity2.class);
        startActivity(i);
    }
    //boton 3
    public void irMapa3(View v){

        Intent i= new Intent(this, MapsActivity3.class);
        startActivity(i);
    }
    //boton 4
    public void irMapa4(View v){

        Intent i= new Intent(this, MapsActivity4.class);
        startActivity(i);
    }
}
