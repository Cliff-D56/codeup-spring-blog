package com.codeup.codeupspringblog.jpa.model;

import jakarta.persistence.*;

@Entity
@Table(name="posts")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public Integer getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @Column
    private String title;
    @Column
    private String body;
    public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }
        public Post(){}
        public Post (String title, String body){
            this.body = body;
            this.title = title;
    }
}
