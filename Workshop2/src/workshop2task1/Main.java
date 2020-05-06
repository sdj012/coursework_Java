package workshop2task1;

public class Main {

	public static void main(String[] args) {
	
	System.out.println("Task 1 \n");
	
	MyDate today=new MyDate();
	
	System.out.println("Today is " + today.toString());
	
	MyDate sample1=new MyDate(561555550000L);
	
	MyDate sample2=new MyDate(34355555133101L);

	System.out.println(sample2.elapsedTime+" milliseconds from 1970-01-01 is " + sample1.toString());
	
	System.out.println(sample1.elapsedTime+" milliseconds from 1970-01-01 is " +sample2.toString());
	
	System.out.println("\n");
	
	}

}

