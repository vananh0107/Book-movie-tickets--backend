package com.movie.movie.pojo;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
@Data
@Table(name = "movie")
@Entity
@NoArgsConstructor
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(length = 1000)
    private String smallImageURl;
    @Column(length = 500)
    private String shortDescription;
    @Column(length = 1000)
    private String longDescription;
    @Column(length = 1000)
    private String largeImageURL;
    private String director;
    private String actors;
    private String categories;
    private LocalDate releaseDate;
    private int duration;
    @Column(length = 1000)
    private String trailerURL;
    private String language;
    private String rated;
    private int isShowing;
}
