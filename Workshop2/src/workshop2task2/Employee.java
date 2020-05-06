package workshop2task2;
import workshop2task1.MyDate;

@SuppressWarnings("unused")

public class Employee extends Person {
	
	
	private String office;
	private String salary;
	protected MyDate HireDate;
	
	public Employee(String name, String address, String phoneNumber, String email, String office, String salary, int HiredYear, int HiredMonth, int HiredDayofMonth)  {
		
		super(name, address, phoneNumber, email);
		
		this.office=office;
		this.salary=salary;
	
		HireDate=new MyDate(HiredYear,HiredMonth,HiredDayofMonth);

	}
	
	public String toString() {
		
		return "Name: " + super.getName() + "\t" + "Class: Employee" + "\t"+ "HireDate: " + HireDate.toString() + "\n";
	}
	
	
	

}
