package com.imdb.imdb.util;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class IMDBApiImpl implements IMDBApi{
	private Logger logger = LoggerFactory.getLogger(IMDBApiImpl.class);
	@Value("${api2.imdb}")
	private String apiKey;
	
//	private String mainUrl = "https://imdb-api1.p.rapidapi.com/";
	private HttpClient client;
	private HttpRequest httpReq;
	private HttpResponse<String> response;
	
	public IMDBApiImpl() {
		this.client = HttpClient.newHttpClient();
	}

	@Override
	public Object searchByTitle(String title) {
		this.httpReq = HttpRequest.newBuilder().uri(URI.create("https://imdb-api1.p.rapidapi.com/Title/"+this.apiKey+"/"+title))
				.header("x-rapidapi-host", "imdb-api1.p.rapidapi.com")
				.header("x-rapidapi-key", "e36f1e6155mshff1726076963dcbp1c7f3djsne9d31088f5e0")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		try {
			this.response = this.client.send(httpReq, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return response.body();
	}


	@Override
	public Object searchById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
