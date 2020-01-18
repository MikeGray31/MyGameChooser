package com.example.MyGameChooser.controllers;

import com.example.MyGameChooser.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private UserServices userServices;

    @Autowired
    public UserController (UserServices userServices){
        this.userServices = userServices;
    }


}
