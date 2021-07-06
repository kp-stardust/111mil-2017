/**
 *
 * @author K.Villegas
 */
public class Impresora extends Periferico 
{
    private String tImpresion;
    private int ppm;
    private int ppc;

    public Impresora(String tImpresion, int ppm, int ppc, String nombre) 
    {
        super(nombre);
        this.tImpresion = tImpresion;
        this.ppm = ppm;
        this.ppc = ppc;
    }
    
    
    @Override
    public String toString() 
    {
        return "Impresora{" + "tImpresion=" + tImpresion + ", ppm=" + ppm + ", ppc=" + ppc + '}';
    }
    

}    
    
    

