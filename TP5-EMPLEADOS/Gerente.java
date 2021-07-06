
/**
 *
 * @author K.Villegas
 */
public class Gerente extends Empleado 

{
    private String aGerencia;
    private double comision;

    public Gerente(String aGerencia, double comision, String nombre, String tipoDoc, String doc, String direccion, int legajo, int antiguedad, double sueldo) 
    {
        super(nombre, tipoDoc, doc, direccion, legajo, antiguedad, sueldo);
        this.aGerencia = aGerencia;
        this.comision = comision;
    }

    

    @Override
    public String toString() 
    {
        return "Gerente{" + "nombre=" + nombre + ", tipoDoc=" + tipoDoc + ", doc=" + doc + ", direccion=" + direccion 
                + ", legajo=" + legajo + ", antiguedad=" + antiguedad + ", sueldo=" + sueldo + "aGerencia=" + aGerencia 
                + ", comision=" + comision + '}';
    }
    
   @Override
    public double calcularSueldo ()
    {
        return (sueldo * antiguedad + comision);
                
    }         

    
}
