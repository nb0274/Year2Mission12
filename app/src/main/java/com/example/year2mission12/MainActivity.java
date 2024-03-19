package com.example.year2mission12;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  implements AdapterView.OnItemSelectedListener {
    int[] flags = {R.drawable.USflag, R.drawable.CHflag, R.drawable.INflag, R.drawable.BRflag, R.drawable.RSflag,R.drawable.JAflag,R.drawable.GMflag};
    String[] countries = {"United States", "China", "India", "Brazil", "Russia", "Japan", "Germany"};
    String[] capitals = {"Washington, D.C.", "Beijing", "New Delhi", "Brasília", "Moscow", "Tokyo", "Berlin"};
    String[] populations = {"331 million", "1.4 billion", "1.39 billion", "213 million", "146 million", "126 million", "83 million"};
    Spinner spin;
    TextView info;
    Spinadapter adp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spin = findViewById(R.id.spin);
        info = findViewById(R.id.info);
        adp = new Spinadapter(this, flags, countries, capitals);
        spin.setAdapter(adp);
        spin.setOnItemSelectedListener(this);
        info.setText("Country:\nCapital:\nPopulation:");

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        info.setText("Country: " + countries[i] + "\n" + "Capital: " + capitals[i] + "\n" + "Population: " + populations[i]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}