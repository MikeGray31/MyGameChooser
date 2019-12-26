package com.example.MyGameChooser.models;

import javax.persistence.*;

@Entity
public class User_Games {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "game_id")
    private VideoGame video_game;

    private Float score;
}
