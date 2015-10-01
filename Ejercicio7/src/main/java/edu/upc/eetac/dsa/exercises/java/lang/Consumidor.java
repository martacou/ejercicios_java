package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Created by Marta_ on 01/10/2015.
 */
public class Consumidor implements Runnable {

    private Buffer buffer = null;

    public Consumidor(Buffer buffer) {
        this.buffer = buffer;
    }

    //  @Override
    public void run() {
        StringBuilder sb = new StringBuilder();
        char c;
        while ((c = buffer.get()) != '\n') {
            // Uncomment to log what is reading the thread
            // System.out.println(Thread.currentThread().getName() + " reads " + c);
            sb.append(c);
        }
        System.out.println(sb);
    }
}
