package com.cg.collection.test;

import java.util.Scanner;

import com.cg.collection.movies.Movie_Details;
import com.cg.collection.movies.Movie_DetailsList;

public class Movie_DetailsTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Movie_DetailsList movieList = new Movie_DetailsList();

		Movie_Details sh = new Movie_Details("SherlockHolmes", "RobertD.Jr.", "RachelMcAdams", "Mystery");
		Movie_Details istr = new Movie_Details("Interstellar", "MathhewM", "AnneHathway", "ScienceFiction");
		Movie_Details dark = new Movie_Details("DarkKnight", "ChristianBale", "AnneHathway", "Fiction");
		Movie_Details dch = new Movie_Details("DilChahtaHai", "AmirKhan", "PrietyZinta", "Bollywood");
		Movie_Details yjhd = new Movie_Details("YJHD", "RK", "DP", "Bollywood");

		movieList.add_movie(yjhd);
		movieList.add_movie(dark);
		movieList.add_movie(dch);
		movieList.add_movie(istr);
		movieList.add_movie(sh);

		// printing the array list
		movieList.list.stream().forEach(System.out::print);

		System.out.println();
		System.out.println();

		System.out.println("Enter the movie name you want to find");
		String find = new String(scanner.nextLine());
		movieList.find_mov_By_mov_Name(find);

		System.out.println();

		System.out.println("Enter the genre you want to find");
		find = new String(scanner.nextLine());
		movieList.find_mov_By_mov_Genre(find);

		System.out.println();
		System.out.println("--------------------------------------------");

		movieList.remove_movie(yjhd);
		movieList.list.stream().forEach(System.out::print);

		System.out.println();
		System.out.println("--------------------------------------------");

//		movieList.remove_AllMovies();
//		System.out.println("--------------------------------------------");
//		movieList.list.stream().forEach(System.out::print);

		System.out.println("Enter numberaccording to choice:\n1. Sort by movie name \n2. Sort by movie genre \n3. Sort by Lead Actor \n4. Sort by Lead Actress");
		int choice = scanner.nextInt();
		movieList.movie_sort(choice);
		movieList.list.stream().forEach(System.out::print);
	}

}
