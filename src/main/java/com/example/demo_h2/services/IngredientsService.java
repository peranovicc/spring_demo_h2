package com.example.demo_h2.services;

import com.example.demo_h2.repositories.interfaces.IngredientsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class IngredientsService {
    private IngredientsRepository ingredientsRepository;

    @Autowired
    public IngredientsService(IngredientsRepository ingredientsRepository){
        this.ingredientsRepository = ingredientsRepository;
    }

    public void initiateDatabase() throws IOException {

        // ingredientsRepository.saveAll();
    }
}
