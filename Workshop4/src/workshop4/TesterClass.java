package workshop4;

import java.util.Scanner;

public class TesterClass {
	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	
	Boolean validityLoop=false;
	
	while(!validityLoop) {
		
	System.out.println("Enter a file name:");
	
	if(input.hasNext()) {
		
		String fileName=input.next();
		
		if(Validation.FileValidation(fileName)) {
			
			if(LetterCounter.readFile(fileName)=="1") {System.out.println("Exception! File Not Found \n");}
			else if(LetterCounter.readFile(fileName)=="2") {System.out.println("Error! IO Exception \n");}
			else {
			System.out.println(LetterCounter.readFile(fileName));
			validityLoop=true;
			
			}
			
		}
		
		else System.out.println("Invalid Entry.Please Try Again \n");
		
		}
	
	}
	
	Scanner input2 = new Scanner (System.in);
	
	
	validityLoop=false;
	
	while(!validityLoop) {
		
	System.out.println("Enter a Phone Number in the format (000-0000):");
	
	if(input2.hasNext()) {
	
		String PhoneNumber=input2.next();
		
		if(Validation.NumberValidation(PhoneNumber)){
		validityLoop=true;
		PhoneNumbertoWords.phoneNumber(PhoneNumber);
		}
		
		else System.out.println("Invalid Entry.Please Try Again \n");
		
	}
	
	}
	
	}
	
}



