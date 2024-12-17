package Multithreading;

public class Consumer extends Thread {

    Company c;

    // Constructor to pass the company (shared resource)
    Consumer(Company c) {
        this.c = c;
    }

    public void run() {
        while (true) {
            this.c.consumer_item();  // Consume an item
            try {
                Thread.sleep(1500);  // Simulate work being done
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
