package com.example.MyGameChooser.controllers;


import com.example.MyGameChooser.services.ReviewServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
// a new comment
@Controller
public class ReviewController {

    private ReviewServices reviewServices;

    @Autowired
    public ReviewController(ReviewServices reviewServices) {
        this.reviewServices = reviewServices;
    }
}
