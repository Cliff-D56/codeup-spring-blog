package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @RequestMapping(path = "/posts",method = RequestMethod.GET)
    @ResponseBody
    public String post () {
        return "posts index page";
    }
    @RequestMapping(path = "/posts/{id}",method = RequestMethod.GET)
    @ResponseBody
    public String postid (@PathVariable int id) {
        return "view "+id+" page";
    }
    @RequestMapping(path = "/posts/create",method = RequestMethod.GET)
    @ResponseBody
    public String create () {
        return "View the form for creating a post";
    }
    @RequestMapping(path = "/posts/create",method = RequestMethod.POST)
    @ResponseBody
    public String createpost () {
        return "create a new post";
    }
}
