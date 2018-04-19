package com.example.marek.movieslib.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.marek.movieslib.R;

/**
 * Created by Marek on 14.04.2018.
 */

public class MovieDescriptionFragment extends MovieFragment {
    private TextView descriptionView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.movie_description, container, false);
        descriptionView = rootView.findViewById(R.id.movie_description_text);
        update();
        setRetainInstance(true);
        return rootView;
    }

    @Override
    public void update() {
        if (descriptionView != null && model != null) {
            descriptionView.setText(model.getMovieDescription());
        }
    }

    @Override
    public String getName() {
        return "Description";
    }
}
