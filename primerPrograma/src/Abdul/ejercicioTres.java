package Abdul;

/**
 * @author Antonio
 * 3. Dado un nombre por teclado guardarlo en un array en orden inverso
 */

import java.util.*;
public class ejercicioTres 
{
    public static void main (String[] args)
    {
        Scanner entradaDatos = new Scanner(System.in);
              
            System.out.println("Introduce tu nombre");
       
        String nombre =entradaDatos.nextLine();
        
        char invertir [] = nombre.toCharArray(); //La cadena String la convierte en un array de caracteres
               
        for (int i = nombre.length()-1; i>=0; i--)
        {
            System.out.print("" + invertir[i]);
        }
        
            System.out.println("\n" + nombre);
    }
}
