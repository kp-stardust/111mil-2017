
import java.time.LocalDate;
/**
 *
 * @author K.Villegas
 */
public class Congelados extends Productos 
{
    
    protected LocalDate fechaEnvasado;
    protected String paisOrigen;
    protected int temperaturaRec;
    private static final LocalDate FECHADEF = LocalDate.of (2017, 12, 01);
    
    
    public Congelados ()
    {
        super ();
        this.fechaEnvasado = FECHADEF;
        this.paisOrigen = "Sin especificar";
        this.temperaturaRec = -2;
    }
    
    public Congelados (LocalDate fechaCaducidad, int nroLote, LocalDate fechaEnvasado,
    String paisOrigen, int temperaturaRec)
    {
        super (fechaCaducidad, nroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaRec = temperaturaRec;
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
    
    public int getTemperaturaRec ()
    {
        return temperaturaRec;
    }
    
    public void setTemperaturaRec (int temperaturaRec)
    {
        this.temperaturaRec = temperaturaRec;
    }
    
    
    @Override
    public String toString ()
    {
        return "Fecha de caducidad: "+ fechaCaducidad + "Número de lote: " + nroLote
        + "Fecha de envasado: "+ fechaEnvasado + "País de Origen: "+ paisOrigen
        + "Temperatura recomendada: "+ temperaturaRec;        
    }
    
    
}
