
import java.util.Objects;

/**
 *
 * @author K.Villegas
 */
public class Empleado {
    String nombre;
    String tipoDoc;
    String doc;
    String direccion;
    int legajo;
    int antiguedad;
    double sueldo;

    public Empleado(String nombre, String tipoDoc, String doc, String direccion, int legajo, int antiguedad, double sueldo) 
    {
        this.nombre = nombre;
        this.tipoDoc = tipoDoc;
        this.doc = doc;
        this.direccion = direccion;
        this.legajo = legajo;
        this.antiguedad = antiguedad;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() 
    {
        return "Empleado{" + "nombre=" + nombre + ", tipoDoc=" + tipoDoc + ", doc=" + doc + ", direccion=" + direccion 
                + ", legajo=" + legajo + ", antiguedad=" + antiguedad + ", sueldo=" + sueldo + '}';
    }

  
    
    
    public double calcularSueldo(){
        return (sueldo * antiguedad);
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (!Objects.equals(this.tipoDoc, other.tipoDoc)) {
            return false;
        }
        if (!Objects.equals(this.doc, other.doc)) {
            return false;
        }
        return true;
    }
    
   
    
    
    
}
