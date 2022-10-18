package com.example.demo_h2.contorllers;

import com.example.demo_h2.models.Entities.Recipe;
import com.example.demo_h2.models.ExtendedRecipe;
import com.example.demo_h2.models.ExtendedRecipeDetails;
import com.example.demo_h2.services.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/api/recipes")
    public List<Recipe> getAllRecipes(){
        return recipeService.getAllRecipes();
    }

    @GetMapping("/api/recipes/extended")
    public List<ExtendedRecipe> getAllRecipesExtended(){
        return recipeService.getAllRecipesExtended();
    }

    @GetMapping("/api/recipes/extended/details/{id}")
    public ExtendedRecipeDetails getRecipeExtendedById(@PathVariable int id){
        return recipeService.getRecipeExtendedById(id);
    }
}
