//Pedira n numeros, los sumara y arrojara promedio
package primerprograma;

import java.util.*;
public class tareaDos 
{
public static void main (String[] args)
{
    Scanner entrada = new Scanner(System.in);
    int suma = 0;
    int promedio = 0;
    int numero = 0;
    int i = 0;
    int l= 0;
    int resultado = 0;
    System.out.println("Cuantos números ingresara: ");
    int repeticion = entrada.nextInt();
    
   
    while(i < repeticion)
   {
       i++;
       System.out.println("ingresa el número: ");
        numero = entrada.nextInt();
      
        l=0;
        while(l<repeticion)
        {
            l++;
           //suma = numero + suma;   
        }
        suma = numero + suma; 
    
    }
    promedio = suma;
        resultado = promedio/repeticion;
System.out.println("El resultado de los números es: " + resultado);
}
}