/**
 *
 * @author K.Villegas
 */
public class Cuadrado extends Figura 
{

   private final double lado;
  

    public Cuadrado(String nombre, double lado) 
    {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public String toString() 
    {
        return "Cuadrado{" + "lado=" + lado + '}';
    }

    @Override
    public double calcularArea() 
    {
        return (this.lado * this.lado);
    }

    
    }

 
   
    
    
    

