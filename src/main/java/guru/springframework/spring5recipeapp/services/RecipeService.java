package guru.springframework.spring5recipeapp.services;

import guru.springframework.spring5recipeapp.commands.RecipeCommand;
import guru.springframework.spring5recipeapp.domain.Recipe;

import java.util.Set;

/**
 * @author weat0212@gmail.com
 * @project spring5-recipe-app
 * @package guru.springframework.spring5recipeapp
 * @date 2020/12/9 下午 02:15
 */

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long l);
}
