package edu.upc.eetac.dsa.exercises.java.lang;

/**
 * Created by Marta_ on 29/09/2015.
 */
public class Tree {
    private int altura;
    private String nombre;

    public Tree() {
        this.altura = 0;
        this.nombre = null;
    }

    public Tree(int altura) {
        this.altura = altura;
    }

    public Tree(String nombre) {
        this.nombre = nombre;
    }
    public Tree(int altura, String nombre){
        this.altura = altura;
        this.nombre = nombre;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Un ");

        if(this.nombre == null)
            sb.append("árbol ");
        else
            sb.append(this.nombre);

        if(this.altura!= 0) {
            sb.append("de ");
            sb.append(this.altura);
            sb.append(" metros");
        }

        return sb.toString();
    }

}
