package com.example.MyGameChooser.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class VideoGame {

    @Id
    private String title;
    @OneToMany(mappedBy = "game")
    private Set<Review> reviews;
    @ElementCollection
    private Set<String> tags;

    @OneToMany(mappedBy = "video_game")
    User_Games user_games;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    public Set<String> getTags() {
        return tags;
    }

    public void setTags(Set<String> tags) {
        this.tags = tags;
    }
}