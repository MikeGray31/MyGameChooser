package com.example.MyGameChooser.services;

import com.example.MyGameChooser.models.User;
import com.example.MyGameChooser.models.User_Game;
import com.example.MyGameChooser.models.VideoGame;
import com.example.MyGameChooser.repositories.UserRepository;
import com.example.MyGameChooser.repositories.VideoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserServices {

    private UserRepository userRepository;
    private VideoGameRepository videoGameRepository;

    @Autowired
    public UserServices(UserRepository userRepository, VideoGameRepository videoGameRepository){
        this.userRepository = userRepository;
        this.videoGameRepository = videoGameRepository;
    }

    public void createUser(User newUser){
        userRepository.save(newUser);
    }

    public User getUser(Long id) {
        if(userRepository.findById(id).isPresent()) {
            return userRepository.findById(id).get();
        }
        return null;
    }

    public void deleteUser(Long id){
        userRepository.delete(userRepository.findById(id).get());
    }

    public void playAndRateGame(Long user_id, VideoGame game, Float rating, String review) {
        User user = getUser(user_id);
        Set<User_Game> user_games_from_user = user.getUser_games();
        Set<User_Game> user_games_from_game= game.getUser_games();
        User_Game newUser_game = new User_Game();
        newUser_game.setUser(user);
        newUser_game.setVideo_game(game);
        newUser_game.setScore(rating);
        newUser_game.setReview(review);
        user_games_from_user.add(newUser_game);
        user_games_from_game.add(newUser_game);
        user.setUser_games(user_games_from_user);
        game.setUser_games(user_games_from_game);
        userRepository.save(user);
        videoGameRepository.save(game);
    }
}
