package com.example.savethebird.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.savethebird.R;


public class FactDogFragment extends Fragment {


        public FactDogFragment(){}



        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_fact_dog, container, false);
            return rootView;

        }
}