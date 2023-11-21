package com.codeup.codeupspringblog.jpa.repositories;

import com.codeup.codeupspringblog.jpa.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepo extends JpaRepository<Item, Integer> {
    Item findFirstByManufactureYearAfter(int num);
    List<Item> findByManufactureYearAfter(int num);
}
