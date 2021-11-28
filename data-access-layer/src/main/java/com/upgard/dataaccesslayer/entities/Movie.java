package com.upgard.dataaccesslayer.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int movie_id ;

    @Column(length = 20, nullable = false)
    private String movie_name ;

    @Column(length = 1000, nullable = false)
    private String movie_desc ;

    @Column(nullable = false)
    private LocalDateTime release_date ;

    @Column(length = 500, nullable = false)
    private int movie_duration ;


    @Column(length = 500,nullable = false)
    private String cover_photo_url ;

    @Column(length = 500,nullable = false)
    private String trailer_url ;

    public int getMovie_id() {
        return movie_id;
    }



    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovie_name() {
        return movie_name;
    }

    public void setMovie_name(String movie_name) {
        this.movie_name = movie_name;
    }

    public String getMovie_desc() {
        return movie_desc;
    }

    public void setMovie_desc(String movie_desc) {
        this.movie_desc = movie_desc;
    }

    public LocalDateTime getRelease_date() {
        return release_date;
    }

    public void setRelease_date(LocalDateTime release_date) {
        this.release_date = release_date;
    }

    public double getMovie_duration() {
        return movie_duration;
    }

    public void setMovie_duration(int movie_duration) {
        this.movie_duration = movie_duration;
    }

    public String getCover_photo_url() {
        return cover_photo_url;
    }

    public void setCover_photo_url(String cover_photo_url) {
        this.cover_photo_url = cover_photo_url;
    }

    public String getTrailer_url() {
        return trailer_url;
    }

    public void setTrailer_url(String trailer_url) {
        this.trailer_url = trailer_url;
    }



}
