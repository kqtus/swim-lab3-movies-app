package com.example.marek.movieslib.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.example.marek.movieslib.R;

import com.example.marek.movieslib.models.MovieModel;

/**
 * Created by Marek on 14.04.2018.
 */

public class MoviePhotosFragment extends MovieFragment {
    public class MoviePhotosAdapter extends BaseAdapter {
        private MovieModel model;

        public MoviePhotosAdapter(MovieModel model) {
            this.model = model;
        }

        @Override
        public int getCount() {
            if (model != null) {
                return model.getPhotosShots().size();
            }
            return 0;
        }

        @Override
        public Object getItem(int position) {
            if (model != null) {
                return model.getPhotosShots().get(position);
            }
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView view;

            if (convertView == null) {
                view = new ImageView(getContext());
                view.setLayoutParams(new ViewGroup.LayoutParams(200, 200));
                view.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
            else {
                view = (ImageView)convertView;
            }

            view.setImageResource((Integer)getItem(position));
            return view;
        }
    }

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.movie_photos_list, container, false);
        update();
        setRetainInstance(true);
        return rootView;
    }

    @Override
    public void update() {
        if (rootView != null) {
            ((GridView)rootView).setAdapter(new MoviePhotosAdapter(model));
        }
    }

    @Override
    public String getName() {
        return "Photos";
    }
}
