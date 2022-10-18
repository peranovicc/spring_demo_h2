package com.example.demo_h2.repositories.interfaces;

import com.example.demo_h2.models.Entities.Ingredient;
import com.example.demo_h2.models.IngredientRecipeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface IngredientsRepository extends JpaRepository<Ingredient, Integer> {
    @Query(value = "SELECT i.id, i.name, ri.amount FROM INGREDIENTS i JOIN RECIPEINGREDIENTS ri ON i.id = ri.ingredient_id AND ri.recipe_id = :recipeId", nativeQuery = true)
    List<IngredientRecipeDetails> getIngredientRecipeDetails(int recipeId);
}
