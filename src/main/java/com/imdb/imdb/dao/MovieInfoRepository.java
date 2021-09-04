package com.imdb.imdb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.imdb.imdb.model.MovieInfo;

@Repository
public interface MovieInfoRepository extends JpaRepository<MovieInfo,Long>{
	//@Query(value="",nativeQuery=true)
	public MovieInfo findByDataId(String dataId);
}
