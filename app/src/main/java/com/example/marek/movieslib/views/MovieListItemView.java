package com.example.marek.movieslib.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.marek.movieslib.R;

import com.example.marek.movieslib.models.MovieModel;

/**
 * Created by Marek on 14.04.2018.
 */

public class MovieListItemView extends LinearLayout {
    private MovieModel model;
    private ImageView imageView;
    private TextView nameView;
    private TextView categoryView;

    public MovieListItemView(Context context, AttributeSet attributes) {
        super(context, attributes);

        LayoutInflater.from(context).inflate(R.layout.movie_list_item, this, true);
        init();
    }

    public void setModel(MovieModel model) {
        this.model = model;
        update();
    }

    public MovieModel getModel() {
        return model;
    }

    private void update() {
        nameView.setText("\"" + model.getMovieName() + "\"");

        MovieModel.Category category = model.getCategory();
        categoryView.setText(category.name().toUpperCase());
        categoryView.setBackgroundColor(category.getColor());

        imageView.setImageResource(model.getMainPhoto());
    }

    private void init() {
        nameView = findViewById(R.id.movie_name);
        categoryView = findViewById(R.id.movie_category);
        imageView = findViewById(R.id.movie_image);
        imageView.setClipToOutline(true);
    }
}
