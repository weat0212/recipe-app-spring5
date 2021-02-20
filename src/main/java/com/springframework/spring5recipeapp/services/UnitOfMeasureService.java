package com.springframework.spring5recipeapp.services;

import com.springframework.spring5recipeapp.commands.UnitOfMeasureCommand;

import java.util.Set;

/**
 * @author I-Chung, Wang
 * @date 2021/1/8 下午 03:31
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}
