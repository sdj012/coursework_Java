package task1;
import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Enter Length of Side 1: ");
	
	Scanner input=new Scanner(System.in);
	
	long Side1=input.nextLong();

	System.out.println("Enter Length of Side 2: ");
	
	long Side2=input.nextLong();
	
	System.out.println("Enter Length of Side 3: ");
	
	long Side3=input.nextLong();
	
	System.out.println("Enter a Color: ");
	
	String color=input.next();
	
	
	System.out.println("Enter True/False for the filled property: ");
	
	Boolean Filled=input.nextBoolean();

	input.close();
	
	
	Triangle T1=new Triangle(Side1,Side2,Side3,color,Filled);
	
	
	System.out.println("The Perimeter of the triangle is: " + T1.Perimeter());
	
	System.out.println("The Area of the triangle is: " + T1.Area());
	
	System.out.println(T1.toString());
	
	}
	

}
