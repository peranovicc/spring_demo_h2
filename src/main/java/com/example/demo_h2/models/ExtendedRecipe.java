package com.example.demo_h2.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExtendedRecipe {
    public int id;
    public String name;
    public int difficulty;
    public List<Integer> ingredientIds;
}
