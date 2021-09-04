package com.imdb.imdb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imdb.imdb.util.IMDBApi;
import com.imdb.imdb.util.IMDBApiImpl;

@RestController
public class HelloController {
	@GetMapping(value="/index")
	public Object hello() {
		IMDBApi api = new IMDBApiImpl();
		Object response = api.searchByTitle("masud");
		
		return response;
	}
}
