package com.upgard.dataaccesslayer.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movie_id ;

    @Column(length = 200, nullable = false)
    private String movieName ;

    @Column(length = 1000, nullable = false)
    private String movieDesc ;

    @Column(nullable = false)
    private LocalDateTime release_date ;

    @Column(length = 500, nullable = false)
    private int duration ;


    @Column(length = 500,nullable = false)
    private String coverPhotoUrl ;

    @Column(length = 500,nullable = false)
    private String trailerUrl ;

    // Relationship b/w Movie and Status
    @ManyToOne
    @JoinColumn(name = "statusId", nullable = false)
    private Status status ;

    // Relationship b/w Movie and Language
    @ManyToOne
    @JoinColumn(name = "languageId", nullable = false)
    private Language language ;

    public Movie() {

    }

    public Movie(int movie_id, String movieName, String movieDesc, LocalDateTime release_date, int duration, String coverPhotoUrl, String trailerUrl, Status status, Language language) {
        this.movie_id = movie_id;
        this.movieName = movieName;
        this.movieDesc = movieDesc;
        this.release_date = release_date;
        this.duration = duration;
        this.coverPhotoUrl = coverPhotoUrl;
        this.trailerUrl = trailerUrl;
        this.status = status;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movie_id=" + movie_id +
                ", movieName='" + movieName + '\'' +
                ", movieDesc='" + movieDesc + '\'' +
                ", release_date=" + release_date +
                ", duration=" + duration +
                ", coverPhotoUrl='" + coverPhotoUrl + '\'' +
                ", trailerUrl='" + trailerUrl + '\'' +
                ", status=" + status +
                ", language=" + language +
                '}';
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDesc() {
        return movieDesc;
    }

    public void setMovieDesc(String movieDesc) {
        this.movieDesc = movieDesc;
    }

    public LocalDateTime getRelease_date() {
        return release_date;
    }

    public void setRelease_date(LocalDateTime release_date) {
        this.release_date = release_date;
    }

    public int getMovieDuration() {
        return duration;
    }

    public void setMovieDuration(int movieDuration) {
        this.duration = movieDuration;
    }

    public String getCoverPhotoUrl() {
        return coverPhotoUrl;
    }

    public void setCoverPhotoUrl(String coverPhotoUrl) {
        this.coverPhotoUrl = coverPhotoUrl;
    }

    public String getTrailerUrl() {
        return trailerUrl;
    }

    public void setTrailerUrl(String trailerUrl) {
        this.trailerUrl = trailerUrl;
    }
}
