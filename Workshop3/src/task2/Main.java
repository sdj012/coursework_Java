package task2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	Scanner input = new Scanner (System.in);
	
	
	Boolean done=false;
	
	while(done==false) {
		
	System.out.println("Enter Number of Banks: ");
	
	int numOfBanks=input.nextInt();
	
		if(numOfBanks>0) {
			
			while(done==false) {
			
			System.out.println("Enter Minimum Asset: ");
			
			int minAsset=input.nextInt();
			
			
			
			if(minAsset>=0) {
				
				Bank[] banksArr=new Bank[numOfBanks];
				
				ArrayList<Integer> unsafeList1 = new ArrayList<Integer>();
				
				for(int i=0;i<banksArr.length;i++) {
					
					System.out.println("Enter Balance for Bank "+i + ": ");
					
					double bankbal=input.nextDouble();	
					
					
				if(bankbal>=0) {
					
				
					banksArr[i] = new Bank(i,minAsset,bankbal);
				
					banksArr[i].addCollectableBanks(numOfBanks);
				
				} else System.out.println("Invalid Entry.Please try again.");
				
			
//				
//				for(int i1=0;i1<banksArr.length;i1++) {
					
					banksArr[i].Evaluate();
					
					if(!banksArr[i].getisSafe()) unsafeList1.add(i);
				
//				}
				
					
				ArrayList<Integer> unsafeList = new ArrayList<Integer>();
				
				
				for(int l=0;l<banksArr.length;l++) {
					
					
					for(int j=0;j<(banksArr[l].getCollectable()).length;j++) {
						
						
						Bank objKey=((banksArr[l].getCollectable())[j]);
						
						int idVal=(objKey.getBankId());
						
						
							if(unsafeList1.contains(idVal)) {
							
							objKey.setisSafe(false);
							
							}
							
					}
					
				}
				

				for(int i1=0;i1<banksArr.length;i1++) {
					
					banksArr[i].Evaluate();
					
					if(!banksArr[i].getisSafe()) unsafeList.add(i);
					
				}
					
			
				
				System.out.println("Unsafe Banks are Banks " + unsafeList);
				
				done=true;
				
				
				}
				
				}else System.out.println("Invalid Entry.Please try again.");

	
	}
		
	input.close();
	
	} else System.out.println("Invalid Entry.Please try again.");


}
		
}
	
}
	



