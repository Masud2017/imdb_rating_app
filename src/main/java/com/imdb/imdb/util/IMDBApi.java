package com.imdb.imdb.util;

public interface IMDBApi {
	public Object searchByTitle(String title);
	public Object searchById(long id);
}
