package com.example.marek.movieslib.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.marek.movieslib.views.MovieListItemView;

import java.util.List;

import com.example.marek.movieslib.models.MovieModel;

/**
 * Created by Marek on 11.04.2018.
 */

public class MovieItemsAdapter extends RecyclerView.Adapter<MovieItemsAdapter.MovieItemViewHolder> {
    public static class MovieItemViewHolder extends RecyclerView.ViewHolder {
        private MovieListItemView movieItemView;

        public MovieItemViewHolder(View v) {
            super(v);
            movieItemView = (MovieListItemView)v;
        }

        public void bindModel(MovieModel model, View.OnClickListener listener) {
            movieItemView.setModel(model);
            movieItemView.setOnClickListener(listener);
        }
    }

    private List<MovieModel> movies;
    private View.OnClickListener listener;

    public MovieItemsAdapter(List<MovieModel> movies, View.OnClickListener listener) {
        this.movies = movies;
        this.listener = listener;
    }

    @Override
    public MovieItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        MovieListItemView v = new MovieListItemView(parent.getContext(), null);
        v.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT
        ));
        return new MovieItemViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MovieItemViewHolder holder, int position) {
        holder.bindModel(movies.get(position), listener);
    }

    @Override
    public int getItemCount() {
        return movies.size();
    }

    public void removeMovie(int i) {
        if (i < getItemCount()) {
            movies.remove(i);
        }
        notifyDataSetChanged();
    }
}
