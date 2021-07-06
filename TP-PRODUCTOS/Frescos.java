
import java.time.LocalDate;
/**
 *
 * @author K.Villegas
 */
public class Frescos extends Productos 
{
    
    private LocalDate fechaEnvasado;
    private String paisOrigen;
    private static final LocalDate FECHAEDEF = LocalDate.of (2017,12,02);
    
    public Frescos ()
    {
        super ();
        this.fechaEnvasado = FECHAEDEF;
        this.paisOrigen = "No especificado";
    }
    
    public Frescos (LocalDate fechaCaducidad, int nroLote, LocalDate fechaEnvasado, String paisOrigen)
    {
        super (fechaCaducidad, nroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }
    
    public LocalDate getFechaEnvasado ()
    {
        return fechaEnvasado;
    }
    
    public void setFechaEnvasado (LocalDate fechaEnvasado)
    {
        this.fechaEnvasado = fechaEnvasado;
    }
    
    public String getPaisOrigen ()
    {
        return paisOrigen;
    }
    
    public void setPaisOrigen (String paisOrigen)
    {
        this.paisOrigen = paisOrigen;
    }
    
    
    @Override
    public String toString ()
    {
        return "\n Producto Fresco:"+ "\n Fecha de caducidad: "+ fechaCaducidad + "\n Número de Lote: "+ nroLote
        + "\n Fecha de envasado: "+ fechaEnvasado + "\n País de origen: "+ paisOrigen;        
    }
    
    
    
}
