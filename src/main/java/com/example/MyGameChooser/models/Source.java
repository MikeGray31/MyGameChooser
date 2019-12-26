package com.example.MyGameChooser.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Source {

    @Id
    @Column(name = "source_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long source_id;
    private String website;
    private String Author;
    private Float trustworthiness;
    @OneToMany(mappedBy = "source")
    private Set<Review> reviews;

    public Long getId() {
        return source_id;
    }

    public void setId(Long id) {
        this.source_id = id;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public Float getTrustworthiness() {
        return trustworthiness;
    }

    public void setTrustworthiness(Float trustworthiness) {
        this.trustworthiness = trustworthiness;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }
}
