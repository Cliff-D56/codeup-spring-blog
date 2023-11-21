package com.codeup.codeupspringblog.jpa.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String username;
    @Column
    private String email;
    @Column
    private String password;

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "user")
    private List<Post> posts;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public User (){}
    public User (String username, String email, String password){
        this.username=username;
        this.email=email;
        this.password=password;
    }
    public User (String username, String email, String password, List<Post>posts){
        this.username=username;
        this.email=email;
        this.password=password;
        this.posts=posts;
    }
}
