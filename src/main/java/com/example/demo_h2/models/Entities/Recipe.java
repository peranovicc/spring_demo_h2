package com.example.demo_h2.models.Entities;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "RECIPES")
public class Recipe {
    @Id
    public int id;
    public String name;
    public int difficulty;
}
