package Assignment5;

import java.util.Scanner;

public class UpperandLower {

	public static void main(String[] args) {
		
		// create a scanner object
		Scanner input = new Scanner(System.in);
		
		// user enters the sentence
		// printed in upper and lower case
		// tokenized and tokens printed
		
		// user enters a sentence
		System.out.print("Enter a sentence: ");
		String sentence = input.nextLine();
		
		// print in upper and lower case
		System.out.println("The sentence in upper case: " + sentence.toUpperCase());
		System.out.println("The sentence in lower case: " + sentence.toLowerCase());
		
		// tokenize the sentence - using whitespace delimiter
		String[] tokens = sentence.split(" ");
		// display the tokens
		System.out.println("Sentence 1 tokens:");
		for(String token : tokens) {
			System.out.println(token);
		}
		
		// close the scanner 
		input.close();
		

	}

}
