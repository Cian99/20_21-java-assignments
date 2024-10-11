package assignment1;

// import from scanner class
import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		
		int number = 0;
		
		Scanner input = new Scanner(System.in);
		
		// asks for the user to input a number 
		System.out.print("Enter a number between 1 and 10: ");
		number = input.nextInt();
		
		// this executes if the number is not between 1 and 10
		while(number < 1 || number > 10) {
			// asks for another number
			System.out.print("Enter a number between 1 and 10: ");
			number = input.nextInt();
			
			// checks if the number is valid
			if(number >= 1 && number <= 10) {
				input.close();
			}
			// if number is not valid - asks for another number
			else {
				System.out.print("Enter a number between 1 and 10: ");
				number = input.nextInt();
			}
		}
		
		// prints the valid number entered by the user
		System.out.println("Validated input = " + number);
		
	}

}
