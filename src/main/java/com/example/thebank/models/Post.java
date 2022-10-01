package com.example.thebank.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    public Post(Long id, String title, String anons, String full_text, String prize) {
        this.id = id;
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
        this.prize = prize;
    }

    private String anons;
    private String full_text;
    private String prize;

    public String getPrize() {
        return prize;
    }

    public void setPrize(String prize) {
        this.prize = prize;
    }



    public Post(String title, String anons, String full_text, String prize) {
        this.title = title;
        this.anons = anons;
        this.full_text = full_text;
        this.prize = prize;
    }

    public Post() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAnons() {
        return anons;
    }

    public void setAnons(String anons) {
        this.anons = anons;
    }

    public String getFull_text() {
        return full_text;
    }

    public void setFull_text(String full_text) {
        this.full_text = full_text;
    }

    public String getViews() {
        return prize;
    }

    public void setViews(String prize) {
        this.prize = prize;
    }

}
