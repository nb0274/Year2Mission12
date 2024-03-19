package com.example.year2mission12;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Spinadapter extends BaseAdapter {
    private Context context;
    private int[] flags;
    private String[] countries;
    private String[] capitals;
    private LayoutInflater inflater;

    public Spinadapter(Context context, int[] flags, String[] countries, String[] capitals){
        this.context = context;
        this.flags = flags;
        this.countries = countries;
        this.capitals = capitals;
        inflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public Object getItem(int i) {
        return countries[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.custom_spin, parent, false);
        ImageView flag = view.findViewById(R.id.flag);
        TextView country = view.findViewById(R.id.country);
        TextView capital = view.findViewById(R.id.capital);
        flag.setImageResource(flags[i]);
        country.setText(countries[i]);
        capital.setText(capitals[i]);
        return view;
    }
}