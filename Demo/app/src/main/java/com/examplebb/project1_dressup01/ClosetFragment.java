package com.examplebb.project1_dressup01;


import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
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
            View view ;
            view = inflater.inflate(R.layout.fragment_closet,container,false);

        ArrayList<String> data = new ArrayList<String>();
        data.add("Active Jackets");
        data.add("Active Tops");
        data.add("Bags & Bag Straps");
        data.add("Dresses");
        data.add("Hats And Hair");
        data.add("Jewelry");
        data.add("Jumpsuits & Rompers ");
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

        ListView lv_closet = (ListView) view.findViewById(R.id.lv_closet);
        ArrayAdapter<String > adapter = new ArrayAdapter<String>(getContext(),
                android.R.layout.simple_list_item_1,
                data);
        lv_closet.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent myintent = new Intent(view.getContext(), ListActivity.class);
                    startActivityForResult(myintent, 0);
                }
                if(position==1) {
                    Intent myintent1 = new Intent(view.getContext(), ListActivity1.class);
                    startActivityForResult(myintent1, 1);
                }
                if(position==2) {
                    Intent myintent2 = new Intent(view.getContext(), ListActivity2.class);
                    startActivityForResult(myintent2, 2);
                }
                if(position==3) {
                    Intent myintent3 = new Intent(view.getContext(), ListActivity3.class);
                    startActivityForResult(myintent3, 3);
                }
                if(position==4) {
                    Intent myintent4 = new Intent(view.getContext(), ListActivity4.class);
                    startActivityForResult(myintent4, 4);
                }
                if(position==5) {
                    Intent myintent5 = new Intent(view.getContext(), ListActivity5.class);
                    startActivityForResult(myintent5, 5);
                }
                if(position==6) {
                    Intent myintent6 = new Intent(view.getContext(), ListActivity6.class);
                    startActivityForResult(myintent6, 6);
                }
                if(position==7) {
                    Intent myintent7 = new Intent(view.getContext(), ListActivity7.class);
                    startActivityForResult(myintent7, 7);
                }
                if(position==8) {
                    Intent myintent8 = new Intent(view.getContext(), ListActivity8.class);
                    startActivityForResult(myintent8, 8);
                }
                if(position==9) {
                    Intent myintent9 = new Intent(view.getContext(), ListActivity9.class);
                    startActivityForResult(myintent9, 9);
                }
                if(position==10) {
                    Intent myintent10 = new Intent(view.getContext(), ListActivity10.class);
                    startActivityForResult(myintent10, 10);
                }
                if(position==11) {
                    Intent myintent11 = new Intent(view.getContext(), ListActivity11.class);
                    startActivityForResult(myintent11, 11);
                }
                if(position==12) {
                    Intent myintent12 = new Intent(view.getContext(), ListActivity12.class);
                    startActivityForResult(myintent12, 12);
                }
                if(position==13) {
                    Intent myintent13 = new Intent(view.getContext(), ListActivity13.class);
                    startActivityForResult(myintent13, 13);
                }
                if(position==14) {
                    Intent myintent14 = new Intent(view.getContext(), ListActivity14.class);
                    startActivityForResult(myintent14, 14);
                }
                if(position==15) {
                    Intent myintent15 = new Intent(view.getContext(), ListActivity15.class);
                    startActivityForResult(myintent15, 15);
                }
                if(position==16) {
                    Intent myintent16 = new Intent(view.getContext(), ListActivity16.class);
                    startActivityForResult(myintent16, 16);
                }
                if(position==17) {
                    Intent myintent17 = new Intent(view.getContext(), ListActivity17.class);
                    startActivityForResult(myintent17, 17);
                }
                System.out.println("=============================");
                System.out.println("++++++++"+position+"++++++++++");
                System.out.println("=============================");
            }

//            Button camera = (Button) view.findViewById(R.id.camera);
//
//            public void onClick(View v){
//
//            }
        });







        lv_closet.setAdapter(adapter);
        return view ;
    }




}
