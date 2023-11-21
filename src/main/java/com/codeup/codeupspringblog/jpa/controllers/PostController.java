package com.codeup.codeupspringblog.jpa.controllers;

import com.codeup.codeupspringblog.jpa.model.Post;
import com.codeup.codeupspringblog.jpa.repositories.PostRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController{
    private final PostRepo postDao;
    public PostController (PostRepo postDao){this.postDao=postDao;}

    @RequestMapping(path = "/posts/index",method = RequestMethod.GET)
    public String post (Model model) {
        ArrayList<Post>list = new ArrayList<>();
        Post post1 = new Post("Post 1 Title","Post 1 Body");
        Post post2 = new Post("Post 2 Title", "Post 2 body");
        Post post3 = new Post("Post 3 Title", "Post 3 body");
        list.add(post1);
        list.add(post2);
        list.add(post3);
        List<Post> list2 = postDao.findAll();
        model.addAttribute("posts",list2);
        return "posts/index";
    }
//    TODO SPRING GO TO SPECIFIC URL AND RUN GET METHOD
    @RequestMapping(path = "/posts/{id}",method = RequestMethod.GET)
    public String postid (@PathVariable int id, Model model) {
        Post post = postDao.getPostById(id);

        model.addAttribute("post",post);
        return "posts/show";
    }
    @RequestMapping(path = "/posts/create",method = RequestMethod.GET)
    public String create () {
        return "/posts/create";
    }
    @RequestMapping(path = "/posts/create",method = RequestMethod.POST)
    public String createpost (@RequestParam(name="title")String title,@RequestParam(name = "description") String description) {
        Post newpost = new Post(title,description);
        postDao.save(newpost);
        return "redirect:/posts/index";
    }
}
