package com.example.enghaya.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ENG.HAYA on 8/24/2017 AD.
 */

public class coffeeshope_fragment extends Fragment {
    public static final String NAME = "Malls";

    public coffeeshope_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_coffeeshope, container, false);

        ArrayList<information> tourItems = new ArrayList<>();

        tourItems.add(new information("","","", R.drawable.monuments));

        ListView listView = (ListView) rootView.findViewById(R.id.coffeeshopid);
        TourAdapter tourAdapter = new TourAdapter(rootView.getContext(), tourItems);
        listView.setAdapter((ListAdapter) tourAdapter);

        return rootView;
    }

}

