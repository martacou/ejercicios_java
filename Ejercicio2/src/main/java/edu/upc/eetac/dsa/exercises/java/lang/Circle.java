package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Created by Marta_ on 29/09/2015.
 */
public class Circle extends AbstractShape{
    private double radi;

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public Circle(double radi) {
        super("cercle");
        this.radi = radi;
    }

    public double area(){
        return Math.PI * radi * radi;
    }
}
