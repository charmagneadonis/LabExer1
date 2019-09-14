package com.adonis.labexer1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
    }

    public void backfunction (View v) {
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }

    public void ustLib (View v) {
        Intent i = new Intent (Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.ust.edu.ph/academics/miguel-de-benavides-library/"));
        startActivity(i);
    }

    public void ustChurch (View v) {
        Intent i = new Intent (Intent.ACTION_VIEW);
        i.setData(Uri.parse("http://www.ust.edu.ph/faith/santissimo-rosario-parish/"));
        startActivity(i);
    }

    public void mainBuilding (View v) {
        Intent i = new Intent (Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/University_of_Santo_Tomas_Main_Building"));
        startActivity(i);
    }

    public void ustArch (View v) {
        Intent i = new Intent (Intent.ACTION_VIEW);
        i.setData(Uri.parse("https://en.wikipedia.org/wiki/Arch_of_the_Centuries"));
        startActivity(i);
    }
}
