
/**
 *
 * @author K.Villegas
 */
public class Rectangulo extends Figura 
{
    
    private double base;
    private double altura;
    
     @Override
    public double calcularArea() 
    {
        return (this.base*this.altura);
    }

    public Rectangulo(String nombre, double base, double altura) 
    {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }


    @Override
    public String toString() 
    {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
}
