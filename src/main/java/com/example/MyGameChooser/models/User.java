package com.example.MyGameChooser.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;

    @Column(name = "user_name")
    private String user_name;

    private String password;

    @OneToMany(mappedBy = "user")
    private Set<User_Games> user_games;
}
