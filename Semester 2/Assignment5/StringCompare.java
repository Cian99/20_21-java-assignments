package Assignment5;

public class StringCompare {
	
	private String string1;
	private String string2;
	
	// constructors
	public StringCompare() {
		this(null, null);
	}
	public StringCompare(String string1, String string2) {
		this.string1 = string1;
		this.string2 = string2;
	}
	
	// getters
	public String getString1() {
		return string1;
	}
	public String getString2() {
		return string2;
	}
	
	// setters
	public void setString1(String string1) {
		this.string1 = string1;
	}
	public void setString2(String string2) {
		this.string2 = string2;
	}
	
	// reusable compare method
	public static void comparison(String string1, String string2) {
		if(string1.equals(string2)) {
			System.out.println("\nThe strings are equal");
		}
		else {
			System.out.println("\nThe strings are not equal");
		}
	}

}
