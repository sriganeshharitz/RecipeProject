package com.uttara.test.RecipeProject.Repositories;

import com.uttara.test.RecipeProject.Model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface RecipeRepository extends JpaRepository<Recipe,Long>{

}
