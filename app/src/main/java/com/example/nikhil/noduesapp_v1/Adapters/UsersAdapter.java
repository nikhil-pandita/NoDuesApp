package com.example.nikhil.noduesapp_v1.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.nikhil.noduesapp_v1.Nodues_F;
import com.example.nikhil.noduesapp_v1.R;

import java.util.ArrayList;

/**
 * Created by Nikhil on 10/3/2017.
 */

public class UsersAdapter extends ArrayAdapter<Nodues_F> {
    public UsersAdapter(Context context, ArrayList<Nodues_F> Nodues_Fs) {
        super(context, 0, Nodues_Fs);
    }

    @Override

    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Nodues_F nodues_f = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.nodues_complains, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        // Populate the data into the template view using the data object
        tvName.setText(nodues_f.nodues_fault);
        // Return the completed view to render on screen
        return convertView;
    }
}
