package com.imdb.imdb.service;

import com.imdb.imdb.dao.MovieCacheRepository;
import com.imdb.imdb.model.MovieCach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieCacheService {
    @Autowired
    private MovieCacheRepository movieRepo;

    public void save(MovieCach movieData) {
        movieRepo.save(movieData);
    }
}
