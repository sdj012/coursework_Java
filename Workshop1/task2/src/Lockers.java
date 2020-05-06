
public class Lockers {
	
	static boolean lockers[]=new boolean [100];
	
	
	public static void student(boolean[] lockers,int sNum) {
		
		for (int i = 0; i<lockers.length; i++) {
			
			if((i+1)%sNum==0) lockers[i]=!lockers[i];
		}
	
	}
	
	public static String AreOpen(boolean[] lockers) {
	
	String Open="";
	
		for (int i = 0; i<lockers.length; i++) {
		
			if(lockers[i]) Open+=i+1+" ";
			
		}
		
	return Open;
	
	}

}
	

