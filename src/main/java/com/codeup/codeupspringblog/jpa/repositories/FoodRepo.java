package com.codeup.codeupspringblog.jpa.repositories;

import com.codeup.codeupspringblog.jpa.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepo extends JpaRepository<Food, Long> {

}
