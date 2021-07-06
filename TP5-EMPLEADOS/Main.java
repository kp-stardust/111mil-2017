/**
 *
 * @author K.Villegas
 */
public class Main {

    public static void main(String[] args) 
    {
        
    Empleado empleadoUno = new Empleado ("Pedro", "DNI", "21589654", "Roca 500", 1584, 3, 300);
    System.out.println (empleadoUno.toString());   
    
    Supervisor supervisor1 = new Supervisor ("RRHH", 10, "Juan", "LE", "7458658", "Gales 700", 587, 10, 500);
    System.out.println (supervisor1.toString());
    
    Gerente gerenteUno = new Gerente ("Oficina", 220.50, "Maria", "LC", "15687458","Ecuador 800", 1548, 5, 400);    
    System.out.println (gerenteUno.toString ());    
    
    Empleado empleadoDos = new Empleado ("Ana", "DNI", "21589654", "Colombia 150", 2589, 4, 600);
    Empleado empleadoTres = new Empleado ("Ariel", "DNI", "30258458", "Belgrano 241", 1478, 3, 545);
    
    if (empleadoUno.equals(empleadoDos))
    {
        System.out.println ("Los empleados 1 y  2 son iguales");
    }
     if (empleadoUno.equals(empleadoTres)){
        System.out.println ("Los empleados 1 y 3 son iguales");
    }
    
    System.out.println(empleadoUno.calcularSueldo());
    System.out.println (supervisor1.calcularSueldo());
    System.out.println(gerenteUno.calcularSueldo());
    
    }
    
    
    
}
