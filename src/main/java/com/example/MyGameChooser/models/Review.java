package com.example.MyGameChooser.models;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long review_id;
    private String text;
    private Float score;
    @ManyToOne
    @JoinColumn(name = "game_id")
    private VideoGame game;
    @ManyToOne
    @JoinColumn(name = "source_id")
    private Source source;

    public Long getId() {
        return review_id;
    }

    public void setId(Long id) {
        this.review_id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public VideoGame getGame() {
        return game;
    }

    public void setGame(VideoGame game) {
        this.game = game;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }
}
