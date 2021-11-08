package com.challenge.java.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;



@Entity
@Getter
@Setter
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String image;
    @NotNull
    private String title;
    @NotNull
    private LocalDateTime createAt = LocalDateTime.now();
    private boolean deleted;
    private Float score;
    @ManyToMany(mappedBy = "movies")
    private List<Character> characters;
    @ManyToMany(mappedBy = "movies")
    private List<Genre> genres;
}
