package files;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;


	
public class ReverseThread extends Thread {

    @Override
    public void run() {


    	if(Thread.currentThread().getName().matches("Thread-51")) {
    		currentThread().stop();
    
    	}

    	
        Thread newthread= new ReverseThread();
 
    	newthread.start();
    	
      	System.out.println(Thread.currentThread().getName());



    }

 
    public static void main(String[] args) {
 
    	
    	Thread thread1= new ReverseThread();
    	
    	thread1.start();
 
  
    }
}


