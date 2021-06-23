package io.sham.movieinfoservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.sham.movieinfoservice.model.MovieInfo;

@RestController
@RequestMapping("/movieinfo")
public class MovieInfoController {

	Map<Integer, MovieInfo> movieDB = new HashMap<>();

	{
		movieDB.put(1, new MovieInfo(1, "Pirates Of Caribbean"));
		movieDB.put(2, new MovieInfo(2, "Sherlock Holmes"));
		movieDB.put(3, new MovieInfo(3, "Avatar"));
		movieDB.put(4, new MovieInfo(4, "Tumbadd"));
		movieDB.put(5, new MovieInfo(5, "Avenger Endgame"));

	}

	@RequestMapping("/{movieId}")
	public MovieInfo getMovieInfo(@PathVariable Integer movieId) {
		return movieDB.get(movieId);
	}
}
