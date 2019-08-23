
package primerprograma;

import java.util.*;
public class bucles_dos 
{
public static void main (String [] args)
{
    int aleatorio = (int)(Math.random()*100);
    Scanner entrada = new Scanner(System.in);
    int numero = 0;
    int intento = 0;
    while (numero !=aleatorio)
    {
        intento ++;
        System.out.println("Introdcue un número por favor");
        
        numero = entrada.nextInt();
        
        if (aleatorio<numero)
        {
            System.out.println("El número es más bajo");
        }
        
        else if(aleatorio>numero)
        {
            System.out.println("El número es más alto");
        }
    }
    System.out.println("Has acertado en " + intento + "intentos" );
}
}
