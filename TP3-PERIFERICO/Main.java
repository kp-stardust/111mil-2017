/**
 *
 * @author K.Villegas
 * @version 2017
 */
public class Main {

    public static void main(String[] args) 
    {
        
    Periferico perUno = new Periferico ("Teclado");
    perUno.setCosto(150);
    
    System.out.println("Periferico Uno: "+ perUno.toString());
    
    Periferico perDos = new Periferico ("Teclado");    
    perDos.setCosto(100);
    System.out.println ("Periferico Dos: "+ perDos.toString());
    
    
    if (perUno.equals(perDos))
        System.out.println(perUno.getNombre() + " y "+ perDos.getNombre()+ " Son iguales");
     
    
    Periferico perTres = new Periferico ("Monitor");
    perTres.setCosto(500);
    System.out.println(perTres.toString());
    
    if (perUno.equals(perTres))
        System.out.println(perUno.getNombre() + " es igual a " + perTres.getNombre());
    
    
    System.out.println ("La cantidad de instancias es: " + Periferico.getContador());
    
    Impresora imp1 = new Impresora ("Laser", 100, 1000, "Impresora 1");
    Impresora imp2 = new Impresora ("Inyección de tinta", 50, 900, "Impresora 2");
    
    System.out.println (imp1.toString());
    System.out.println (imp2.toString());
    
    Modem mod1 = new Modem (125, TipoMod.Externo, "Modem 1");
    Modem mod2 = new Modem (200, TipoMod.Interno, "Modem 2");
    
    System.out.println("Nombre modem: "+ mod1.getNombre()+". "+ mod1.toString());
    System.out.println("Nombre modem: " +mod2.getNombre()+". "+ mod2.toString());
    
    
    Impresora imp3 = new Impresora ("Laser", 150, 1500, "Impresora Oficina");
    Impresora imp4 = new Impresora ("Laser", 200, 2500, "Impresora Salon");
    
    if (imp3 == imp4)
        System.out.println("Impresora 3 y 4 son iguales");
    
    if (imp3 == imp3)
        System.out.println("Impresora 3 e Impresora 3 son iguales");
    
    
    if (imp3.equals(imp4))
        System.out.println("Impresora 3 y 4 son iguales");
    
    if (imp3.equals(imp3))
        System.out.println("Son iguales");
    
    }
    
}
