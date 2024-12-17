package Multithreading;

public class Producer extends Thread {

    Company c;

    Producer(Company c) {
        this.c = c;
    }


    public void run() {
        int i = 0;
        while (true) {
            this.c.produce_item();  // Produce an item
            try {
                Thread.sleep(1000);  // Simulate work being done
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;
        }
    }
}
