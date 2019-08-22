
package primerprograma;

import java.util.*;
import javax.swing.*;
public class ejercicio_dos 
{
public static void main (String[] args)
{
    
    Scanner entrada = new Scanner (System.in);
    Scanner opcion = new Scanner (System.in);
    String clave ="admin123";
    String contra = " ";
    
    while(clave.equals(contra) == false)
            {
                contra = JOptionPane.showInputDialog("Introduce la contraseña correcta: ");
                
                if(clave.equals(contra)==false)
                {
                    System.out.println("Introduce la contraseña correcta: ");
                 
                }
                
            }
    System.out.println("Contraseña correcta: ");
    System.out.println("Bienvenido a la calculadora: Que deseas hacer? 1-Operaciones \n 2-areas ");
    int opciones = opcion.nextInt();
    
    if(opciones == 1)
    {
        
    
    
    
    System.out.println("1- Suma \n 2- Resta \n 3- Multiplicación");
    int operacion = entrada.nextInt();
    
    switch(operacion)
    {
        case 1:
            int a=Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer número: "));
            int b=Integer.parseInt(JOptionPane.showInputDialog("Introduce el segundo número"));
            
            double suma=a + b;
            System.out.println("El resultado de la suma es: " + suma);
            break;
            
        case 2:
            a=Integer.parseInt(JOptionPane.showInputDialog("Introduce el rimer número"));
            b=Integer.parseInt(JOptionPane.showInputDialog("Introduce el rimer número"));
            
            double resta = a-b;
            System.out.println("El resultado de la resta es: " + resta);
            break;
            
        case 3:
            a=Integer.parseInt(JOptionPane.showInputDialog("Introduce el rimer número"));
            b=Integer.parseInt(JOptionPane.showInputDialog("Introduce el rimer número"));
             double multiplicacion = a*b;
            System.out.println("El resultado de la resta es: " + multiplicacion);
            break;
            
            
    }

    }
    else
    {
            System.out.println("Se esta dando mantenimiento, Esperalo pronto. :) ");
            }  
   
    
}

    
}
