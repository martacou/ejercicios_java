package edu.upc.eetac.dsa.exercises.java.lang;

import java.io.*;

/**
 * Created by Marta_ on 01/10/2015.
 */
public class Class {
    private int entero;
    private double decimal;
    private char caracter;

    public Class(int integer, double decimal, char caracter){
        this.entero = integer;
        this.decimal = decimal;
        this.caracter = caracter;
    }

    public int getEntero() {
        return entero;
    }

    public double getDecimal() {
        return decimal;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setEntero(int entero) {
        this.entero = entero;
    }

    public void setDecimal(double decimal) {
        this.decimal = decimal;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public void guardar (String nombre) throws IOException{
        //este método escribe las variables que teniamos en el fichero y lo cierra.
       //Se utiliza para escribir datos. Se vincula con FileOutputStream que sirve para escribir ficheros
        DataOutputStream out = new DataOutputStream(new FileOutputStream((nombre)));
        out.writeInt(entero);
        out.writeDouble(decimal);
        out.writeChar(caracter);
        out.close();
    }

    public final static Class leer (String nombre) throws IOException{
        DataInputStream in = new DataInputStream(new FileInputStream(nombre));
        int entero = in.readInt();
        double decimal = in.readDouble();
        char caracter = in.readChar();

        return new Class(entero, decimal, caracter);
    }


}
