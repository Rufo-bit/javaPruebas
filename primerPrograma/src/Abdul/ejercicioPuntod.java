
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
     
 
            for (int i = 0; i<=Entrada.length()-1;i++)
            {       

            System.out.print("   " + Array[i]);
               
            }
            System.out.println("\n" );
           
           
    }
    
}

/*

public class Main {

    public static void main(String[] args) {
        String[] elementos = "a,b,c".split(",");
        int n = elementos.length;                  //Tipos para escoger
        int r = elementos.length;   //Elementos elegidos
        Perm2(elementos, "", n, r);
    }

    private static void Perm2(String[] elem, String act, int n, int r) {
        if (n == 0) {
            System.out.println(act);
        } else {
            for (int i = 0; i < r; i++) {
                if (!act.contains(elem[i])) { // Controla que no haya repeticiones
                    Perm2(elem, act + elem[i] + ",    ", n - 1, r);
                }
            }
        }
    }

*/