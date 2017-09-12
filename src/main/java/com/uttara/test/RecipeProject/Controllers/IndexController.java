package com.uttara.test.RecipeProject.Controllers;

import com.uttara.test.RecipeProject.Model.Notes;
import com.uttara.test.RecipeProject.Model.Recipe;
import com.uttara.test.RecipeProject.Repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @Autowired
    private RecipeRepository recipeRepository;

    @RequestMapping({"/",""})
    public String getIndexPage() {
//        Recipe recipe = new Recipe();
//        recipe.setDescription("blahblah");
//        recipe.setCookTime(10);
//        recipe.setDirections("zzzz");
//        recipe.setImage(new Byte[]{});
//        recipe.setPrepTime(12);
//        recipe.setServings(2);
//        recipe.setSource("Cookbook");
//        recipe.setUrl("google.com");
//        Notes notes = new Notes();
//        notes.setRecipe(recipe);
//        notes.setRecipeNotes("dsadsadsdad");
//        recipe.setNotes(notes);
//        recipeRepository.save(recipe);
        return "Index";
    }
}
