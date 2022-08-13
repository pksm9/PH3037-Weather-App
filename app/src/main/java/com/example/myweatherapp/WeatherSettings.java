package com.example.myweatherapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class WeatherSettings extends AppCompatActivity {

    TextView inputCity, labelCity, inputUnits;
    String city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_settings);

        inputCity = findViewById(R.id.txtCity);
        labelCity = findViewById(R.id.inputCity);

        inputCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cityDialogBox();
            }
        });

        labelCity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cityDialogBox();
            }
        });
    }

    public void cityDialogBox() {
        AlertDialog.Builder alertCity = new AlertDialog.Builder(WeatherSettings.this);
        alertCity.setTitle("Enter City");
        final EditText input = new EditText(WeatherSettings.this);
        alertCity.setView(input);

        alertCity.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                city = input.getText().toString();
                Toast.makeText(getApplicationContext(), "Successfully Changed Location", Toast.LENGTH_LONG).show();
                finish();
            }
        });

        alertCity.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
            }
        });

        alertCity.show();
    }
}