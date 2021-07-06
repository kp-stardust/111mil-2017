/**
 *
 * @author K.Villegas
 */
public class Triangulo extends Figura
{
    
    private double lado;
    private double base;
    private double altura;

    public Triangulo (String nombre, double lado, double base, double altura)
    {
        super (nombre);
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() 
    {
        return (base*altura)/2;
    }

    @Override
    public String toString() 
    {
        return "Triangulo{" + "lado=" + lado + ", base=" + base + ", altura=" + altura + '}';
    }
    
    
    
    
}
