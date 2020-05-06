package task2;
import java.util.Scanner;

public class Bank{
	
	private int bankId=0;
	
	private double balance=0.0;
	
	private int minAsset=0;
	
	private Boolean isSafe=true;
	
	private double owing=0.0;
	
	private Bank [] Collectable;

	
	Bank(){}
	
	Bank(int bankId, int minAsset,double balance){
		
		this.bankId=bankId;
		this.minAsset=minAsset;
		this.balance=balance;

	}
	
	Bank(int bankId,double owing){
		this.bankId=bankId;
		this.owing=owing;

	}
	
	
	public void setisSafe(Boolean stat) { this.isSafe=stat;}
	public Boolean getisSafe() {return this.isSafe;}
	public void setPayable(double owing) {this.owing=owing;}
	public double getPayable() {return this.owing;}
	public void setminAsset(int min) { this.minAsset=min;}
	public int getminAsset() { return this.minAsset;}
	public void setBalance(double bal) { this.balance=bal;}
	public double getBalance() { return this.balance;}
	public void setBankId(int id) { this.bankId=id;}
	public int getBankId() { return (this.bankId);}
	public Bank [] getCollectable() { return Collectable; }


	public void addCollectableBanks(int numOfBanks) {
		
		Boolean done=false;
		
		while(done==false) {
			
		
		System.out.println("Enter Number of Collectable Banks: ");
		
		Scanner input = new Scanner (System.in);
		
		int num=input.nextInt();
		
		if(num>0) {
			
		Bank [] Collectable = new Bank [num];
		
		
		for(int i=0;i<num;i++) {
			
		Boolean idCheck=false;
			while(idCheck==false) {
		
				System.out.println("Enter a Collectable Bank ID: ");
		
				int id=input.nextInt();
		
		
				if ( id<= numOfBanks) {
			
					while(idCheck==false) {
			
						System.out.println("Enter Amount Loaned: ");
		
						double owing=input.nextDouble();
			
						if(owing>0) {
			
							Collectable[i]=new Bank(id,owing);
							
							idCheck=true;
							
						}else System.out.println("Invalid Entry, try again.");
			
					}
					
			
				}else System.out.println("Non-existing Bank ID, try again.");
			
			}
			
		}
		
		this.Collectable=Collectable;
			
		done=true;
		
		}else System.out.println("Invalid Entry, try again.");
		
		}
		
	}

		
	public String toString() {
		
		return "Bank # " + getBankId()+ " has a balance of " +getBalance();
	}
	
	
	public double TotalCollectable() {
		
		double total=0;
		
		for(int i=0;i<this.Collectable.length;i++) {
			
			if(this.Collectable[i].getisSafe()) total+=this.Collectable[i].getPayable();
			
		}
		
		return total;
	}
	
	
	public void Evaluate(){
		

		if(this.TotalCollectable() + this.getBalance() > this.getminAsset()) this.setisSafe(true);
		
			else this.setisSafe(false);
			
			
	}
		
}


	
