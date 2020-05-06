package workshop2task2;
import workshop2task1.MyDate;

@SuppressWarnings("unused")

public class Faculty extends Employee {

	private String officeHours;
	private String rank;
	
	public Faculty(String name, String address, String phoneNumber, String email, String office, String salary,
			int HiredYear, int HiredMonth, int HiredDayofMonth,String officeHours,String rank) {
		
		super(name, address, phoneNumber, email, office, salary,HiredYear, HiredMonth, HiredDayofMonth);
		
		this.officeHours=officeHours;
		this.rank=rank;

	}
	
	public String toString() {
		
		return "Name: " + super.getName() + "\t" + "Class: Faculty" + "\t" + "HireDate: " + HireDate.toString() + "\n";
		
	}
	

}
