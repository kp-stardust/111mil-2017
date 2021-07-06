
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author K.Villegas
 */
public class Main {

    public static void main(String[] args) 
    {
        
      List<Figura> listaFiguras = new ArrayList <Figura>();
      
      Triangulo tri1 = new Triangulo ("Triangulo1",15,30,26);
      
      listaFiguras.add(tri1);
      
      Rectangulo rec1 = new Rectangulo ("Rectángulo 1", 30, 25);
      
      listaFiguras.add(rec1);
      
      Circulo circulo1 = new Circulo ("Círculo 1", 60);
      
      listaFiguras.add(circulo1);
      
      Cuadrado cuadrado1 = new Cuadrado ("Cuadrado 1", 120);
      
      Triangulo tri2 = new Triangulo ("Triangulo 2", 25, 36, 50);
      
      listaFiguras.add(cuadrado1);
      
      listaFiguras.add(tri2);
      
      
      System.out.println(listaFiguras.size());
      
      System.out.println(listaFiguras.get(0).calcularArea());
      
      listaFiguras.remove(tri2);
      
      System.out.println(listaFiguras.size());
      
        for (Figura listaFigura : listaFiguras) 
        {
            System.out.println(listaFigura.calcularArea());
        }
       
        
        
    }
    
    
}
