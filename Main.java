package Multithreading;

public class Main {

    public static void main(String args[]) {

        Company comp = new Company();

        Producer p = new Producer(comp);
        Consumer c = new Consumer(comp);

        // Start the producer and consumer threads
        p.start();
        c.start();
    }
}
