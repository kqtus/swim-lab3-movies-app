package com.example.marek.movieslib.activities;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.marek.movieslib.R;
import com.example.marek.movieslib.adapters.MovieFragmentsAdapter;

import com.example.marek.movieslib.models.MovieModel;

/**
 * Created by Marek on 14.04.2018.
 */

public class MoviePreviewActivity extends AppCompatActivity {
    private ImageView imageView;
    private TextView titleView;
    private TextView categoryView;

    private MovieModel model;
    private ViewPager fragmentsPager;
    private PagerTabStrip fragmentsTabStrip;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getResources().getConfiguration().orientation ==
                Configuration.ORIENTATION_PORTRAIT) {
            setContentView(R.layout.movie_preview);
        } else {
            setContentView(R.layout.movie_preview_vertical);
        }
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
        imageView.setImageResource(model.getMainPhoto());
        titleView.setText("\"" + model.getMovieName() + "\"");

        MovieModel.Category category = model.getCategory();
        categoryView.setText(category.toString().toUpperCase());
        categoryView.setBackgroundColor(category.getColor());

        //fragmentsTabStrip.setTextColor(category.getColor());
    }

    private void init()
    {
        imageView = findViewById(R.id.movie_main_image);
        titleView = findViewById(R.id.movie_main_title);
        categoryView = findViewById(R.id.movie_main_category);
        fragmentsPager = findViewById(R.id.movie_main_pager);
        fragmentsTabStrip = findViewById(R.id.movie_main_pager_strip);

        Bundle extras = getIntent().getExtras();

        if (extras != null) {
            setModel((MovieModel)extras.getSerializable("model"));
        }

        MovieFragmentsAdapter fragmentsAdapter = new MovieFragmentsAdapter(model, getSupportFragmentManager());
        fragmentsPager.setAdapter(fragmentsAdapter);
    }
}
