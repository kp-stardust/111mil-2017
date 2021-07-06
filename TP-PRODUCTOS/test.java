
import java.time.LocalDate;
/**
 *
 * @author K.Villegas
 */
public class test 
{

    public static void main(String[] args) 
    {
    
        
    Frescos pfresco1 = new Frescos (); //con los valores por defecto.
    Frescos pfresco2 = new Frescos (LocalDate.of (2017,12,20), 152, LocalDate.of (2017,12,02), "Colombia");
    
    System.out.println (pfresco1.toString()); //para que me muestre valores por defecto.
    
    System.out.println (pfresco2.toString ());
    
    pfresco1.setFechaCaducidad(LocalDate.of(2017,12,22));
    pfresco1.setNroLote(254);
    pfresco1.setFechaEnvasado(LocalDate.of (2017,12,01));
    pfresco1.setPaisOrigen("China");
    
    System.out.println (pfresco1.toString ()); //para ver los nuevos valores.
    
    Refrigerados ref1 = new Refrigerados ();
    Refrigerados ref2 = new Refrigerados (LocalDate.of(2017,11,14), 1458, "AE1578", LocalDate.of (2017,10,02), 
    -2, "Alemania");
    
    System.out.println (ref1.toString());
    System.out.println(ref2.toString ());
    
    Refrigerados ref3 = new Refrigerados ();
    ref3.setFechaCaducidad(LocalDate.of (2017,10,8));
    ref3.setNroLote(35);
    ref3.setCodigo("EF59845");
    ref3.setFechaEnvasado(LocalDate.of (2017,8,03));
    ref3.setTemperaturaRec(-5);
    ref3.setPaisOrigen("Perú");
    
    System.out.println(ref3.toString());
     
    PorAire congAire1 = new PorAire();
    PorAire congAire2 = new PorAire (LocalDate.of (2017,12,29), 98745, LocalDate.of (2017, 9,2),
    "Italia", -6, 10, 20, 5, 15);
    System.out.println (congAire1.toString());
    System.out.println(congAire2.toString());
    
    
    PorAgua congAgua1 = new PorAgua ();
    PorAgua congAgua2 = new PorAgua (LocalDate.of (2017,12,30), 5984, LocalDate.of (2017, 6, 12),
        "Francia", -10, 100);
    
    congAgua1.setFechaCaducidad(LocalDate.of (2017,9,10));
    congAgua1.setNroLote(369);
    congAgua1.setFechaEnvasado(LocalDate.of(2017,02,05));
    congAgua1.setPaisOrigen("Japón");
    congAgua1.setTemperaturaRec(-15);
    congAgua1.setSalPorLitro(250);
    
    System.out.println(congAgua1.toString());
    System.out.println(congAgua2.toString());
    
    porNitrogeno nitro1 = new porNitrogeno (LocalDate.of(2018, 3, 10), 2487, LocalDate.of(2017,11,2),
     "Indonesia", -13, "Inmersión en nitrógeno líquido", 5);
    
    System.out.println(nitro1.toString());
    
    
    
    }
    
}
