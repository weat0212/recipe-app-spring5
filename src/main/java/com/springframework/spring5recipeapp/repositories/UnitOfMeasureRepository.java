package com.springframework.spring5recipeapp.repositories;

import com.springframework.spring5recipeapp.domain.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author weat0212@gmail.com
 * @project spring5-recipe-app
 * @package guru.springframework.spring5recipeapp.repositories
 * @date 2020/12/9 下午 12:06
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String desciption);
}
