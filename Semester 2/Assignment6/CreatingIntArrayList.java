package Assignment6;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CreatingIntArrayList {
	
	public static void main(String[] args) {
		
		// create scanners 
		Scanner intInput = new Scanner(System.in);
		Scanner stringInput = new Scanner(System.in);
				
		// create an ArrayList
		List<Integer> integerList = new ArrayList<>();
		
		// declare variable
		int number = 0;
		boolean done = false;
		
		while(!done) {
			
			// try catch for Exception to stop crash
			try {
				
				// get input from user
				System.out.print("Enter an integer: ");
				number = intInput.nextInt();
						
				// enter int into list
				integerList.add(number);  // auto-boxing
				
				// ask user if exit or continue
				System.out.print("Enter 'Y' to exit: ");
				String exit = stringInput.nextLine();
				if(exit.equals("Y")) {
					done = true;
				}
				
			}
			// ensure the application does not crash
			catch(InputMismatchException ex) {
				
				intInput.nextLine();
				System.out.println("\nError! Not an integer. Try Again!\n");
				
			}	
			
		}
		
		// display contents of the list
		System.out.println("\nArrayList contents:");
		for(int i=0; i<integerList.size(); i++) {
			System.out.println(integerList.get(i));  // auto-unboxing
		}
		
		// close the scanners
		intInput.close();
		stringInput.close();
		
		// Auto-boxing: Automatic conversion of primitive types to the object of their corresponding wrapper class
		// eg. int to Integer
		// Auto-unboxing: Automatic conversion of an object of a wrapper class to its corresponding primitive type
		// eg. Integer to int
				
	}

}
