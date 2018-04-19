package com.example.marek.movieslib.fragments;

import android.support.v4.app.Fragment;

import com.example.marek.movieslib.models.MovieModel;

/**
 * Created by Marek on 14.04.2018.
 */

public abstract class MovieFragment extends Fragment {
    protected MovieModel model;

    public void setModel(MovieModel model) {
        this.model = model;
        setRetainInstance(true);
        update();
    }

    public abstract void update();

    public abstract String getName();
}
