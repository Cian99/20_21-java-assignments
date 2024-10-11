package Assignment2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilmTest {

	public static void main(String[] args) {
		
		// instances of Drama, Action and Comedy
		Drama first = new Drama("Joker", "16");
		Action second = new Action("Avengers: Endgame", "12A");
		Comedy third = new Comedy("Deadpool 2", "16");
		
		// create array list - then add the instances
		List<Film> filmList = new ArrayList<>();
		
		filmList.add(first);
		filmList.add(second);
		filmList.add(third);
		
		// scanner
		Scanner input = new Scanner(System.in);
		
		// print out the details in the arrayList using the toString & calculate the late fees
		System.out.println("Film Details: ");
		
		for(int i=0; i<filmList.size(); i++) {
			
			System.out.println(filmList.get(i).toString());
			System.out.printf("Enter number of days late for film %d: ", i+1);
			System.out.println("Late Fee: €" + filmList.get(i).calculateLateFee(input.nextInt()));
			
		}
		
		// close the scanner
		input.close();
		
	}

}
