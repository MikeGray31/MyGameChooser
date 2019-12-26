package com.example.MyGameChooser.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Set;

@Entity
public class User {

    @Id
    private String user_name;
    private String password;

    @ManyToMany
    private Set<VideoGame> played_games;

}
