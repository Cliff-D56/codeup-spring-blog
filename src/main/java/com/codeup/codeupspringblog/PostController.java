package com.codeup.codeupspringblog;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class PostController {

    @RequestMapping(path = "/posts/index",method = RequestMethod.GET)
    public String post (Model model) {
        ArrayList<Post>list = new ArrayList<>();
        Post post1 = new Post("Post 1 Title","Post 1 Body");
        Post post2 = new Post("Post 2 Title", "Post 2 body");
        Post post3 = new Post("Post 3 Title", "Post 3 body");
        list.add(post1);
        list.add(post2);
        list.add(post3);
        model.addAttribute("posts",list);
        return "posts/index";
    }
//    TODO SPRING GO TO SPECIFIC URL AND RUN GET METHOD
    @RequestMapping(path = "/posts/show",method = RequestMethod.GET)
    public String postid (Model model) {
        Post post = new Post("Title","Post");

        model.addAttribute("post",post);
        return "posts/show";
    }
    @RequestMapping(path = "/posts/create",method = RequestMethod.GET)
//    TODO SPRING RETURNING ONLY STRINGS
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
