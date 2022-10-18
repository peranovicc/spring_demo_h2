package com.example.demo_h2.models;

import com.example.demo_h2.models.Entities.Ingredient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Data
@AllArgsConstructor
public class ExtendedRecipeDetails{
    public int id;
    public String name;
    public int difficulty;
    public List<IngredientRecipeDetails> ingredients;
}
