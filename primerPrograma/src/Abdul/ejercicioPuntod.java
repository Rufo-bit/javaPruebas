
package Abdul;

/*
Autor: Antonio M.
Segundo programa para el punto etra

en este programa, debemos crear todas las permutaciones de una cadena de entrada y eliminar duplicados, 
si están presentes. Esto significa que debe barajar todas las letras de la entrada en el orden posible*/

import java.util.*;
public class ejercicioPuntod 
{
    public static void main (String [] args)
    {
        String Entrada;
        Scanner entrada = new Scanner(System.in); 
        
        System.out.println("Introduce la cadena a permutar");
        Entrada = entrada.nextLine();
        
        char Array[] = Entrada.toCharArray();
        
        for(int j = 0; j < Array.length; j++)
        {
         for (int i = Entrada.length()-1; i>=0; i--)
        {
            int min = i;
 
            //buscamos el menor número
            for (int k = i + 1 ; k < Array.length ; k++) {
                if (Array[k] < Array[min]) {
                    min = k;    //encontramos el menor número
                }
            }
 
            if (i != min) {
                //permutamos los valores
                char aux = Array[i];
                Array[i] = Array[min];
                Array[min] = char aux;
            
            System.out.print("" + Array[i]);
            
            
        }
            System.out.println("\n" );
        }
           
    }
    
}
