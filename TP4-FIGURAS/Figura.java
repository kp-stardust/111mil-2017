/**
 *
 * @author K.Villegas
 */
public abstract class Figura 
{
    
    private String nombre;

    public Figura(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
   
    
    @Override
    public String toString() 
    {
        return "Figura{" + "nombre=" + nombre + '}';
    }
    
    
}
