package com.example.marek.movieslib.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.marek.movieslib.R;
import com.example.marek.movieslib.models.MovieModel;
import com.example.marek.movieslib.models.RoleModel;

/**
 * Created by Marek on 14.04.2018.
 */

public class RoleListItemView extends LinearLayout {
    private RoleModel model;
    private ImageView photoView;
    private TextView fullNameView;
    private TextView roleNameView;

    public RoleListItemView(Context context, AttributeSet attributes) {
        super(context, attributes);

        LayoutInflater.from(context).inflate(R.layout.role_list_item, this, true);
        init();
    }

    public void setModel(RoleModel model) {
        this.model = model;
        update();
    }

    public RoleModel getModel() {
        return model;
    }

    private void update() {
        fullNameView.setText(model.getActor().getFirstName() + " " + model.getActor().getLastName());
        roleNameView.setText("as " + model.getName());
        photoView.setImageResource(model.getActor().getPhoto());
    }

    private void init() {
        fullNameView = findViewById(R.id.role_item_full_name);
        roleNameView = findViewById(R.id.role_item_role);
        photoView = findViewById(R.id.role_item_photo);
    }
}
