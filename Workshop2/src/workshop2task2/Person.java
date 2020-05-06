package workshop2task2;

public class Person {

	private String name="";
	private String address="";
	private String phoneNumber="";
	private String email="";
	
	
	
public Person(String name, String address, String phoneNumber, String email) {
	
	this.name=name;
	this.address=address;
	this.phoneNumber=phoneNumber;
	this.email=email;
	
}


public String toString() {

return "Name: " + getName() + "\t" + "Class: Person" +"\n";

}

public String getName() {
return name;
}

public String getAddress() {
return address;
}

public String getphoneNum() {
return phoneNumber;
}

public String getEmail() {
return email;
}

};
