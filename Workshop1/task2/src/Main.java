public class Main {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	
		for(int i =1;i<=100;i++) {
			
			Lockers.student(Lockers.lockers,i);

		}
		
		System.out.println("The Open Lockers Are: " + Lockers.AreOpen(Lockers.lockers));
			
		}
			
	}
	
