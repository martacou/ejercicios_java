package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws sun.security.pkcs.ParsingException {
        if (args.length != 1){
            System.err.println("El programa necesita el path del archivo");
            System.exit(-1);
        }

        try {

            double average = AverageCalculator.average(args[0]);
            System.out.println("Average =" + average);
        } catch (BigNumberException e){
            e.printStackTrace();
        }
    }
}
