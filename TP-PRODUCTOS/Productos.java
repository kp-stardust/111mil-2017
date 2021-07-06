
import java.time.LocalDate;
/**
 *
 * @author K.Villegas
 */
public abstract class Productos 
{ 
    
    protected LocalDate fechaCaducidad;
    protected int nroLote;
    private static final LocalDate FECHADEF = LocalDate.of (2017,12,15);
    
    public Productos ()
    { 
        this.fechaCaducidad = FECHADEF;
        this.nroLote = 00;
    }
    
    public Productos (LocalDate fechaCaducidad, int nroLote)
    {
        this.fechaCaducidad = fechaCaducidad;
        this.nroLote = nroLote;
    }
    
    public LocalDate getFechaCaducidad ()
    {
        return fechaCaducidad;
    }
    
    public void setFechaCaducidad (LocalDate fecha)
    {
        this.fechaCaducidad = fecha;
    }
    
    public int getNroLote ()
    {
        return nroLote;
    }
    
    public void setNroLote (int nro)
    {
        this.nroLote = nro;
    }
    
    @Override
    public String toString ()
    {
        return "Fecha de caducidad: "+ fechaCaducidad + "Nùmero de lote"+ nroLote;
    }
    
    
    
}
