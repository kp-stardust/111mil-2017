
import java.util.Objects;
/**
 *
 * @author K.Villegas
 */
public class Periferico 
{
    private String nombre;
    private double costo;
    private int garantia;
    private static int contador;
    

    public Periferico(String nombre) 
    {
        this.nombre = nombre;
        this.costo = 0;
        this.garantia = 1;
        contador ++;
    }
    
    
    public String getNombre() 
    {
        return nombre;
    }
    
    public double getCosto ()
    {
        return costo;
    }
    
    public int getGarantia ()
    {
        return garantia;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    public void setCosto (double costo)
    {
        this.costo = costo;
    }
    
    public void setGarantia (int garantia)
    {
        this.garantia = garantia;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Periferico other = (Periferico) obj;
        if (!Objects.equals(this.nombre, other.nombre)) 
        {
            return false;
        }
        return true;
    }

    @Override
    public String toString() 
    {
        return "Periferico{" + "nombre=" + nombre + ", costo=" + costo + ", garantia=" + garantia + '}';
    }
    
    public void incrementarCosto (double valor)
    {
        this.costo = costo + valor;
    }
    
    public void incrementarCosto (float porcentaje)
    {
        this.costo = costo * porcentaje/100;
    }
    
    public static int getContador()
    {
        return contador;
    }
    
    
                   
}
