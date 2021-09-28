package com.imdb.imdb.controller;

import java.io.File;
import java.io.IOException;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.imdb.imdb.util.IMDBApi;
import com.imdb.imdb.util.IMDBApiImpl;
import com.imdb.imdb.util.IMDBSearchApi;



@Controller
public class HelloController {
	private boolean isRedirect = true;

	@Autowired
	private IMDBSearchApi movieSearchApi;
	@Autowired
	private IMDBApi movieDataDetails;
	private Logger logger = LoggerFactory.getLogger(HelloController.class);

	@GetMapping(value="/search")
	public String search(@ModelAttribute("title") String title,RedirectAttributes redirectToMovie) throws JsonProcessingException, IOException {
		if (title.isEmpty()) {
			return "redirect:/";
		}
		logger.info("Title is ; "+title);
		ObjectMapper mapper = new ObjectMapper();
		Object resultJsonData = movieSearchApi.searchByTitle(title); // This result will be sent as the json data
		JsonNode node = mapper.readTree(resultJsonData.toString());
		logger.info("Id : "+node);
		String movieId = node.get("results").get(1).get("id").asText();

		Object movieData = movieDataDetails.searchByTitle(movieId);

		logger.info("Data that has found by the movie search : "+movieData);

		redirectToMovie.addFlashAttribute("dataFromSearch",movieData);
		this.isRedirect = false;
		return "redirect:movie";
	}

	@GetMapping(value = "/")
	public String home() {
		return "home";
	}

	@GetMapping(value="/movie")
	public String index(Model model,@ModelAttribute("dataFromSearch") Object dataFromSearch) throws JsonGenerationException, JsonMappingException, IOException {
		if (this.isRedirect) {
			return "redirect:/";
		} else {
			this.isRedirect = true;
		}
		ObjectMapper objMapper = new ObjectMapper();
		JsonNode node2 = objMapper.readTree(dataFromSearch.toString());

		model.addAttribute("jsonObj", node2);
		
	
		return "movie";
	}
}
