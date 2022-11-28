package com.ecommerce.movierental.controller;

import com.ecommerce.movierental.common.ApiResponse;
import com.ecommerce.movierental.model.Category;
import com.ecommerce.movierental.model.Movie;
import com.ecommerce.movierental.service.CategoryService;
import com.ecommerce.movierental.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")

public class MovieController {
    @Autowired
    MovieService movieService;

    @PostMapping("/create")
    public ResponseEntity<ApiResponse> createMovie(@RequestBody Movie movie) {
        movieService.createMovie(movie);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true, "a new movie created"), HttpStatus.CREATED);
    }

    @GetMapping("/")
    public List<Movie> listMovie() {
        return movieService.listMovie();
    }

    @PostMapping("/update/{movieId}")
    public ResponseEntity<ApiResponse> updateMovie(@PathVariable("movieId") int movieId, @RequestBody Movie movie) {
        System.out.println("movie id: " + movieId);
        if (!movieService.findById(movieId)){
            return new ResponseEntity<ApiResponse>(new ApiResponse(false, "movie does not exist"), HttpStatus.NOT_FOUND);
        }
        movieService.editMovie(movieId, movie);
        return new ResponseEntity<ApiResponse>(new ApiResponse(true, "movie has been updated"), HttpStatus.OK);
    }

}
