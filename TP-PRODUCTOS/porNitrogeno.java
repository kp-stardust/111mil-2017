
import java.time.LocalDate;
/**
 *
 * @author K.Villegas
 */
public class porNitrogeno extends Congelados
{
    
    private String metodoCongelacion;
    private int tiempoExp;
    
    public porNitrogeno ()
    {
        super ();
        this.metodoCongelacion = "no especificado";
        this.tiempoExp = 0;
    }
    
    public porNitrogeno (LocalDate fechaCaducidad, int nroLote, LocalDate fechaEnvasado,
     String paisOrigen, int temperaturaRec, String metodoCongelacion, int tiempoExp)
    {
        super (fechaCaducidad, nroLote, fechaEnvasado, paisOrigen, temperaturaRec);
        this.metodoCongelacion = metodoCongelacion;
        this.tiempoExp = tiempoExp;
    }
    
    public String getMetodoCongelacion ()
    {
        return metodoCongelacion;
    }
    
    public void setMetodoCongelacion (String metodoCongelacion)
    {
        this.metodoCongelacion = metodoCongelacion;
    }
    
    public int getTiempoExp ()
    {
        return tiempoExp;
    }
    
    public void setTiempoExp (int tiempoExp)
    {
        this.tiempoExp = tiempoExp;
    }
    
    
    @Override
    public String toString ()
    {
        return "\n Producto congelado por nitrógeno: "+"\n Fecha de Caducidad: "+fechaCaducidad + "\n Número de Lote: " + nroLote +
        "\n Fecha de Envasado: " + fechaEnvasado + "\n País de origen: "+ paisOrigen +
        "\n Temperatura recomendada: " + temperaturaRec + "\n Método de congelación: " +
        metodoCongelacion + "\n Tiempo de exposición al nitrógeno en segundos: " +
        tiempoExp;        
    }
    
}
