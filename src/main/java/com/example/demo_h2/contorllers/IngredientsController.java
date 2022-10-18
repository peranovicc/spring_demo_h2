package com.example.demo_h2.contorllers;

import com.example.demo_h2.services.IngredientsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class IngredientsController {
    private final IngredientsService ingredientsService;

    @Autowired
    public IngredientsController(IngredientsService ingredientsService) {
        this.ingredientsService = ingredientsService;
    }

    @PostMapping("/initiate/h2")
    public void initiateInMemoryDB() throws IOException {
        ingredientsService.initiateDatabase();
    }
}
