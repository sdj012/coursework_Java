
import java.util.Scanner; 

public class Main {

	public static void main(String[] args) {

		String validity="";

		boolean data_validity=false;
		
		
		while(!data_validity) {
			
		Scanner input = new Scanner(System.in);		// Create new Scanner object
			
		System.out.print("Enter a credit card number as a long integer: ");
			
		if(input.hasNextLong()) {
			
			long number = input.nextLong();
		
			input.close();
			
			if(CreditCard.isValid(number)) {
			
				validity="valid";
				
				data_validity=true;
			
			} else validity="invalid";
			
			
			System.out.println(number + " is " + validity);
			
			System.exit(0);
			
		} else {
			
			System.out.println("\nInvalid Entry. Please Try Again.");
		
			}
		
		}
			}
	
	}
