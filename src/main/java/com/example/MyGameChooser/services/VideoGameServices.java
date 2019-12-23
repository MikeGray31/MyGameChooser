package com.example.MyGameChooser.services;

import com.example.MyGameChooser.repositories.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VideoGameServices {

    private VideoGameRepository videoGameRepository;

    @Autowired
    public VideoGameServices(VideoGameRepository videoGameRepository) {
        this.videoGameRepository = videoGameRepository;
    }
}
