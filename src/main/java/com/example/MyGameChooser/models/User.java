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
    private Set<User_Game> user_games;


    public Long getUser_id() {
        return user_id;
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<User_Game> getUser_games() {
        return user_games;
    }

    public void setUser_games(Set<User_Game> user_games) {
        this.user_games = user_games;
    }
}
