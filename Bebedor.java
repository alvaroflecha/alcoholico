
/**
 * Write a description of class Bebedor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bebedor
{
    // instance variables - replace the example below with your own
    private String nombreBebedor;
    
    private int cantidadAlcoholSangre;
    
    private int nivelMaximo;
    
    private String pregunta;

    /**
     * Constructor for objects of class Bebedor
     */
    public Bebedor(String nombreBebedor)
    {
        // initialise instance variables
        this.nombreBebedor = nombreBebedor;
        this.cantidadAlcoholSangre = 0;
        this.nivelMaximo = 100;
        this.pregunta = null;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void beberCopa(Cubata nombre)
    {
       int cantidadAlcohol = cantidadAlcoholSangre + nombre.getAlcohol();
       if(cantidadAlcohol > nivelMaximo)
       {
            System.out.print("No puedo beber más, gracias");
           
       }
       else
       {
           cantidadAlcoholSangre = cantidadAlcohol ;
       }
    }
    
    public int nivelAlcoholSangre()
    {
        return cantidadAlcoholSangre;
    }
    
    public void responderPreguntas(String pregunta)
    {
        if(cantidadAlcoholSangre > nivelMaximo || pregunta.contains(nombreBebedor))
        {
            System.out.println(pregunta.toUpperCase()+ "!!!!!!!!!");
        }
        else
        {
            int caracteres = pregunta.length();
            if(caracteres % 2 == 0)
            {
                System.out.println("Si");
            }
            else
            {
                System.out.println("No");
            }
        }
    }
}
