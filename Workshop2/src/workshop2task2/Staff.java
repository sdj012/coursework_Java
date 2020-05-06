package workshop2task2;
import workshop2task1.MyDate;

@SuppressWarnings("unused")

public class Staff extends Employee{

	private String title;
	
	public Staff(String name, String address, String phoneNumber, String email, String office, String salary,
			int HiredYear, int HiredMonth, int HiredDayofMonth,String title){
		
		super(name, address, phoneNumber, email, office, salary, HiredYear,HiredMonth,HiredDayofMonth);
		
		this.title=title;

	}
	
	public String toString() {
		
		return "Name: " + super.getName() + "\t" + "Class: Staff" + "\t"+ "HireDate: " + HireDate.toString() +"\n";
	}
	


}
