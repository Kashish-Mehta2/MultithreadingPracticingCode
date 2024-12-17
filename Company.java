package Multithreading;

public class Company {
	

	    int n;

	   
	    synchronized public void produce_item() {
	        this.n++;  
	        System.out.println("Produced: " + this.n);
	        notify();  
	    }

	    synchronized public int consumer_item() {
	        while (this.n == 0) {  
	            try {
	                wait();
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        System.out.println("Consumed: " + this.n);
	        return this.n--;  
	    }
	}
