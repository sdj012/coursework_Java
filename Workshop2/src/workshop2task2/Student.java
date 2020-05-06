package workshop2task2;

public class Student extends Person {
	
	final String status="freshman";
	
	public Student(String name, String address, String phoneNumber, String email) {
		
		super(name, address, phoneNumber, email);

	}

	
	public String toString() {
		
		return "Name: " + super.getName() + "\t" + "Class: Student" +"\n";

		}

}
