package com.imdb.imdb.util;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpResponse;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class IMDBApiImpl implements IMDBApi{
	@Value("${imdb.api.key}")
	private String imdbApiKey;
	
//	private String mainUrl = "https://imdb-api1.p.rapidapi.com/";
	private HttpClient client = HttpClient.newHttpClient();
	private HttpRequest httpReq;
	private HttpResponse<String> response;
	

	@Override
	public Object searchByTitle(String title) {
		System.out.println("\n\n\n"+this.imdbApiKey);
		this.httpReq = HttpRequest.newBuilder().uri(URI.create("https://imdb-api1.p.rapidapi.com/Title/k_uvrfhv0c/tt0050083"))
				.header("x-rapidapi-host", "imdb-api1.p.rapidapi.com")
				.header("x-rapidapi-key", "e36f1e6155mshff1726076963dcbp1c7f3djsne9d31088f5e0")
				.method("GET", HttpRequest.BodyPublishers.noBody())
				.build();
		try {
			this.response = this.client.send(httpReq, HttpResponse.BodyHandlers.ofString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(this.response.body());
		return response.body();
	}

	@Override
	public Object searchById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
