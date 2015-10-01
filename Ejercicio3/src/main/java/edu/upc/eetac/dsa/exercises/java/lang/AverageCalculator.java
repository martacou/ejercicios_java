package edu.upc.eetac.dsa.exercises.java.lang;

import sun.security.pkcs.ParsingException;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

import static java.lang.Integer.*;

/**
 * Created by Marta_ on 30/09/2015.
 */
public class AverageCalculator {
    public final static double average(String file) throws ParsingException, BigNumberException {
        //los double para decir que 0 es 0 se pone 0d
        double count = 0d;
        double sum = 0d;


        BufferedReader reader = null;
        try {
            //intenta leer el archivo
            reader = new BufferedReader((new FileReader(file)));
            String line = null; //con esta variable iremos leyendo linea por linea

            //creamos un bucle que va leyendo linea por linea hasta que ya no hya nada
            while ((line = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line); //pasa a integer el valor que lee en la linea
                    if (number > 1000)
                        throw new BigNumberException("Numero mayor de 1000 en la linea" + (++count));
                    sum += number;
                    count++;
                } catch (NumberFormatException e) {
                    throw new ParsingException(e.getMessage());
                }
            }
        } catch (java.io.IOException e) {
            throw new ParsingException(e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.err.println("No se puede cerrar el documento");
            }
        }


        return sum / count;
    }

}

