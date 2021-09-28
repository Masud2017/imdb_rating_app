package com.imdb.imdb.util;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.PropertySource;

@Component
@PropertySource("classpath:application.properties")
public class IMDBSearchApiImpl implements IMDBSearchApi {
	@Value("${api2.imdb}")
	private String apiKey;
	@Value("${movie.search}")
	private String url;
	
	private HttpRequest httpReq;
	private HttpClient client;
	private HttpResponse<String> res;
	private Logger logger = LoggerFactory.getLogger(IMDBSearchApiImpl.class);
	@Override
	public Object searchByTitle(String title) {
		this.url = "https://imdb-api.com/en/API/SearchMovie/"+this.apiKey+"/"+title.replace(" ","%20");
		// this.url = this.url + this.apiKey + "/" + title.replace(" ","%20");
		this.httpReq = HttpRequest.newBuilder(URI.create(url)).build();
		this.client = HttpClient.newHttpClient();
		try {
			res = client.send(httpReq, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(res.body());
		logger.info("The link : "+this.url);
		logger.info("This is from  search api : "+res.body());
		return res.body();
	}
	@Override
	public String getApi() {
		return this.apiKey;
	}
}
