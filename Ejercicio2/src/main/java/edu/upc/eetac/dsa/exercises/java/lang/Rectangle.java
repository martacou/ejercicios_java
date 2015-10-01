package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Created by Marta_ on 29/09/2015.
 */
public class Rectangle extends AbstractShape{
    private int base;
    private int altura;

    public Rectangle(int base, int altura) {
        super("rectangle");
        this.base = base;
        this.altura = altura;
    }
    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }



    public void setBase(int base) {
        this.base = base;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }


    public double area(){
        return base*altura;
    }

}
