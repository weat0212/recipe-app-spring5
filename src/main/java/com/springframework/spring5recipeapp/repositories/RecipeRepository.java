package com.springframework.spring5recipeapp.repositories;

import com.springframework.spring5recipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

/**
 * @author weat0212@gmail.com
 * @project spring5-recipe-app
 * @package guru.springframework.spring5recipeapp.repositories
 * @date 2020/12/9 下午 12:03
 */
public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
