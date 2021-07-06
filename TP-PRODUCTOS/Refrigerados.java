
import java.time.LocalDate;
/**
 *
 * @author K.Villegas
 */
public class Refrigerados extends Productos
{
    private String codigo;
    private LocalDate fechaEnvasado;
    private int temperaturaRec;
    private String paisOrigen;
    private static final LocalDate FECHAENV = LocalDate.of (2017,12,01);
    
    public Refrigerados ()
    {
        super ();
        this.codigo = "sin código";
        this.fechaEnvasado = FECHAENV;
        this.temperaturaRec = 0;
        this.paisOrigen = "Sin especificar";
    }
    
    public Refrigerados (LocalDate fechaCaducidad, int nroLote, String codigo, 
            LocalDate fechaEnvasado, int temperaturaRec, String paisOrigen)
    {
        super (fechaCaducidad, nroLote);
        this.codigo = codigo;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaRec = temperaturaRec;
        this.paisOrigen = paisOrigen;    
    }
    
    
    public String getCodigo ()
    {
        return codigo;
    }
    
    public void setCodigo (String codigo)
    {
        this.codigo = codigo;
    }
    
    public LocalDate getFechaEnvasado ()
    {
        return fechaEnvasado;
    }
    
    public void setFechaEnvasado (LocalDate fechaEnvasado)
    {
        this.fechaEnvasado = fechaEnvasado;
    }
    
    public int getTemperaturaRec ()
    {
        return temperaturaRec;
    }
    
    public void setTemperaturaRec (int temperaturaRec)
    {
        this.temperaturaRec = temperaturaRec;
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
        return "\n Producto Refrigerado: "+"\n Fecha de caducidad: "+ fechaCaducidad + 
                "\n Número de Lote: "+ nroLote
                + "\n Código de supervisión: "+ codigo 
                + "\n Fecha de envasado: " + fechaEnvasado
                + "\n Temperatura recomendada: "+ temperaturaRec 
                + "\n País de Origen: " + paisOrigen;
    }
    
    
    
}
