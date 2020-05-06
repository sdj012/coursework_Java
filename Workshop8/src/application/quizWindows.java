package application;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


import javafx.scene.control.Label;

public class quizWindows {

	
	public static ArrayList<String> answers=new ArrayList<String>();
	
		public static void onSubmit() {
			
	   	
	    			
	    };
	    
    
	public static void calculateAnswers(double numberA,double numberB) {
		
		answers.clear();
		
   		double sum=0;
   		double difference=0;
   		double product=0;
   		double quotient=0;
   		
   		String sumstr="";
   		String diffstr="";
   		String prodstr="";
   		String quostr="";
   		
   		sum=numberA+numberB;
   		difference=numberA-numberB;
   		product=numberA*numberB;
   		
   		if(numberB!=0) {
   			
   		quotient=numberA/numberB;
   		
   		double number = quotient;

		number = Math.round(quotient * 100);
		number = number/100;
		
		quostr = String.format("%.2f", number);
		


   		} else quostr="NULL";
   		
   		sumstr= Integer.toString((int) sum);
   		
		answers.add(sumstr);
		
		
   		diffstr= Integer.toString((int) difference);
		
		answers.add(diffstr);
		
	
   		prodstr= Integer.toString((int)product);
		
		answers.add(prodstr);
		
   		
		answers.add(quostr);
		
    };
    
	public static int[] calculateCorrect(String sum, String diff, String prod, String quo) {
		
		int incorr=0;
		
		int corr=0;
		
		if(answers.get(0).matches(sum)) {corr++;}else incorr++;
		if(answers.get(1).matches(diff)){corr++;}else incorr++;
		if(answers.get(2).matches(prod)){corr++;}else incorr++;
		if(answers.get(3).matches(quo.toUpperCase())){corr++;}else incorr++;
		System.out.println(answers.get(0));
		System.out.println(answers.get(1));
		System.out.println(answers.get(2));
		System.out.println(answers.get(3));
		System.out.println(answers.get(3).toUpperCase());
   		
   		return new int[] {corr,incorr};
    			
    };

		
	};


