package com.example.MyGameChooser.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {

    @Id
    private String user_name;
    private String password;

    @OneToMany(mappedBy = "user")
    User_Games user_games;

}
