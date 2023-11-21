package com.codeup.codeupspringblog.jpa.controllers;

import com.codeup.codeupspringblog.jpa.repositories.FoodRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FoodController {
    private final FoodRepo foodDao;
    public FoodController(FoodRepo foodDao){
        this.foodDao = foodDao;
    }
    @GetMapping("/lunchTime")
    public String lunchtime(Model model){
        model.addAttribute("foods",foodDao.findAll());
        return "lunchtime";
    }
}
