package com.ecommerce.movierental.service;

import com.ecommerce.movierental.model.Movie;
import com.ecommerce.movierental.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepo movieRepo;
    public void createMovie(Movie movie) {
        movieRepo.save(movie);
    }
    public List<Movie> listMovie() {
        return movieRepo.findAll();
    }

    public void editMovie(int movieId, Movie updateMovie) {
        Movie movie = movieRepo.getReferenceById(movieId);
        movie.setTitle(updateMovie.getTitle());
        movie.setDescription(updateMovie.getDescription());
        movie.setImageUrl(updateMovie.getImageUrl());
        movie.setYear(updateMovie.getYear());
        movie.setGenre(updateMovie.getGenre());
        movie.setLeadingActor(updateMovie.getLeadingActor());
        movie.setStudio(updateMovie.getStudio());
        movie.setDirector(updateMovie.getDirector());
        movie.setLength(updateMovie.getLength());
        movie.setRentalPrice(updateMovie.getRentalPrice());
        movie.setCostProduction(updateMovie.getCostProduction());
        movie.setRevenue(updateMovie.getRevenue());
        movieRepo.save(movie);
    }

    public boolean findById(int movieId) {
        return movieRepo.findById(movieId).isPresent();
    }

    public void deleteMovie(int movieId) {
        movieRepo.deleteById(movieId);
    }
}
