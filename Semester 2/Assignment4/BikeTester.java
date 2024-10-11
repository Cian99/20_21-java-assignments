package Assignment4;

public class BikeTester {

	public static void main(String[] args) {
		
		System.out.println("Bicycles:\n");
		
		// a number of instances of Bicycle class
		// demonstrating the constructors and setters
		Bicycle bike1 = new Bicycle(90, 5, 50);
		System.out.println(bike1.toString());
		
		Bicycle bike2 = new Bicycle(80, 4, 30);
		System.out.println(bike2.toString());
		
		// demonstrates the setters
		Bicycle bike3 = new Bicycle();
		bike3.setCadence(75);
		bike3.setGear(6);
		bike3.speedUp(bike3.getSpeed());
		System.out.println(bike3.toString());
		
		System.out.println("We can increment and decrement the speed values:\n");
		
		// decrement and increment speed methods working
		bike1.speedUp(bike1.getSpeed());
		bike2.applyBrake(bike2.getSpeed());
		bike3.speedUp(bike3.getSpeed());
		
		// toString demonstrates all the getters
		System.out.println(bike1.toString());
		System.out.println(bike2.toString());
		System.out.println(bike3.toString());
		
		
		
		
		// 3 ways to get rid of an objects reference:
		
		// 1. Reference goes out of scope
		// void method() {
			// Bicycle bike = new Bicycle();
		// }  // bike dies at end of the method
		
		// 2. Reference assigned another object
		// bike1 = new Bicycle();
		
		// 3. Reference is explicitly set to null
		// bike2 = null;
		

	}

}
