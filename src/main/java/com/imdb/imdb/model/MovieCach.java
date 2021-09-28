package com.imdb.imdb.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("MovieCache")
public class MovieCach {
    private Long id;
    private String name;
    private Object data;
}
