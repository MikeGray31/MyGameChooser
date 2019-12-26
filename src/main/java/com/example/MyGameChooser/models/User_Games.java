package com.example.MyGameChooser.models;

import javax.persistence.*;

public class User_Games {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_name")
    private User user;

    @ManyToOne
    @JoinColumn(name = "title")
    private VideoGame videoGame;

    private Float score;
}
