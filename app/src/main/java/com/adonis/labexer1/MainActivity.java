package com.adonis.labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void viewPlaces (View v) {
        Intent i = new Intent (this, SecondPage.class);
        startActivity(i);
    }

    public void viewCatalog (View v) {
        Log.d("USTPlaces", "UST Places:");
        Log.d("USTPlaces", "Miguel de Benavides Library");
        Log.d("USTPlaces", "Santissimo Rosario Parish");
        Log.d("USTPlaces", "UST Main Building");
        Log.d("USTPlaces", "Arch of the Centuries");
    }
}
