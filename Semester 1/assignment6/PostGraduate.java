package assignment6;

//subclass to the Student class - PostGraduate() IS-A Student()

public class PostGraduate extends Student {
	
	// constructors
	public PostGraduate() {
		super("Unassigned", 0);
	}
	public PostGraduate(String name, long id) {
		super(name, id);
	}
		
	@Override
	public void calculateResult() {
		System.out.println("This Student is a PostGraduate.");
		String grade = " ";
		double sum = 0;
		double average = 0;
		
		for(int i=0; i<getNumTests(); i++) {
			sum += getTestScore(i);
		}
		average = sum / getNumTests();
		
		if(average >= 50 && average <= 100) {
			grade = "Pass";
		}
		else {
			grade = "Fail";
		}
		
		setGrade(grade);
		
		System.out.println("Average grade is " + average);
		System.out.println("This is a " + grade);
	}

}
