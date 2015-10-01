package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Created by Marta_ on 29/09/2015.
 */
public abstract class AbstractShape implements Shape {
    private String type;

    public AbstractShape(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "I'm a " + type;
    }
}
