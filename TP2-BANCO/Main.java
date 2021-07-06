/**
 *
 * @author K.Villegas
 * @version 24 de Noviembre de 2017
 */
public class Main {

    public static void main(String[] args) 
    {
    
    Cuenta personaUno = new Cuenta ();
    
    personaUno.setNombreCliente("Priscila");
    personaUno.setNroCuenta("31020");
    personaUno.setSaldo(10);
    
    personaUno.depositar(200);
    System.out.println("Nombre persona Uno: " + personaUno.getNombreCliente()
    + ", Saldo: "+ personaUno.getSaldo());
    
    
    Cuenta personaDos = new Cuenta ("Nayla", "1235", 210.50);
    personaDos.depositar(100);
    personaUno.depositar (-200);
    System.out.println ("Saldo persona Dos: "+ personaDos.getSaldo());
    
    
    Cuenta personaTres = new Cuenta ("Sofi", "2569", 500);
    personaTres.depositar(250);
    personaTres.depositar (-500);
    System.out.println("Saldo persona Tres: " + personaTres.getSaldo()+ ", Nro. Cuenta: "
    + personaTres.getNroCuenta());
    
    personaUno.depositar (-200);
  
    
   
   
    }
    
}
