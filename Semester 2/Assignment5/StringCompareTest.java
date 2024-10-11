package Assignment5;

import java.util.Scanner;

public class StringCompareTest {

	public static void main(String[] args) {
		
		// create StringCompare
		StringCompare compare = new StringCompare();
		
		// create a scanner object
		Scanner input = new Scanner(System.in);
		
		// user enters the strings
		System.out.print("Enter string 1: ");
		compare.setString1(input.nextLine());
				
		System.out.print("Enter string 2: ");
		compare.setString2(input.nextLine());;
		
		// display the strings
		System.out.println("String 1 says: " + compare.getString1());
		System.out.println("String 2 says: " + compare.getString2());
		
		// use the reusable comparison static method to check for string equality
		StringCompare.comparison(compare.getString1(), compare.getString2());
		
		// close the scanner
		input.close();

	}
	
}
