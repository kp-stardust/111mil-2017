
/**
 *
 * @author K.Villegas
 */
public class Supervisor extends Empleado 
{
    private String area;
    private int empleados;
    private static double calc;

    public Supervisor(String area, int empleados, String nombre, String tipoDoc, String doc, String direccion, int legajo, int antiguedad, double sueldo) 
    {
        super(nombre, tipoDoc, doc, direccion, legajo, antiguedad, sueldo);
        this.area = area;
        this.empleados = empleados;
    }
    

    @Override
    public String toString() 
    {
        return "Supervisor{" + "nombre=" + nombre + ", tipoDoc=" + tipoDoc + ", doc=" + doc + ", direccion=" + direccion 
                + ", legajo=" + legajo + ", antiguedad=" + antiguedad + ", sueldo=" + sueldo  + " area=" + area 
                + ", empleados=" + empleados + '}';
    }
    
    
    @Override
  public double calcularSueldo()
  {
      if (empleados <= 10) 
      {
             calc = sueldo*5/100;
        }
        if (empleados >= 11 && empleados <= 20) 
        {
            calc = sueldo*20/100;
        }  
        if (empleados > 20) 
        {
            calc = sueldo*30/100;    
        }
    return (sueldo * antiguedad + calc);  
      
  }  
    
    
    
    
    
}
