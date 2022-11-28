package com.ecommerce.movierental.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "title")
    private @NotBlank String title;
    @Column(name = "description")
    private @NotBlank String description;
    @Column(name = "image_url")
    private @NotBlank String imageUrl;

    @Column(name = "year")
    private @NotBlank String year;

    @Column(name = "genre")
    private @NotBlank String genre;

    @Column(name = "leading_actor")
    private @NotBlank String leadingActor;

    @Column(name = "studio")
    private @NotBlank String studio;

    @Column(name = "director")
    private @NotBlank String director;

    @Column(name = "length")
    private @NotBlank String length;

    @Column(name = "rental_price")
    private @NotBlank String rentalPrice;

    @Column(name = "cost_production")
    private @NotBlank String costProduction;

    @Column(name = "revenue")
    private @NotBlank String revenue;

    public Movie() {
    }

    public Movie(String title, String description, String imageUrl, String year, String genre, String leadingActor, String studio, String director, String length, String rentalPrice, String costProduction, String revenue) {
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.year = year;
        this.genre = genre;
        this.leadingActor = leadingActor;
        this.studio = studio;
        this.director = director;
        this.length = length;
        this.rentalPrice = rentalPrice;
        this.costProduction = costProduction;
        this.revenue = revenue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLeadingActor() {
        return leadingActor;
    }

    public void setLeadingActor(String leadingActor) {
        this.leadingActor = leadingActor;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(String rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public String getCostProduction() {
        return costProduction;
    }

    public void setCostProduction(String costProduction) {
        this.costProduction = costProduction;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }
}
