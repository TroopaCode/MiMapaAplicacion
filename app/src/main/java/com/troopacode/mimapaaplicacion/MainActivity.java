package com.troopacode.mimapaaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageViewChichenItza = findViewById(R.id.imageViewChichenItza);
        imageViewMazatlan = findViewById(R.id.imageViewMazatlan);
        imageViewMonterrey = findViewById(R.id.imageViewMonterrey);
        imageViewZacatecas = findViewById(R.id.imageViewZacatecas);
    }


    ImageView imageViewZacatecas, imageViewMazatlan, imageViewMonterrey, imageViewChichenItza;
    public void mandarMapa(View v)
    {
        double lat=0, lon=0;
        if(v.equals(imageViewChichenItza))
        {
            lat=20.68285195;
            lon=-88.5687196355205;
        }
        if(v.equals(imageViewZacatecas))
        {
            lat=22.7753891;
            lon=-102.5722706;
        }
        if(v.equals(imageViewMonterrey))
        {
            lat=25.6802019;
            lon=-100.3152586;
        }
        if(v.equals(imageViewMazatlan))
        {
            lat=23.2313053;
            lon=-106.4153144;
        }
        Intent intent = new Intent(MainActivity.this, MapsActivity.class);
        intent.putExtra("latitud", lat);
        intent.putExtra("longitud", lon);
        startActivity(intent);
    }
}