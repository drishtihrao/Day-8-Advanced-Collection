package com.cg.collection.movies;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Movie_DetailsList {
	public List<Movie_Details> list = new ArrayList<>();

	// defining method to add a new Movie in the list
	public void add_movie(Movie_Details md) {
		list.add(md);
	}

	// defining method to remove a Movie from the list
	public void remove_movie(Movie_Details md) {
		list.remove(md);
	}

	// defining method to remove all Movies from the list
	public void remove_AllMovies() {
		list.removeAll(list);
	}

	public void find_mov_By_mov_Name(String name) {
//		Predicate<Movie_Details> findByMovieName = Movie_Details -> Movie_Details.getMov_Name().equals(name);
//		return list.stream().anyMatch(findByMovieName);
	
		for (Movie_Details movies : list) {
			if (movies.getMov_Name().equals(name))
				System.out.print(movies);
		}
	}

	public void find_mov_By_mov_Genre(String genre) {
		for (Movie_Details movies : list) {
			if (movies.getGenre().equals(genre))
				System.out.print(movies);
		}
	}

	//method to sort the movies according to the user's choice
	public void movie_sort(int choice) {
		Comparator<Movie_Details> compareByMovieName = (movie1, movie2) -> movie1.getMov_Name()
				.compareTo(movie2.getMov_Name());
		Comparator<Movie_Details> compareByMovieGenre = (movie1, movie2) -> movie1.getGenre()
				.compareTo(movie2.getGenre());
		Comparator<Movie_Details> compareByLeadActor = (movie1, movie2) -> movie1.getLead_actor()
				.compareTo(movie2.getLead_actor());
		Comparator<Movie_Details> compareByLeadActress = (movie1, movie2) -> movie1.getLead_actress()
				.compareTo(movie2.getLead_actress());

		switch (choice) {
		case 1:
			Collections.sort(list, compareByMovieName);
			break;
		case 2:
			Collections.sort(list, compareByMovieGenre);
			break;
		case 3:
			Collections.sort(list, compareByLeadActor);
			break;
		case 4:
			Collections.sort(list, compareByLeadActress);
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}
	}

}
