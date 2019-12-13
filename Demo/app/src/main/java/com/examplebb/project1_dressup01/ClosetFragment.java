package com.examplebb.project1_dressup01;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ClosetFragment extends Fragment {


    public ClosetFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_closet,container,false);

        ArrayList<String> data = new ArrayList<String>();
        data.add("Active Jackets");
        data.add("Active Tops");
        data.add("Bags & Bag Straps");
        data.add("Dresses");
        data.add("Hats And Hair");
        data.add("Jewelry");
        data.add("Jumpsuits & Rompers");
        data.add("Leggings");
        data.add("Outerwear");
        data.add("Pants");
        data.add("Scarves");
        data.add("Shoes");
        data.add("Shorts");
        data.add("Skirts");
        data.add("Sports Bras");
        data.add("Sunglasses");
        data.add("Swimwear");
        data.add("Top");


        ArrayAdapter<String > adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1,
                data);

        ListView lv_closet = (ListView) view.findViewById(R.id.lv_closet);
        lv_closet.setAdapter(adapter);
        return view ;
    }

}
