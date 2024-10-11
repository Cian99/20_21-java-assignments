package Assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SalesTester {

	public static void main(String[] args) {
		
		// two instances of each salesPeople type
		SalesAgent first = new SalesAgent("Rory", "McIlroy", "13579");
		SalesAgent second = new SalesAgent("Corey", "Conners", "24680");
		SalesEmp third = new SalesEmp("Bryson", "DeChambeau", "19753");
		SalesEmp fourth = new SalesEmp("Jason", "Kokrak", "20864");
		
		// create array list - add instances
		List<SalesPeople> salesList = new ArrayList<>();
		
		salesList.add(first);
		salesList.add(second);
		salesList.add(third);
		salesList.add(fourth);
		
		// create scanner for the sales figures
		Scanner input = new Scanner(System.in);
		
		// input sales for each and calculate commission
		for(int i=0; i<salesList.size(); i++) {
			
			System.out.printf("Enter sales for employee %d: ", i+1);
			salesList.get(i).sales = input.nextDouble();
			salesList.get(i).calculateCommission();
			
			// instanceof to check type of sales person
			if(salesList.get(i) instanceof SalesAgent) {
				salesList.get(i).type = "Sales Agent";
			}
			else if(salesList.get(i) instanceof SalesEmp) {
				salesList.get(i).type = "Sales Employee";
			}
			
		}
		
		// close the scanner
		input.close();
		
		// print out the details in the array using the toString 
		System.out.println("\nEmployee Details:");
		
		for(int i=0; i<salesList.size(); i++) {
			System.out.println(salesList.get(i).toString());
		}
	
	}

}
