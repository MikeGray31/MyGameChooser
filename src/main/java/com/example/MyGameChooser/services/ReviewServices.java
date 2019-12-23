package com.example.MyGameChooser.services;

import com.example.MyGameChooser.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServices {

    private ReviewRepository reviewRepository;

    @Autowired
    public ReviewServices(ReviewRepository reviewRepository) {
        this.reviewRepository = reviewRepository;
    }
}
