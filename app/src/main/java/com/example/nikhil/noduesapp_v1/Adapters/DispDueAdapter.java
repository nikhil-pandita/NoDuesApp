package com.example.nikhil.noduesapp_v1.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.nikhil.noduesapp_v1.Nodues_DispInfo;
import com.example.nikhil.noduesapp_v1.R;

import java.util.ArrayList;

/**
 * Created by Nikhil on 10/4/2017.
 */

public class DispDueAdapter extends ArrayAdapter<Nodues_DispInfo> {
    public DispDueAdapter(Context context, ArrayList<Nodues_DispInfo> Nodues_DispInfos) {
        super(context, 0, Nodues_DispInfos);
    }

        @Override

        public View getView(int position, View convertView, ViewGroup parent) {
            // Get the data item for this position
            Nodues_DispInfo nodues_dispinfo = getItem(position);
            // Check if an existing view is being reused, otherwise inflate the view
            if (convertView == null) {
                convertView = LayoutInflater.from(getContext()).inflate(R.layout.nodues_disp_form_item, parent, false);
            }
            // Lookup view for data population
            TextView Due_display= (TextView) convertView.findViewById(R.id.Due_display);
            TextView Due_Number = (TextView) convertView.findViewById(R.id.Due_Number);
            // Populate the data into the template view using the data object
            Due_display.setText(nodues_dispinfo.nodues_dispinfo);
            Due_Number.setText(nodues_dispinfo.nodues_dispinfonumber);
            // Return the completed view to render on screen
            return convertView;
        }
    }

