package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Controller
public class JoinController {
    @GetMapping("/join")
    public String showJoinForm(Model model){
        model.addAttribute("cohort","cohort");
        return "join";
    }
    @PostMapping("/join")
//    TODO USE RequestParam TO PULL INFO LIKE A REQUEST PARAMETER METHOD, MODEL IS YOUR REQUEST OBJECT
    public String JoinCohort(@RequestParam(name="cohort") String cohort,@RequestParam(name = "name") String name,Model model){
        model.addAttribute("cohort","Welcome to " + cohort + "!");
        model.addAttribute("name","Greetings "+name+"!");
        ArrayList<String>Shopping = new ArrayList<>();
        Shopping.add("Honeybuns");
        Shopping.add("Crap");
        model.addAttribute("shopping",Shopping);
        return "join";
    }
}
