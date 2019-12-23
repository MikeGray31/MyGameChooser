package com.example.MyGameChooser.controllers;

import com.example.MyGameChooser.services.SourceServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SourceController {

    private SourceServices sourceServices;

    @Autowired
    public SourceController(SourceServices sourceServices) {
        this.sourceServices = sourceServices;
    }

}
