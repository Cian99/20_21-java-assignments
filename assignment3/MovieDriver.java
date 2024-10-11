package assignment3;

import java.util.Scanner;

public class MovieDriver {

	public static void main(String[] args) {
		
		// declare and create an array - for 3 movie objects
		Movie[] movies = new Movie[3];
		
		Scanner string_input = new Scanner(System.in);
		Scanner int_input = new Scanner(System.in);
		
		// reads in the movie title, genre and rating
		for(int i=0; i<movies.length; i++) {
			movies[i] = new Movie();
			System.out.println("Please enter the title of movie: ");
			movies[i].setTitle(string_input.nextLine());
			System.out.println("Please enter the genre of movie: ");
			movies[i].setGenre(string_input.nextLine());
			System.out.println("Please enter the rating (1-5) of movie: ");
			movies[i].setRating(int_input.nextInt());
			System.out.println();
		}
		
		// close the inputs
		string_input.close();
		int_input.close();
		
		// display each movie title, genre and rating 
		for(int i=0; i<movies.length; i++) {
			System.out.println(movies[i].toString());
			movies[i].playIt();
			System.out.println();
		}

	}

}
