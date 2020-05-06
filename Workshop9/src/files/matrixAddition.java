package files;
import java.util.Random;


public final class matrixAddition {
	
	public static double[][] parallelAddMatrix(){
		
		
		

		Random rand=new Random();

		double a[][]=new double [2000][2000];
			
		double b[][]=new double [2000][2000];
		

	   for (int c = 0; c < 2000; c++) {
	         for (int d = 0; d < 2000; d++) {
	        	 a[c][d] = rand.nextDouble();
	         	}   	 
	   		}
	   
	   for (int c = 0; c < 2000; c++) {
	         for (int d = 0; d < 2000; d++) {
	        	 b[c][d] = rand.nextDouble();
	         	}   	 
	   		}
	   
		
		 double [][] e = new double [2000][2000];
		

		
	       System.out.println("The sum of the two matrices is");
	       for (int i = 0; i < 2000; i++) {
	           for (int j = 0; j < 2000; j++) {
	               System.out.print(e[i][j] + " ");
	           }
	           System.out.println();
	        
	       }
		
		
		return e;
	
	
	}
		
}

     