/**
 *
 * @author Keipi
 */
public class Modem extends Periferico 
{   
    private int bps;
    private TipoMod mod;

    public Modem(int bps, TipoMod mod, String nombre) 
    {
        super(nombre);
        this.bps = bps;
        this.mod = mod;
    }

  

    @Override
    public String toString() 
    {
        return "Modem{" + "bps=" + bps + ", mod=" + mod + '}';
    }
    
    
    
}
