package com.example.enghaya.tourguideapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by ENG.HAYA on 8/24/2017 AD.
 */

public class supermarket_fragment extends Fragment {


    public supermarket_fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_supermarket, container, false);

        ArrayList<information> Items = new ArrayList<>();

          Items.add(new information("jeedah","king fahad road ","slmam bin salam strat ",R.drawable.monuments));
        Items.add(new information("jeedah","king fahad road ","slmam bin salam strat ",R.drawable.monuments));
        Items.add(new information("jeedah","king fahad road ","slmam bin salam strat ",R.drawable.monuments));





        ListView listView = (ListView) rootView.findViewById(R.id.supermarketid);
        TourAdapter tourAdapter = new TourAdapter(rootView.getContext(), Items);
        listView.setAdapter((ListAdapter) tourAdapter);

        return rootView;
    }


}
