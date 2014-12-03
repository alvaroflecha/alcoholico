
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // instance variables - replace the example below with your own
    private int cantidadAlcoholSangre;

    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor()
    {
        // initialise instance variables
        this.cantidadAlcoholSangre = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void beberCopa(Cubata nombre)
    {
       cantidadAlcoholSangre = cantidadAlcoholSangre + nombre.getAlcohol();
    }
    
    public int nivelAlcoholSangre()
    {
        return cantidadAlcoholSangre;
    }
}
