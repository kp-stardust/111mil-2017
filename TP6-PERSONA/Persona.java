
import java.util.Random;

/**
 *
 * @author K.Villegas
 */
public class Persona 
{
    
    Random aleatorio = new Random();

    private final static char SEXODEF = 'H';
    private final static int INFRAPESO = -1;
    private final static int PESOIDEAL = 0;
    private final static int SOBREPESO = 1;
    
    private String nombre;
    private int edad;
    private int dni;
    private char sexo;
    private double peso;
    private double altura;

    public Persona() 
    {
        this.nombre = "";
        this.edad= 0;
        this.dni = generaDni();
        this.sexo = SEXODEF;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, char sexo) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDni();
        this.sexo = sexo;
        this.altura =0;
        this.peso = 0;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) 
    {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDni();
        this.sexo = sexo;
        comprobarSexo();
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public void setEdad(int edad) 
    {
        this.edad = edad;
    }

    public void setSexo(char sexo) 
    {
        this.sexo = sexo;
    }

    public void setPeso(double peso) 
    {
        this.peso = peso;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
    
    
    public int calcularImc () 
    {
        double pesoReal = (this.peso/(this.altura * this.altura));
        if (pesoReal >= 20 && pesoReal <=25)
        {
            return PESOIDEAL;   
        } else if (pesoReal < 20){
            return INFRAPESO;
        } else {
            return SOBREPESO;
        }
    }    
                    
    public boolean esMayorDeEdad () 
    {
        if (edad > 18){  
            return true;
        }else{
            return false;
        }
                 
    }
       
    private void comprobarSexo(){
        if (sexo != 'H' && sexo != 'M')
        {
            this.sexo = SEXODEF;
        }
    }

    @Override
    public String toString() 
    {
        String sexo;
        if (this.sexo == 'H')
        {
            sexo ="hombre";
        }else{
            sexo= "mujer";
        }
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", Dni=" + dni + ", sexo=" + sexo + ", peso=" 
                + peso + ", altura=" + altura + '}';
    }
        
    
    private int generaDni()
    {
        // Producir nuevo int aleatorio entre 0 y 99
        return aleatorio.nextInt(99999999);
    }
}
