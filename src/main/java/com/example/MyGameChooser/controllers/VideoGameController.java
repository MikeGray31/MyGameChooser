package com.example.MyGameChooser.controllers;

import com.example.MyGameChooser.services.VideoGameServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class VideoGameController {


    private VideoGameServices videoGameServices;

    @Autowired
    public VideoGameController(VideoGameServices videoGameServices) {
        this.videoGameServices = videoGameServices;
    }

}
