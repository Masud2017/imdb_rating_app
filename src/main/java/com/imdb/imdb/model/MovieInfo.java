package com.imdb.imdb.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MovieInfo")
public class MovieInfo {
	@Id
	private long id;
	@Column(name="data_id")
	private String data_id;
	@Column(name="title")
	private String title;
	@Column(name="original_title")
	private String original_title;
	@Column(name="full_title")
	private String fullTitle;
	@Column(name="type")
	private String type;
	@Column(name="year")
	private String year;
	@Column(name = "image")
	private String image;
	@Column(name= "release_date")
	private String releaseDate;
	@Column(name= "runtime_mins")
	private String runtimeMins;
	@Column(name="runtime_str")
	private String runtimeStr;
	@Column(name="plot")
	private String plot;
	@Column(name="plot_local")
	private String plotLocal;
	@Column(name= "plot_local_is_rtl")
	private boolean plotLoalIsRtl;
	@Column(name = "awards")
	private String awards;
	@Column(name="directors")
	private String directors;
	@Column(name="director_list")
	private List<?> directorList;
	@Column(name="writers")
	private String writers;
	@Column(name="writer_list")
	private List<?>writerList;
	@Column(name="starts")
	private String stars;
	@Column(name="star_list")
	private List<?> startList;
	@Column(name="actor_list")
	private String actorList;
	@Column(name="full_cast")
	private String fullCast;
	@Column(name="genres")
	private String genres;
	@Column(name="genre_list")
	private List<?> genreList;
	@Column(name="companies")
	private String companies;
	@Column(name="company_list")
	private List<?> companyList;
	@Column(name="countries")
	private String countries;
	@Column(name="country_list")
	private List<?> countryList;
	@Column(name ="languages")
	private String languages;
	@Column(name="language_lsit")
	private List<?> languageList;
	@Column(name="content_rating")
	private String contentRating;
	@Column(name="imdb_rating")
	private String imdbRating;
	@Column(name= "imdb_rating_votes")
	private String imdbRatingVotes;
	@Column(name="metacritic_rating")
	private String metacriticRating;
	@Column(name="ratings")
	private String ratings;
	@Column(name="wikipedia")
	private String wikipedia;
	@Column(name="posters")
	private String posters;
	@Column(name="images")
	private String images;
	@Column(name="trailer")
	private String trailer;
	@Column(name="box_office")
	private List<?> box_office;
	@Column(name="tagline")
	private String tagline;
	@Column(name="keywords")
	private String keywords;
	@Column(name="keywords_list")
	private List<?> keywordsList;
	@Column(name="similars")
	private List<?> similars;
	@Column(name="tv_series_info")
	private String tvSeriesInfo;
	@Column(name="tv_episode_info")
	private String tvEpisodeInfo;
	@Column(name="error_message")
	private String errorMessage;
}
