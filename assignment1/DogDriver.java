package assignment1;

public class DogDriver {

	public static void main(String[] args) {
		
		// declare and create a dog object
		Dog dog = new Dog();
		
		// test the constructor
		System.out.println("Test Constructor");
		System.out.println(dog.getSize());
		System.out.println(dog.getBreed());
		System.out.println(dog.getName());
		
		// set the dogs info
		dog.setSize("Size = 12");
		dog.setBreed("Breed = German Shepard");
		dog.setName("Name = Rex");
		
		// print 
		System.out.println("\n" + dog.getSize());
		System.out.println(dog.getBreed());
		System.out.println(dog.getName());
		System.out.println(dog.bark());

	} // end main method

} // end class
