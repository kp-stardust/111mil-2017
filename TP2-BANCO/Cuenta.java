
/**
 *
 * @author K.Villegas
 * @version 24 de Noviembre de 2017
 */
public class Cuenta 
{
    private String nombreCliente;
    private String nroCuenta;
    private double saldo;
    
    public Cuenta ()
    {
        this.nombreCliente = "";
        this.nroCuenta = "";
        this.saldo = 0;
    }
    
    
    public Cuenta(String nombreCliente, String nroCuenta, double saldo) 
    {
        this.nombreCliente = nombreCliente;
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }

    public String getNombreCliente() 
    {
        return nombreCliente;
    }
    
    public String getNroCuenta() 
    {
        return nroCuenta;
    }
    
    public double getSaldo ()
    {
        return saldo;
    }

    public void setNombreCliente(String nombreCliente) 
    {
        this.nombreCliente = nombreCliente;
    }

    public void setNroCuenta(String nroCuenta) 
    {
        this.nroCuenta = nroCuenta;
    }
    
    public void setSaldo (double saldo)
    {
        this.saldo = saldo;
    }
    
    
    public void depositar (double monto)
    {
        if (monto > 0){
            saldo = saldo + monto;
    }

  
    } 
    
    
}
