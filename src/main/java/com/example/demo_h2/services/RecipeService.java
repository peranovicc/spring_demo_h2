package com.example.demo_h2.services;

import com.example.demo_h2.models.Entities.Recipe;
import com.example.demo_h2.models.ExtendedRecipe;
import com.example.demo_h2.models.ExtendedRecipeDetails;
import com.example.demo_h2.models.IngredientRecipeDetails;
import com.example.demo_h2.repositories.interfaces.IngredientsRepository;
import com.example.demo_h2.repositories.interfaces.RecipeRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;
    private final IngredientsRepository ingredientsRepository;

    public RecipeService(RecipeRepository recipeRepository, IngredientsRepository ingredientsRepository) {
        this.recipeRepository = recipeRepository;
        this.ingredientsRepository = ingredientsRepository;
    }

    public List<Recipe> getAllRecipes() {
        return recipeRepository.findAll();
    }

    public List<ExtendedRecipe> getAllRecipesExtended() {
        List<ExtendedRecipe> extendedRecipes = new ArrayList<>();
        List<Recipe> recipes = recipeRepository.getRecipeInfo();

        for (var recipe : recipes) {
            var ids = recipeRepository.getIngredientsByRecipeId(recipe.getId());
            var extendedRecipe = new ExtendedRecipe(
                    recipe.getId(),
                    recipe.getName(),
                    recipe.getDifficulty(),
                    ids
            );

            extendedRecipes.add(extendedRecipe);
        }

        return extendedRecipes;
    }

    public ExtendedRecipeDetails getRecipeExtendedById(int id) {
        var tmp = recipeRepository.findById(id);

        if(tmp.isEmpty())
            return null;

        List<IngredientRecipeDetails> ingredientDetails = ingredientsRepository.getIngredientRecipeDetails(id);

        return new ExtendedRecipeDetails(
            id,
            tmp.get().getName(),
            tmp.get().getDifficulty(),
            ingredientDetails
        );
    }
}