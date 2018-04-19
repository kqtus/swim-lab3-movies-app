package com.example.marek.movieslib.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.View;

import com.example.marek.movieslib.callbacks.MenuSwipeCallback;
import com.example.marek.movieslib.utilities.DataProvider;
import com.example.marek.movieslib.views.MovieListItemView;
import com.example.marek.movieslib.R;
import com.example.marek.movieslib.adapters.MovieItemsAdapter;

import com.example.marek.movieslib.models.MovieModel;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.items_recycler_view);
        recyclerView.setHasFixedSize(true);

        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);


        View.OnClickListener onMovieItemClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent previewMovieIntent = new Intent(v.getContext(), MoviePreviewActivity.class);

                MovieModel model = ((MovieListItemView)v).getModel();
                previewMovieIntent.putExtra("model", model);
                startActivity(previewMovieIntent);
            }
        };

        adapter = new MovieItemsAdapter(DataProvider.getData(), onMovieItemClickListener);
        recyclerView.setAdapter(adapter);

        MenuSwipeCallback swipeCallback = new MenuSwipeCallback((MovieItemsAdapter)adapter);
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(swipeCallback);
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }
}
