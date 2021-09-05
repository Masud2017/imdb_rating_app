package com.imdb.imdb.controller;

import java.io.File;
import java.io.IOException;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.imdb.imdb.util.IMDBApi;
import com.imdb.imdb.util.IMDBApiImpl;
import com.imdb.imdb.util.IMDBNativeApi;
import com.imdb.imdb.util.IMDBNativeApiImpl;


@Controller
public class HelloController {
	@GetMapping(value="/index")
	public String index(Model model) throws JsonGenerationException, JsonMappingException, IOException {
		IMDBApi api = new IMDBApiImpl();
//		Object response = api.searchByTitle("masud");
		ObjectMapper objMapper = new ObjectMapper();
//		objMapper.writeValue(new File("src/main/java/com/imdb/imdb/json/res.json"),response); // We don't have to save the json file into the file
		File file = new File("src/main/java/com/imdb/imdb/json/res.json");
		Scanner scanner = new Scanner(file);
//		String json = scanner.nextLine();

//		String jsonValue = objMapper.writeValueAsString(response);
		
		
//		JsonNode node = objMapper.readTree(jsonValue.trim());
//		System.out.println(node.get(0));
//		System.out.println(response);
		String json = "{\"id\":\"tt0050083\",\"title\":\"12 Angry Men\",\"originalTitle\":\"\",\"fullTitle\":\"12 Angry Men (1957)\",\"type\":\"Movie\",\"year\":\"1957\",\"image\":\"https://imdb-api.com/images/original/MV5BMWU4N2FjNzYtNTVkNC00NzQ0LTg0MjAtYTJlMjFhNGUxZDFmXkEyXkFqcGdeQXVyNjc1NTYyMjg@._V1_Ratio0.6791_AL_.jpg\",\"releaseDate\":\"1957-04-10\",\"runtimeMins\":\"96\",\"runtimeStr\":\"1h 36mins\",\"plot\":\"The defense and the prosecution have rested, and the jury is filing into the jury room to decide if a young man is guilty or innocent of murdering his father. What begins as an open-and-shut case of murder soon becomes a detective story that presents a succession of clues creating doubt, and a mini-drama of each of the jurors' prejudices and preconceptions about the trial, the accused, AND each other. Based on the play, all of the action takes place on the stage of the jury room.\",\"plotLocal\":\"\",\"plotLocalIsRtl\":false,\"awards\":\"Top Rated Movies #5 | Nominated for 3 Oscars. Another 17 wins & 10 nominations.\",\"directors\":\"Sidney Lumet\",\"directorList\":[{\"id\":\"nm0001486\",\"name\":\"Sidney Lumet\"}],\"writers\":\"Reginald Rose\",\"writerList\":[{\"id\":\"nm0741627\",\"name\":\"Reginald Rose\"}],\"stars\":\"Henry Fonda, Lee J. Cobb, Martin Balsam, John Fiedler\",\"starList\":[{\"id\":\"nm0000020\",\"name\":\"Henry Fonda\"},{\"id\":\"nm0002011\",\"name\":\"Lee J. Cobb\"},{\"id\":\"nm0000842\",\"name\":\"Martin Balsam\"},{\"id\":\"nm0275835\",\"name\":\"John Fiedler\"}],\"actorList\":[{\"id\":\"nm0000842\",\"image\":\"https://imdb-api.com/images/original/MV5BMTQwOTE4MjMxM15BMl5BanBnXkFtZTcwMDc5MDg5Nw@@._V1_Ratio0.7727_AL_.jpg\",\"name\":\"Martin Balsam\",\"asCharacter\":\"Juror 1\"},{\"id\":\"nm0275835\",\"image\":\"https://imdb-api.com/images/original/MV5BMTc1Njg3NDg1OF5BMl5BanBnXkFtZTcwMjY2MTYxOA@@._V1_Ratio0.7273_AL_.jpg\",\"name\":\"John Fiedler\",\"asCharacter\":\"Juror 2\"},{\"id\":\"nm0002011\",\"image\":\"https://imdb-api.com/images/original/MV5BNDc3MTM0MDQyMF5BMl5BanBnXkFtZTYwMTczMTg2._V1_Ratio0.7273_AL_.jpg\",\"name\":\"Lee J. Cobb\",\"asCharacter\":\"Juror 3\"},{\"id\":\"nm0550855\",\"image\":\"https://imdb-api.com/images/original/MV5BMTY3Nzg5MTMwOF5BMl5BanBnXkFtZTYwMzk2MTQ2._V1_Ratio0.8182_AL_.jpg\",\"name\":\"E.G. Marshall\",\"asCharacter\":\"Juror 4\"},{\"id\":\"nm0001430\",\"image\":\"https://imdb-api.com/images/original/MV5BMTkwMDIzOTg0N15BMl5BanBnXkFtZTYwODg0NDE2._V1_Ratio0.7273_AL_.jpg\",\"name\":\"Jack Klugman\",\"asCharacter\":\"Juror 5\"},{\"id\":\"nm0083081\",\"image\":\"https://imdb-api.com/images/original/MV5BNzAwODU2Njk2Ml5BMl5BanBnXkFtZTcwMjkxODUxOA@@._V1_Ratio0.8182_AL_.jpg\",\"name\":\"Edward Binns\",\"asCharacter\":\"Juror 6\"},{\"id\":\"nm0912001\",\"image\":\"https://imdb-api.com/images/original/MV5BMTc1Mjk3Njc5MV5BMl5BanBnXkFtZTcwMDk2MzUzMQ@@._V1_Ratio0.7273_AL_.jpg\",\"name\":\"Jack Warden\",\"asCharacter\":\"Juror 7\"},{\"id\":\"nm0000020\",\"image\":\"https://imdb-api.com/images/original/MV5BOTEwNjQ2ODQ4Nl5BMl5BanBnXkFtZTYwMzEwMTM2._V1_Ratio0.7727_AL_.jpg\",\"name\":\"Henry Fonda\",\"asCharacter\":\"Juror 8\"},{\"id\":\"nm0842137\",\"image\":\"https://imdb-api.com/images/original/nopicture.jpg\",\"name\":\"Joseph Sweeney\",\"asCharacter\":\"Juror 9\"},{\"id\":\"nm0003225\",\"image\":\"https://imdb-api.com/images/original/MV5BMTQwMTM0Njg2N15BMl5BanBnXkFtZTcwNzgzNzg1MQ@@._V1_Ratio0.7273_AL_.jpg\",\"name\":\"Ed Begley\",\"asCharacter\":\"Juror 10\"},{\"id\":\"nm0903667\",\"image\":\"https://imdb-api.com/images/original/MV5BMTU1NDcyMjg0M15BMl5BanBnXkFtZTcwMTY2MzAyOA@@._V1_Ratio0.7273_AL_.jpg\",\"name\":\"George Voskovec\",\"asCharacter\":\"Juror 11\"},{\"id\":\"nm0916434\",\"image\":\"https://imdb-api.com/images/original/MV5BMTM2MTA3NzYxNl5BMl5BanBnXkFtZTcwMTM0OTUwOA@@._V1_Ratio0.7727_AL_.jpg\",\"name\":\"Robert Webber\",\"asCharacter\":\"Juror 12\"}],\"fullCast\":null,\"genres\":\"Crime, Drama\",\"genreList\":[{\"key\":\"Crime\",\"value\":\"Crime\"},{\"key\":\"Drama\",\"value\":\"Drama\"}],\"companies\":\"Orion-Nova Productions\",\"companyList\":[{\"id\":\"co0032902\",\"name\":\"Orion-Nova Productions\"}],\"countries\":\"USA\",\"countryList\":[{\"key\":\"USA\",\"value\":\"USA\"}],\"languages\":\"English\",\"languageList\":[{\"key\":\"English\",\"value\":\"English\"}],\"contentRating\":\"Approved\",\"imDbRating\":\"9.0\",\"imDbRatingVotes\":\"702159\",\"metacriticRating\":\"96\",\"ratings\":null,\"wikipedia\":null,\"posters\":null,\"images\":null,\"trailer\":null,\"boxOffice\":{\"budget\":\"$350,000 (estimated)\",\"openingWeekendUSA\":\"\",\"grossUSA\":\"\",\"cumulativeWorldwideGross\":\"$955\"},\"tagline\":\"They have twelve scraps of paper... Twelve chances to kill!\",\"keywords\":\"jury,dialogue driven,courtroom,single set production,trial\",\"keywordList\":[\"jury\",\"dialogue driven\",\"courtroom\",\"single set production\",\"trial\"],\"similars\":[{\"id\":\"tt0108052\",\"title\":\"Schindler's List\",\"fullTitle\":\"Schindler's List (1993)\",\"year\":\"1993\",\"image\":\"https://imdb-api.com/images/original/MV5BNDE4OTMxMTctNmRhYy00NWE2LTg3YzItYTk3M2UwOTU5Njg4XkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_Ratio0.6737_AL_.jpg\",\"plot\":\"In German-occupied Poland during World War II, industrialist Oskar Schindler gradually becomes concerned for his Jewish workforce after witnessing their persecution by the Nazis.\",\"directors\":\"Steven Spielberg\",\"stars\":\"Liam Neeson, Ralph Fiennes, Ben Kingsley\",\"genres\":\"Biography, Drama, History\",\"imDbRating\":\"8.9\"},{\"id\":\"tt0060196\",\"title\":\"The Good, the Bad and the Ugly\",\"fullTitle\":\"The Good, the Bad and the Ugly (1966)\",\"year\":\"1966\",\"image\":\"https://imdb-api.com/images/original/MV5BOTQ5NDI3MTI4MF5BMl5BanBnXkFtZTgwNDQ4ODE5MDE@._V1_Ratio0.6737_AL_.jpg\",\"plot\":\"A bounty hunting scam joins two men in an uneasy alliance against a third in a race to find a fortune in gold buried in a remote cemetery.\",\"directors\":\"Sergio Leone\",\"stars\":\"Clint Eastwood, Eli Wallach, Lee Van Cleef\",\"genres\":\"Western\",\"imDbRating\":\"8.8\"},{\"id\":\"tt0111161\",\"title\":\"The Shawshank Redemption\",\"fullTitle\":\"The Shawshank Redemption (1994)\",\"year\":\"1994\",\"image\":\"https://imdb-api.com/images/original/MV5BMDFkYTc0MGEtZmNhMC00ZDIzLWFmNTEtODM1ZmRlYWMwMWFmXkEyXkFqcGdeQXVyMTMxODk2OTU@._V1_Ratio0.6737_AL_.jpg\",\"plot\":\"Two imprisoned men bond over a number of years, finding solace and eventual redemption through acts of common decency.\",\"directors\":\"Frank Darabont\",\"stars\":\"Tim Robbins, Morgan Freeman, Bob Gunton\",\"genres\":\"Drama\",\"imDbRating\":\"9.3\"},{\"id\":\"tt0071562\",\"title\":\"The Godfather: Part II\",\"fullTitle\":\"The Godfather: Part II (1974)\",\"year\":\"1974\",\"image\":\"https://imdb-api.com/images/original/MV5BMWMwMGQzZTItY2JlNC00OWZiLWIyMDctNDk2ZDQ2YjRjMWQ0XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_Ratio0.6947_AL_.jpg\",\"plot\":\"The early life and career of Vito Corleone in 1920s New York City is portrayed, while his son, Michael, expands and tightens his grip on the family crime syndicate.\",\"directors\":\"Francis Ford Coppola\",\"stars\":\"Al Pacino, Robert De Niro, Robert Duvall\",\"genres\":\"Crime, Drama\",\"imDbRating\":\"9\"},{\"id\":\"tt0073486\",\"title\":\"One Flew Over the Cuckoo's Nest\",\"fullTitle\":\"One Flew Over the Cuckoo's Nest (1975)\",\"year\":\"1975\",\"image\":\"https://imdb-api.com/images/original/MV5BZjA0OWVhOTAtYWQxNi00YzNhLWI4ZjYtNjFjZTEyYjJlNDVlL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_Ratio0.6737_AL_.jpg\",\"plot\":\"A criminal pleads insanity and is admitted to a mental institution, where he rebels against the oppressive nurse and rallies up the scared patients.\",\"directors\":\"Milos Forman\",\"stars\":\"Jack Nicholson, Louise Fletcher, Michael Berryman\",\"genres\":\"Drama\",\"imDbRating\":\"8.7\"},{\"id\":\"tt0110912\",\"title\":\"Pulp Fiction\",\"fullTitle\":\"Pulp Fiction (1994)\",\"year\":\"1994\",\"image\":\"https://imdb-api.com/images/original/MV5BNGNhMDIzZTUtNTBlZi00MTRlLWFjM2ItYzViMjE3YzI5MjljXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_Ratio0.6842_AL_.jpg\",\"plot\":\"The lives of two mob hitmen, a boxer, a gangster and his wife, and a pair of diner bandits intertwine in four tales of violence and redemption.\",\"directors\":\"Quentin Tarantino\",\"stars\":\"John Travolta, Uma Thurman, Samuel L. Jackson\",\"genres\":\"Crime, Drama\",\"imDbRating\":\"8.9\"},{\"id\":\"tt0068646\",\"title\":\"The Godfather\",\"fullTitle\":\"The Godfather (1972)\",\"year\":\"1972\",\"image\":\"https://imdb-api.com/images/original/MV5BM2MyNjYxNmUtYTAwNi00MTYxLWJmNWYtYzZlODY3ZTk3OTFlXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_Ratio0.7053_AL_.jpg\",\"plot\":\"An organized crime dynasty's aging patriarch transfers control of his clandestine empire to his reluctant son.\",\"directors\":\"Francis Ford Coppola\",\"stars\":\"Marlon Brando, Al Pacino, James Caan\",\"genres\":\"Crime, Drama\",\"imDbRating\":\"9.2\"},{\"id\":\"tt0109830\",\"title\":\"Forrest Gump\",\"fullTitle\":\"Forrest Gump (1994)\",\"year\":\"1994\",\"image\":\"https://imdb-api.com/images/original/MV5BNWIwODRlZTUtY2U3ZS00Yzg1LWJhNzYtMmZiYmEyNmU1NjMzXkEyXkFqcGdeQXVyMTQxNzMzNDI@._V1_Ratio0.6842_AL_.jpg\",\"plot\":\"The presidencies of Kennedy and Johnson, the Vietnam War, the Watergate scandal and other historical events unfold from the perspective of an Alabama man with an IQ of 75, whose only desire is to be reunited with his childhood sweetheart.\",\"directors\":\"Robert Zemeckis\",\"stars\":\"Tom Hanks, Robin Wright, Gary Sinise\",\"genres\":\"Drama, Romance\",\"imDbRating\":\"8.8\"},{\"id\":\"tt0137523\",\"title\":\"Fight Club\",\"fullTitle\":\"Fight Club (1999)\",\"year\":\"1999\",\"image\":\"https://imdb-api.com/images/original/MV5BMmEzNTkxYjQtZTc0MC00YTVjLTg5ZTEtZWMwOWVlYzY0NWIwXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_Ratio0.6737_AL_.jpg\",\"plot\":\"A nameless first person narrator (Edward Norton) attends support groups in attempt to subdue his emotional state and relieve his insomniac state. When he meets Marla (Helena Bonham Carter),... See full summary »\",\"directors\":\"David Fincher\",\"stars\":\"Brad Pitt, Edward Norton, Meat Loaf\",\"genres\":\"Drama\",\"imDbRating\":\"8.8\"},{\"id\":\"tt0099685\",\"title\":\"Goodfellas\",\"fullTitle\":\"Goodfellas (1990)\",\"year\":\"1990\",\"image\":\"https://imdb-api.com/images/original/MV5BY2NkZjEzMDgtN2RjYy00YzM1LWI4ZmQtMjIwYjFjNmI3ZGEwXkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_Ratio0.6737_AL_.jpg\",\"plot\":\"The story of Henry Hill and his life in the mob, covering his relationship with his wife Karen Hill and his mob partners Jimmy Conway and Tommy DeVito in the Italian-American crime syndicate.\",\"directors\":\"Martin Scorsese\",\"stars\":\"Robert De Niro, Ray Liotta, Joe Pesci\",\"genres\":\"Biography, Crime, Drama\",\"imDbRating\":\"8.7\"},{\"id\":\"tt0468569\",\"title\":\"The Dark Knight\",\"fullTitle\":\"The Dark Knight (2008)\",\"year\":\"2008\",\"image\":\"https://imdb-api.com/images/original/MV5BMTMxNTMwODM0NF5BMl5BanBnXkFtZTcwODAyMTk2Mw@@._V1_Ratio0.6737_AL_.jpg\",\"plot\":\"When the menace known as the Joker wreaks havoc and chaos on the people of Gotham, Batman must accept one of the greatest psychological and physical tests of his ability to fight injustice.\",\"directors\":\"Christopher Nolan\",\"stars\":\"Christian Bale, Heath Ledger, Aaron Eckhart\",\"genres\":\"Action, Crime, Drama\",\"imDbRating\":\"9\"},{\"id\":\"tt0167260\",\"title\":\"The Lord of the Rings: The Return of the King\",\"fullTitle\":\"The Lord of the Rings: The Return of the King (2003)\",\"year\":\"2003\",\"image\":\"https://imdb-api.com/images/original/MV5BNzA5ZDNlZWMtM2NhNS00NDJjLTk4NDItYTRmY2EwMWZlMTY3XkEyXkFqcGdeQXVyNzkwMjQ5NzM@._V1_Ratio0.6737_AL_.jpg\",\"plot\":\"Gandalf and Aragorn lead the World of Men against Sauron's army to draw his gaze from Frodo and Sam as they approach Mount Doom with the One Ring.\",\"directors\":\"Peter Jackson\",\"stars\":\"Elijah Wood, Viggo Mortensen, Ian McKellen\",\"genres\":\"Action, Adventure, Drama\",\"imDbRating\":\"8.9\"}],\"tvSeriesInfo\":null,\"tvEpisodeInfo\":null,\"errorMessage\":\"\"}";
//		JsonNode node2 = objMapper.readTree(response.toString());
		JsonNode node2 = objMapper.readTree(json);
//		System.out.println(node2.get("releaseDate").asText());
		String releaseDate = node2.get("releaseDate").asText();
		model.addAttribute("jsonObj", node2);
//		System.out.println(response);
		IMDBNativeApi apiPublisher = new IMDBNativeApiImpl();
		System.out.println("Api : "+apiPublisher.getApi());
		apiPublisher.searchByTitle("inception 2020");
		return "index";
	}
}
