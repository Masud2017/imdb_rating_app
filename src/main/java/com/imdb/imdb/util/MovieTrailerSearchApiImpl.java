package com.imdb.imdb.util;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component
public class MovieTrailerSearchApiImpl implements MovieTrailerSearchApi{
    @Value("${api2.imdb}")
    private String apiKey;
    @Value("${trailer.addict}")
    private String url;

    private HttpRequest httpReq;
    private HttpClient httpClient;
    private HttpResponse<String> response;

    public MovieTrailerSearchApiImpl() throws MalformedURLException {
        this.httpClient = HttpClient.newHttpClient();
    }

    @Override
    public Object searchMovieByTitle(String title) {
        this.url = this.url + "?film="+title.replace(" ","%20")+"?count=3";
        this.httpReq = HttpRequest.newBuilder().uri(URI.create(this.url)).build();

        try {
            this.response = this.httpClient.send(httpReq, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

}
