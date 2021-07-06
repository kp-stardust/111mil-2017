
import static jdk.nashorn.internal.runtime.regexp.joni.Syntax.Java;

/**
 *
 * @author K.Villegas
 */
public class Circulo extends Figura 
{

    private double radio;
            
    @Override
    public double calcularArea() 
    {
        return java.lang.Math.PI * this.radio * this.radio;
    }
    
    public Circulo(String nombre, double radio) 
    {
        super(nombre);
        this.radio=radio;
    }

    @Override
    public String toString() 
    {
        return "Circulo{" + "radio=" + radio + '}';
    }
    
}
