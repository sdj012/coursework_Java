package workshop4;

public class Validation {
	

	public static Boolean FileValidation(String validate){		
		
		boolean valid=false;
		
		if(validate.endsWith(".txt"))valid=true;
		
		return valid;
		
	}
	
	public static Boolean NumberValidation(String validate){
		
		boolean valid=true;
		
		for(int i=0; i<((CharSequence) validate).length();i++) {
			
					if((int)((CharSequence) validate).charAt(i)<48 || (int)((CharSequence) validate).charAt(i)>57){ valid=false; }
			
			}

	return valid;
	
	}
	
}
	
