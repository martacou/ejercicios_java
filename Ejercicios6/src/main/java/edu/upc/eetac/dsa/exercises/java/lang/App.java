package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        Class1 threadClass = new Class1("thread class");
        Thread thread = new Thread(new Class2(), "runnable class");
        threadClass.start();
        thread.start();

        threadClass.join();
        thread.join();

        System.out.println("Finish");
    }
}
