package com.example.marek.movieslib.fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.marek.movieslib.R;
import com.example.marek.movieslib.models.RoleModel;
import com.example.marek.movieslib.views.RoleListItemView;

import java.util.ArrayList;

/**
 * Created by Marek on 14.04.2018.
 */

public class MovieActorsFragment extends MovieFragment {
    public class RolesListAdapter extends ArrayAdapter<RoleModel> {
        private ArrayList<RoleModel> roles;

        public RolesListAdapter(Context context, ArrayList<RoleModel> roles) {
            super(context, 0, roles);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            RoleModel role = getItem(position);

            if (convertView == null) {
                convertView = new RoleListItemView(parent.getContext(), null);
            }

            ((RoleListItemView)convertView).setModel(role);
            return convertView;
        }
    }

    private View rootView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.movie_roles_list, container, false);
        update();
        setRetainInstance(true);
        return rootView;
    }

    @Override
    public void update() {
        if (rootView != null && model != null) {
            ((ListView)rootView).setAdapter(new RolesListAdapter(getContext(), model.getRoleModels()));
        }
    }

    @Override
    public String getName() {
        return "Actors";
    }
}
