
package Abdul;
/*
Autor: Antonio M.
Primer programa para el punto etra
Imprimir un arreglo de tamaño n, que devuelva como valor
el numero y ver si es multiplo o no de su indice*/


import java.util.*;
import javax.swing.JOptionPane;
public class ejercicioPuntou 
{
    public static void main(String[] args)
    {
        int Entrada;
        
        System.out.println("Hola");
        System.out.println("Introduce el tamaño del arreglo");
        Scanner entrada = new Scanner(System.in);
        Entrada = entrada.nextInt();
        
        int Array [] = new int[Entrada];
        
        for(int j = 0; j<Entrada; j++)
        {
                Array[j] = Integer.parseInt(JOptionPane.showInputDialog("Introduce los numeros del array: " + j  ));               
                 System.out.println("indice" + j + "=" + Array[j]); 
        }
        
           for(int i = 1; i<Entrada; i++)
               {
                   
                   
                   
                    if(Array[i]%i==0 || i==Array[i])
                    {
                        System.out.println(Array[i] + "     Es multiplo de su indice");
                    }

                    else
                    
                        System.out.println();
                    
                }
        
        
        
        
    }
}
