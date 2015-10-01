package edu.upc.eetac.dsa.exercises.java.lang;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
       /*Como  la clase Class lanza el IOException, todos los métodos que tengan una excepcion no haran nada con ella. De esta manera si
        el main llama a alguno de estos métodos tampoco queremos que trate con las excepciones por lo tanto tambien throws IOException
        Tambien es posible utilizar try y catch para llamar al método y no haria falta el IOException en el main */

        Class escribir = new Class(14, 2.5, 'M');
        escribir.guardar("hola.txt");


        Class leer = Class.leer("hola.txt");
        System.out.println("Integer: " + leer.getEntero() + "\n Decimal: "+leer.getDecimal() +"\n Caracter: " +leer.getCaracter());
        File file = new File("holi.txt");
        file.delete();

    }
}
