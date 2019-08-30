
package primerprograma;

import java.util.*;
public class tareaUno
{
public static void main (String [] args)
{
    Scanner entrada = new Scanner (System.in);
    int i= 0;
    int j=0;
    int k = 0;
    int l = 0;
    int n = 0;

    System.out.println("Introduce un número por favor:");
    int numero = entrada.nextInt();
    

    
    if (numero >=0 && numero<=20)
    {
    while( i< numero)
        
            {
                i++;
                System.out.print("*");
           
            }
    System.out.println();
    
    //centro

        
    
        
    while(k<(numero-2))
        {
           
            k++;
            System.out.print("-");

            l=0;
               while(l<(numero-2)) 
            {
              
                l++;
                System.out.print(" ");
              
            }              
           
               
               /*for(l=0;l<numero-2;l++)
               {
                   System.out.print(" ");
               }
            */
       System.out.println("+");         
        }
       
   

      
    
        //Fin centro
        
                while (j<numero)              
                {
                    j++;                    
                    System.out.print("*");
                }        
    }
   
    else
    {
        System.out.println("Error");
    }
}
}
