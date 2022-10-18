package com.example.demo_h2.repositories.interfaces;

import com.example.demo_h2.models.Entities.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
    @Query(value = "SELECT * FROM RECIPES", nativeQuery = true)
    List<Recipe> getRecipeInfo();

    @Query(value = "SELECT ingredient_id FROM RECIPEINGREDIENTS WHERE recipe_id = :id", nativeQuery = true)
    List<Integer> getIngredientsByRecipeId(int id);


}
