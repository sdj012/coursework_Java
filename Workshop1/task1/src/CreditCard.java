
public class CreditCard {

	
	//4
	public static boolean isValid(long number) {
		
		if(getSize(number)>12 && getSize(number)<17) {
			
			if(prefixMatched(number,37) || prefixMatched(number,4) || prefixMatched(number,5) || prefixMatched(number,6)) {
				
				if((sumOfDoubleEvenPlace(number)+sumOfOddPlace(number))%10==0) return true;
					
				else return false;
			
			} else return false;
			
		} else return false;
	};
	
	
	//1,2
	
	public static int sumOfDoubleEvenPlace(long number) {
	
	String numb_str=Long.toString(number);
	
	
	int sum=0;
	
	
	if(numb_str.length()%2==0) {
	
		for(int i=0;i<numb_str.length();i++) {
	
			if(i%2==0) {
		
			sum+=getDigit(2*Character.getNumericValue((numb_str.charAt(i))));
	
			}
		}
		
	}
	
	if(numb_str.length()%2!=0) {
		
		for(int i=0;i<numb_str.length();i++) {
	
			if(i%2!=0) {
				
					
			sum+=getDigit(2*Character.getNumericValue((numb_str.charAt(i))));
	
			}
		}
		
	}
	
	return sum;
	
	};
	
	//1
	
	public static int getDigit(int number) {
		
	if(number>9) {
		
		number=((number-number%10)/10)+number%10;
	
	}
	
	return number;
		
	};
	
	//3
	public static int sumOfOddPlace(long number) {
	
	String numb_str=Long.toString(number);
	
	int sum=0;
	
	if(numb_str.length()%2==0) {
		
		for(int i=0;i<numb_str.length();i++) {
	
			if(i%2!=0) {
		
			sum+=Character.getNumericValue((numb_str.charAt(i)));
	
			}
		}
		
	}
	
	if(numb_str.length()%2!=0) {
		
		for(int i=0;i<numb_str.length();i++) {
	
			if(i%2==0) {
				
			sum+=Character.getNumericValue((numb_str.charAt(i)));
	
			}
		}
		
	}
	
	return sum;
		
	};
	
	
	
	public static boolean prefixMatched(long number,int d) {
		
	String numb_str_d=Integer.toString(d);

	if (getPrefix(number,numb_str_d.length())==d)return true;
	
	else return false;
	

	};
	
	
	public static int getSize(long d) {
		
	String numb_str=Long.toString(d);
	
	int length=numb_str.length();
	
	return length;
	

	};
	
	
	public static long getPrefix(long number, int k) {
		
	String numb_str=Long.toString(number);
	
	if(numb_str.length() < k) return number;
	
	long digits = Long.parseLong(numb_str.substring(0,k));
	
	return digits;
	
	};	

}
