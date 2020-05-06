package workshop2task2;

public class Main {
	
	public static void main(String[] args) {
		
	System.out.println("Task 2");

	System.out.println("\n");
	
	
	Person P1=new Person("(name)","isaddress","isphonenumber","isemail");
	
	System.out.println(P1.toString());
	
	
	Student S1=new Student("(name)","isaddress","isphonenumber","isemail");
	
	System.out.println(S1.toString());
	
	
	Employee E1=new Employee("(name)","isaddress","isphonenumber","isemail","isOffice","isSalary",2019,11,11);
	
	System.out.println(E1.toString());
	
	
	Faculty F1=new Faculty("(name)","isaddress","isphonenumber","isemail","isOffice","isSalary",2019,11,11,"isofficeHours","isrank");
	
	System.out.println(F1.toString());
	
	
	Staff St1=new Staff("(name)","isaddress","isphonenumber","isemail","isOffice","isSalary",2019,11,11,"istitle");
	
	System.out.println(St1.toString());

	}

}
