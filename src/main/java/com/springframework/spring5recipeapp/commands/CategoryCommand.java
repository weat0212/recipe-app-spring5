package com.springframework.spring5recipeapp.commands;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author I-Chung, Wang
 * @date 2021/1/1 下午 09:21
 */

@Getter
@Setter
@NoArgsConstructor
public class CategoryCommand {
    private Long id;
    private String description;
}
