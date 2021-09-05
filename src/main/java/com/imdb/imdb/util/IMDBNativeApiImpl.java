package com.imdb.imdb.util;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

public class IMDBNativeApiImpl implements IMDBNativeApi {
	@Autowired
	private EnvironmentUtil env = new EnvironmentUtil();

	private String apiKey;
	private String url = null;
	
	private HttpRequest httpReq;
	private HttpClient client;
	private HttpResponse<String> res;
	@Override
	public Object searchByTitle(String title) {
		try {
			this.url = "https://imdb-api.com/en/API/SearchMovie/"+this.env.getProperty("api2.imdb")+"/"+title.replace(" ","%20");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		httpReq = HttpRequest.newBuilder(URI.create(url)).build();
		client = HttpClient.newHttpClient();
		try {
			res = client.send(httpReq, HttpResponse.BodyHandlers.ofString());
		} catch (IOException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(res.body());
		return res.body();
	}
	@Override
	public String getApi() {
		
		try {
			this.apiKey = env.getProperty("api2.imdb");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return this.apiKey;
	}
}
