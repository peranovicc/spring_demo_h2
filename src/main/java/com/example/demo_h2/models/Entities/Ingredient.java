package com.example.demo_h2.models.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "Ingredients")
public class Ingredient {
    @Id
    public int id;
    public String name;
    public double price;
}
