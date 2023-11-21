package com.codeup.codeupspringblog.jpa.repositories;

import com.codeup.codeupspringblog.jpa.controllers.PostController;
import com.codeup.codeupspringblog.jpa.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepo extends JpaRepository<Post, Integer> {
    Post getPostById(int id);
}
