package com.codeup.codeupspringblog.jpa.controllers;

import com.codeup.codeupspringblog.jpa.model.Item;
import com.codeup.codeupspringblog.jpa.repositories.ItemRepo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ItemController {
    private final ItemRepo itemDao;
    public ItemController(ItemRepo itemDao){this.itemDao=itemDao;}
    @GetMapping("/index")
    public String itemIndex(Model model){
//        Item item1 = new Item("chair", 23.32,1998);
//        Item item2 = new Item("chair", 223.32,199);
//        Item item3 = new Item("chair", 323.32,21998);
//        itemDao.save(item1);
//        itemDao.save(item2);
//        itemDao.save(item3);
//        List<Item> result = itemDao.findByManufactureYearAfter(20000);
//        itemDao.deleteAll(result);
//        Item hi = itemDao.findFirstByManufactureYearAfter(1990);
//        hi.setName("Clifford");
//        result.setPrice(5.00);
//        itemDao.save(result);
        model.addAttribute("items",itemDao.findAll());
        return "index";
    }
    @GetMapping("/create")
    public String create(){return "create";}
    @PostMapping("/create")
    public String itemIndex2(@RequestParam( name = "name")String name,@RequestParam(name = "price")double price, @RequestParam(name = "manu")int manu, Model model) {
        Item newitem = new Item(name, price, manu);
        itemDao.save(newitem);
        return "redirect:/index";
    }
    @PostMapping("/rick-roll")
    public String rickRoll() {
        // redirecting to an absolute url
        return "redirect:/join";
    }
    @GetMapping("/redirect-me")
    public String redirect() {
        // a relative (to the base domain) redirect, usually you will use this
        // version
        // Will redirect the users to `/about`
        return "redirect:/about";
    }
}
