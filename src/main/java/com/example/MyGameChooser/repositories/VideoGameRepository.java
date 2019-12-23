package com.example.MyGameChooser.repositories;

import com.example.MyGameChooser.controllers.VideoGameController;
import com.example.MyGameChooser.models.VideoGame;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VideoGameRepository extends CrudRepository<VideoGame, String> {

}
