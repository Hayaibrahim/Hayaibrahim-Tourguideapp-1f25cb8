package com.example.enghaya.tourguideapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static android.databinding.DataBindingUtil.setContentView;

/**
 * Created by ENG.HAYA on 8/24/2017 AD.
 */

public class university_fragment extends  Fragment{
public university_fragment (){

}

     public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.fragment_unversity, container, false);
         String[] menu = {"King fahad " ,"narjes", " haya aldkaan"};
         ListView listview = (ListView) view.findViewById(R.id.unversityid);
         ArrayAdapter<String> listviewadapter = new ArrayAdapter<String>(
                 getActivity(),
                 android.R.layout.simple_list_item_1, menu

         );
         listview.setAdapter(listviewadapter);
         return view;


     }
    }

