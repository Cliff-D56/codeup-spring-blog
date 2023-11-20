package com.codeup.codeupspringblog;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Random;

@Controller
public class DiceController {
    public Random random = new Random();
    @GetMapping("roll-dice")
    public String hi(){
        return "roll-dice";
    }
//    TODO SPRING USING {} ALLOWS THE USE OF PATH VARIABLE TO GET INPUT FROM THE PATH
    @GetMapping("roll-dice/{n}")
    public String putple(@PathVariable int n, Model model) {
        ArrayList<Integer> dice = new ArrayList<Integer>();
        int rand = random.nextInt(6) + 1;
        int rand2 = random.nextInt(6) + 1;
        int rand3 = random.nextInt(6) + 1;
        dice.add(rand);
        dice.add(rand2);
        dice.add(rand3);
        System.out.println("dice1"+rand);
        System.out.println("dice2"+rand2);
        System.out.println("dice3"+rand3);
        int count = 0;
        for (int diceroll : dice) {
//            switch (diceroll) {case rand, rand3, rand2 -> count++;}
            System.out.println("diceroll " + diceroll);
            if (diceroll == n) {
                count++;
            }
        }
        if (count == 0) {
            model.addAttribute("message", "You're guess didn't match any of the dice");
        } else {
            model.addAttribute("message", "You're guess matched " + count + " dice.\t Dice 1 was "+rand+"\n Dice 2 was "+rand2+"\nDice 3 is "+rand3);
        }
        return "roll-dice";
    }
//    @GetMapping("roll-dice/1")
//    @ResponseBody
//    public String dice(){
//        if (rand == 1){
//            return "You're Right";
//        }
//    return "You're Wrong!"+rand;
//}
//    @GetMapping("roll-dice/2")
//    @ResponseBody
//    public String dice1(){
//        if (rand == 2){
//            return "You're Right";
//        }
//        return "You're Wrong!";
//    }@GetMapping("roll-dice/3")
//    @ResponseBody
//    public String dice2(){
//        if (rand == 3){
//            return "You're Right";
//        }
//        return "You're Wrong!";
//    }@GetMapping("roll-dice/4")
//    @ResponseBody
//    public String dice4(){
//        if (rand == 4){
//            return "You're Right";
//        }
//        return "You're Wrong!";
//    }@GetMapping("roll-dice/5")
//    @ResponseBody
//    public String dice5(){
//        if (rand == 5){
//            return "You're Right";
//        }
//        return "You're Wrong!";
//    }
//    @GetMapping("roll-dice/6")
//    @ResponseBody
//    public String dice6(){
//        if (rand == 6){
//            return "You're Right";
//        }
//        return "You're Wrong!";
//    }
}
