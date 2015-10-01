package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Created by Marta_ on 01/10/2015.
 */
public class Productor implements Runnable {

    private Buffer buffer = null;
    private String line = null;

    public Productor(Buffer buffer, String line) {
        this.buffer = buffer;
        this.line = line;
    }

   // @Override
    public void run() {
        char chars[] = line.toCharArray();
        for (char c : chars) {
            buffer.put(c);

            // System.out.println(Thread.currentThread().getName() + " writes " + c);
        }
    }
}
