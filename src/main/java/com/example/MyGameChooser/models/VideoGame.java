package com.example.MyGameChooser.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class VideoGame {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long game_id;
    @Column(name = "title")
    private String title;
    @OneToMany(mappedBy = "game")
    private Set<Review> reviews;

    @ElementCollection
    private Set<String> tags;

    @OneToMany(mappedBy = "video_game")
    private Set<User_Game> user_games;


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

    public Long getGame_id() {
        return game_id;
    }

    public void setGame_id(Long game_id) {
        this.game_id = game_id;
    }

    public Set<User_Game> getUser_games() {
        return user_games;
    }

    public void setUser_games(Set<User_Game> user_games) {
        this.user_games = user_games;
    }
}