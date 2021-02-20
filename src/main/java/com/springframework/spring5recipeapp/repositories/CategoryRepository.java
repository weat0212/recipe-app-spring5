package com.springframework.spring5recipeapp.repositories;

import com.springframework.spring5recipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author weat0212@gmail.com
 * @project spring5-recipe-app
 * @package guru.springframework.spring5recipeapp.repositories
 * @date 2020/12/9 下午 12:04
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);
}
