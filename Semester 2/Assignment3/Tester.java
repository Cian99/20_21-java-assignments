package Assignment3;

// import the scanner
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		
		// create a coffee bean order
		CoffeeBagOrder order1 = new CoffeeBagOrder();
		
		// create a scanner
		Scanner input = new Scanner(System.in);
		
		// user inputs info
		System.out.printf("Enter Number of Bags sold: ");
		order1.numberOfUnits(input.nextInt());
		System.out.printf("Enter Weight of a bag (in Kgs, e.g. 5): ");
		order1.unitWeight(input.nextInt());
		
		System.out.println(order1.toString());
		
		// close the scanner
		input.close();

	}

}
