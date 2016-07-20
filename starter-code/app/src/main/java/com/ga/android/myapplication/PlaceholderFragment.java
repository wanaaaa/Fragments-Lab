package com.ga.android.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by alanjcaceres on 7/19/16.
 */

public class PlaceholderFragment extends Fragment {
   ListView listView;
   //This is a blank fragment
   //Implement your own version of Fragments for this lab
   @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                            Bundle savedInstanceState) {
      View rootView = inflater.inflate(R.layout.about_me, container, false);

      listView = (ListView) rootView.findViewById(R.id.listview_aboutMe);
      ArrayList<String> arrayList = new ArrayList<>();
      ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, arrayList);

      arrayList.add("android");
      arrayList.add("human");
      arrayList.add("phone");
      arrayList.add("food");
      listView.setAdapter(arrayAdapter);

      return rootView;

   }


}
