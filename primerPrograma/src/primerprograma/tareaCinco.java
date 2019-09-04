/*
Escribir una app que sume los números primos entre 1 y n,
utilizando la intrucción for
 */
package primerprograma;

import java.util.*;
public class tareaCinco 
{
     public static void main(String[] args)
     {
         Scanner entrada = new Scanner (System.in);
         int numero;
         int divisor=2;
         int sumatorio=0;
       
         
          int contador = 0;
         System.out.println("Ingresa un número: "); 
         numero = entrada.nextInt();
      
          
            if(numero % numero ==0)
            {
        for(int i = 1; i <= numero;i++)
        {
           
        for( int x = 1; x <= numero;x++)
        {
                
                if(i % x == 0)
                {
                        contador = contador + 1;
                } 
                if(contador == 2 && x == numero)
                {
                        
                        sumatorio = i + sumatorio;
                        System.out.println(i);
                        
                        
                }
                if(x == numero)
                {
                        contador = 0;
                }
            
        }
        
                
        }
            }
            else
            {
                System.out.println("El numero no es primo");
            }
        
                
                
        System.out.println("La suma total es: "+sumatorio);
        
        }
    } 
     


     
    
