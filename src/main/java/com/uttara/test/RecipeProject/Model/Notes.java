package com.uttara.test.RecipeProject.Model;

import javax.persistence.*;

@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Lob
    private String recipeNotes;

    @OneToOne
    private Recipe recipe;

    public Long getId() {
        return id;
    }

    public String getRecipeNotes() {
        return recipeNotes;
    }

    public void setRecipeNotes(String recipeNotes) {
        this.recipeNotes = recipeNotes;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Notes(String recipeNotes, Recipe recipe) {
        this.recipeNotes = recipeNotes;
        this.recipe = recipe;
    }

    public Notes() {
    }
}
