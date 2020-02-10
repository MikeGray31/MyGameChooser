package com.example.MyGameChooser.services;

import com.example.MyGameChooser.models.VideoGame;
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

    public VideoGame createGame(VideoGame newGame){
        this.videoGameRepository.save(newGame);
        return newGame;
    }

    public VideoGame findGame(String title){
        return this.videoGameRepository.findById(title).get();
    }
}
