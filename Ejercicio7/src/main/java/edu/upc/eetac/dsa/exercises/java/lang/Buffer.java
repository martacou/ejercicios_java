package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Created by Marta_ on 01/10/2015.
 */
public class Buffer {

    private char[] buffer;
    private final static int size = 32;
    private int cabeza;
    private int cola;
    public Buffer() {
        buffer = new char[size];
        this.cabeza= 0;
        this.cola = 0;
    }

    public synchronized char get() {
        while (isEmpty())
            try {
                wait();
            } catch (InterruptedException e) {
            }
        char c = buffer[cabeza++];
        if (cabeza == buffer.length) {
            cabeza = 0;
        }

        notifyAll();
        return c;
    }

    public synchronized void put(char c) {
        while (isFull())
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        buffer[cola++] = c;
        if (cola == buffer.length) {
            cola = 0;
        }
        notifyAll();
    }

    private boolean isEmpty() {
        return cabeza == cola;
    }

    private boolean isFull() {
        if (cola + 1 == cabeza) {
            return true;
        }
        if (cola == (buffer.length - 1) && cabeza == 0) {
            return true;
        }
        return false;
    }


}
