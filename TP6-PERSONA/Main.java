
/**
 *
 * @author K.Villegas
 */
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ingresar nombre");
        String nombre = sc.nextLine();
        
        System.out.println ("Ingresar edad");
        int edad = sc.nextInt();
        
        System.out.println("Ingrese su sexo");
        char sexo = sc.next().charAt(0);
        
        System.out.println ("Ingrese su peso");
        double peso = sc.nextDouble();
        
        System.out.println("Ingrese altura");
        double altura = sc.nextDouble();
        
        
        Persona personaUno = new Persona (nombre, edad, sexo, peso, altura);
        Persona personaDos = new Persona (nombre, edad, sexo);
        Persona personaTres = new Persona ();
        
        personaDos.setPeso (60.00);
        personaDos.setAltura(1.65);
        
        personaTres.setNombre("Sofía");
        personaTres.setEdad(25);
        personaTres.setSexo('M');
        personaTres.setPeso(59.25);
        personaTres.setAltura(1.70);
        
        
        System.out.println("Persona Uno: ");
        System.out.println(personaUno.toString());
        mensajeImc(personaUno);
        mensajeEdad (personaUno);
        
        
        
        
        System.out.println("Persona Dos: ");
        System.out.println(personaDos.toString());
        mensajeImc(personaDos);
        mensajeEdad (personaDos);
        
        
        
        System.out.println("Persona Tres: ");
        System.out.println(personaTres.toString());
        mensajeImc(personaTres);
        mensajeEdad (personaTres);
        
     
    }
        public static void mensajeImc (Persona p)
        {
            int imc = p.calcularImc();
        
        switch (imc) 
        {
            case -1:
                System.out.println("Tiene infrapeso");
                break;
            case 0:
                System.out.println("Peso Ideal");
                break;
            default:
                System.out.println ("Tiene sobrepeso");
                break;
        }
     }   
        
        public static void mensajeEdad (Persona p)
        {
            if (p.esMayorDeEdad())
            {
            System.out.println("Es mayor de edad");
        }else{
            System.out.println("Es menor de edad");
        }
     }
        
        
        
}
        
        
        
    
    
    
    
    

