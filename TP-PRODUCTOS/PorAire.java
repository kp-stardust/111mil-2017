
import java.time.LocalDate;
/**
 *
 * @author K.Villegas
 */
public class PorAire extends Congelados 
{
    
    private int nitrogeno;
    private int oxigeno;
    private int dCarbono;
    private int vaporDeAgua;
    
    public PorAire ()
    {
        super ();
        this.nitrogeno = 0;
        this.oxigeno = 0;
        this.dCarbono = 0;
        this.vaporDeAgua = 0;
    }
    
    public PorAire (LocalDate fechaCaducidad, int nroLote, LocalDate fechaEnvasado,
        String paisOrigen, int temperaturaRec, int nitrogeno, int oxigeno,
        int dCarbono, int vaporDeAgua)
    {
        super (fechaCaducidad, nroLote, fechaEnvasado, paisOrigen, temperaturaRec);
        this.nitrogeno = nitrogeno;
        this.oxigeno = oxigeno;
        this.dCarbono = dCarbono;
        this.vaporDeAgua = vaporDeAgua;
    }
    
    public int getNitrogeno ()
    {
        return nitrogeno;
    }
    
    public void setNitrogeno (int nitrogeno)
    {
        this.nitrogeno = nitrogeno;
    }
    
    public int getOxigeno ()
    {
        return oxigeno;
    }
    
    public void setOxigeno (int oxigeno)
    {
        this.oxigeno = oxigeno;
    }
    
    public int getDCarbono ()
    {
        return dCarbono;
    }
    
    public void setDCarbono (int dCarbono)
    {
        this.dCarbono = dCarbono;
    }
    
    public int getVaporDeAgua ()
    {
        return vaporDeAgua;
    }
    
    public void setVaporDeAgua (int vaporDeAgua)
    {
        this.vaporDeAgua = vaporDeAgua;
    }
    
    
    @Override
    public String toString ()
    {
        return "\n Producto congelado por aire: "+"\n Fecha de Caducidad: " + fechaCaducidad + "\n Número de Lote: "+ nroLote
       + "\n Fecha de Envasado: "+ fechaEnvasado + "\n País de origen: " + paisOrigen +
       "\n Temperatura recomendada: "+ temperaturaRec + "\n Porcentaje de nitrógeno: " +
       nitrogeno + "\n Porcentaje de oxigeno: "+ oxigeno + "\n Porcentaje de dióxido de carbono: "
       + dCarbono + "\n Porcentaje de vapor de agua: "+ vaporDeAgua;         
    }
    
    
    
}
