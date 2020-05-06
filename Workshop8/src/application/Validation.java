package application;

import javafx.scene.control.TextField;

public class Validation {
	

	public static Boolean FileValidation(String validate){		
		
		boolean valid=false;
		
		if(validate.endsWith(".txt"))valid=true;
		
		return valid;
		
	}
	
	public static Boolean NumberValidation(String string){
		
		boolean valid=true;
			
		
			for(int i=0; i<string.length();i++) {
				
			
				if(Character.isDigit(string.charAt(i))){ valid=false; }
			
			}

	
	return valid;
	
	}
	
}
	
