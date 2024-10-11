package Assignment4;

public class Bicycle {
	
	// instance variables
	private int cadence;
	private int gear;
	private int speed;
	// class variable
	private static int numberOfBicycles;
	
	// constructors
	public Bicycle() {
		this(0, 0, 0);
	}
	public Bicycle(int cadence, int gear, int speed) {
		this.cadence = cadence;
		this.gear = gear;
		this.speed = speed;
		numberOfBicycles++;
	}
	
	// getters
	public int getNumberOfBicycles() {
		return numberOfBicycles;
	}
	public int getCadence() {
		return cadence;
	}
	public int getGear() {
		return gear;
	}
	public int getSpeed() {
		return speed;
	}
	
	// setters
	public void setCadence(int cadence) {
		this.cadence = cadence;
	}
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	// decrement speed by 5
	public void applyBrake(int speed) {
		speed-=5;
		this.speed = speed;
	}
	
	// increment speed by 5
	public void speedUp(int speed) {
		speed+=5;
		this.speed = speed;
	}
	
	// toString to print out useful data and information
	@Override
	public String toString() {
		return "Number of Bicycles: " + getNumberOfBicycles() + "\nCadence: " + getCadence() + "\nGear: " + getGear() + "\nSpeed: " + getSpeed() + "\n";
	}

}
