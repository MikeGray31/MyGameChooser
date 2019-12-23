package com.example.MyGameChooser.services;

import com.example.MyGameChooser.repositories.SourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SourceServices {

    private SourceRepository sourceRepository;

    @Autowired
    public SourceServices(SourceRepository sourceRepository) {
        this.sourceRepository = sourceRepository;
    }
}
