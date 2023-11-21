package com.codeup.codeupspringblog.jpa.model;

import jakarta.persistence.*;

@Entity
@Table(name = "food")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int calories;
    @Column(length = 100,nullable = false)
    private String name;
    @Column(length = 50,nullable = false)
    private String type;

    @Column(name = "id",nullable = false)

    public void setId(Long id) {
        this.id = id;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getId() {
        return id;
    }
    public Food(){}
    public Food(String name,String type, int calories){
        this.name = name;
        this.type = type;
        this.calories =calories;
    }
}
