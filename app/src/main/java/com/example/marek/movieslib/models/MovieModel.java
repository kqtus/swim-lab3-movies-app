package com.example.marek.movieslib.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Marek on 11.04.2018.
 */

public class MovieModel implements Serializable {
    public enum Category {
        Action(0xff17b271),
        Adventure(0xff45b217),
        Comedy(0xffb29a17),
        Crime(0xffb21717),
        Drama(0xffb2175c),
        Fantasy(0xff174db2),
        Historical(0xffb24f17),
        Horror(0xff430077),
        Mystery(0xff8317b2),
        Paranoid(0xffb21757),
        Philosophical(0xff17acb2),
        Political(0xff93b217),
        Romance(0xffb217a7),
        Saga(0xff8e8c4a),
        Satire(),
        SF(0xff4a8e4d),
        Social(0xff4a708e),
        Thriller(0xff000000),
        Urban(0xff3e8e85),
        Western(0xffaaad00);

        int color;

        private Category() {
            this(0, 0, 0, 255);
        }

        private Category(int color) {
            this.color = color;
        }
        private Category(int r, int g, int b, int a) {
            color = a << 24 | r << 16 | g << 8 | b;
        }

        public int getColor() {
            return color;
        }
    }

    private String movieName;
    private String movieDescription;
    private Category category;
    private Integer mainPhoto; // To be changed to URI
    private ArrayList<Integer> photosShots; // To be changed for list of URIs
    private ArrayList<RoleModel> roleModels;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDescription() {
        return movieDescription;
    }

    public void setMovieDescription(String movieDescription) {
        this.movieDescription = movieDescription;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Integer getMainPhoto() {
        return mainPhoto;
    }

    public void setMainPhoto(Integer mainPhoto) {
        this.mainPhoto = mainPhoto;
    }

    public ArrayList<Integer> getPhotosShots() {
        return photosShots;
    }

    public void setPhotosShots(ArrayList<Integer> photosShots) {
        this.photosShots = photosShots;
    }

    public ArrayList<RoleModel> getRoleModels() {
        return roleModels;
    }

    public void setRoleModels(ArrayList<RoleModel> roleModels) {
        this.roleModels = roleModels;
    }

    public MovieModel(String movieName, Category category, String movieDescription, int photo)
    {
        this.movieName = movieName;
        this.category = category;
        this.movieDescription = movieDescription;
        this.mainPhoto = photo;

        roleModels = new ArrayList<>();
        photosShots = new ArrayList<>();
    }
}
