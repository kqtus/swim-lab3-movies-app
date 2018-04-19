package com.example.marek.movieslib.callbacks;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.example.marek.movieslib.adapters.MovieItemsAdapter;

/**
 * Created by Marek on 19.04.2018.
 */

public class MenuSwipeCallback extends ItemTouchHelper.SimpleCallback {
    private MovieItemsAdapter adapter;

    public MenuSwipeCallback(MovieItemsAdapter adapter) {
        super(0, ItemTouchHelper.LEFT);
        this.adapter = adapter;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int swipeDir) {
        int pos = viewHolder.getAdapterPosition();
        if (adapter != null) {
            adapter.removeMovie(pos);
        }
    }
}
