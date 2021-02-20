package com.springframework.spring5recipeapp.services;

import com.springframework.spring5recipeapp.commands.IngredientCommand;

/**
 * @author I-Chung, Wang
 * @date 2021/1/7 下午 01:05
 */
public interface IngredientService {

    IngredientCommand findByRecipeIdAndIngredientId(Long recipeId, Long ingredientId);

    IngredientCommand saveIngredientCommand(IngredientCommand command);

    void deleteById(long recipeId, long ingredientId);
}
