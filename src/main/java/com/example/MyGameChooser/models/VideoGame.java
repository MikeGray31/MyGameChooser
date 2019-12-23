package com.example.MyGameChooser.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VideoGame {

    @Id
    String title;
}
