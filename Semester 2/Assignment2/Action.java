package Assignment2;

//subclass of film
public class Action extends Film {
	
	// constructors - with title and classification
	public Action() {
		super();
	}
	public Action(String title, String classification) {
		super(title, classification);
	}
	
	// overridden late fee method - 5 euro per day for Action
	double calculateLateFee(int numDaysLate) {
		return numDaysLate * 5;
	}

}
