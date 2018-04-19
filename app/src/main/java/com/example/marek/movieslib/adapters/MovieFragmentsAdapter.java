package com.example.marek.movieslib.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.marek.movieslib.fragments.MovieActorsFragment;
import com.example.marek.movieslib.fragments.MovieDescriptionFragment;
import com.example.marek.movieslib.fragments.MovieFragment;
import com.example.marek.movieslib.fragments.MoviePhotosFragment;

import java.util.ArrayList;
import java.util.List;

import com.example.marek.movieslib.models.MovieModel;

/**
 * Created by Marek on 14.04.2018.
 */

public class MovieFragmentsAdapter extends FragmentPagerAdapter {
    private MovieModel model;
    private List<MovieFragment> fragments;

    public MovieFragmentsAdapter(MovieModel model, FragmentManager fm) {
        super(fm);
        this.model = model;

        init();
    }

    private void init() {
        fragments = new ArrayList<>();
        fragments.add(new MovieDescriptionFragment());
        fragments.add(new MoviePhotosFragment());
        fragments.add(new MovieActorsFragment());

        for (MovieFragment fragment : fragments) {
            fragment.setModel(model);
        }
    }

    @Override
    public Fragment getItem(int i) {
        return fragments.get(i);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int i) {
        return fragments.get(i).getName();
    }
}
