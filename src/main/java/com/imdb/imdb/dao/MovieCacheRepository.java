package com.imdb.imdb.dao;

import com.imdb.imdb.model.MovieCach;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieCacheRepository extends CrudRepository<MovieCach,String> {
    
}
