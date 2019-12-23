package com.example.MyGameChooser.models;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    private String text;
    private Float score;
    @ManyToOne
    @JoinColumn
    private VideoGame game;
    @ManyToOne
    @JoinColumn
    private Source source;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
