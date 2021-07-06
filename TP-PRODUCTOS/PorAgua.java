
import java.time.LocalDate;
/**
 *
 * @author K.Villegas
 */
public class PorAgua extends Congelados 
{
    
    private int salPorLitro;
    
    public PorAgua ()
    {
        super ();
        this.salPorLitro = 0;
    }
    
    public PorAgua (LocalDate fechaCaducidad, int nroLote, LocalDate fechaEnvasado,
        String paisOrigen, int temperaturaRec, int salPorLitro)
    {
        super (fechaCaducidad, nroLote, fechaEnvasado, paisOrigen, temperaturaRec);
        this.salPorLitro = salPorLitro;
    }
    
    public int getSalPorLitro ()
    {
        return salPorLitro;
    }
    
    public void setSalPorLitro (int salPorLitro)
    {
        this.salPorLitro = salPorLitro;
    }
    
    
    @Override
    public String toString ()
    {
        return "\n Producto congelado por agua: "+"\n Fecha de caducidad: "+ fechaCaducidad + "\n Número de lote: " + nroLote +
        "\n Fecha de Envasado: "+ fechaEnvasado + "\n País de origen: "+ paisOrigen + 
        "\n Temperatura recomendada: " + temperaturaRec + "\n Gramos de sal por litro de agua: "
        + salPorLitro;         
    }
    
    
}
