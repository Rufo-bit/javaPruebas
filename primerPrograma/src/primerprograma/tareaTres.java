//Usando Do While escribir una app que lea un entero no negativo, y calcule e imprima su factorial
package primerprograma;

import javax.swing.JOptionPane;


public class tareaTres 
{
public static void main (String [] args)
{
    int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero: "));
    int i = numero;  
    int factorial= 1;
    if(numero>0)
      {
          do
          {
            factorial=i*factorial;
            i--;
          }while(i>0);
       
            
      System.out.println("El factorial de tu numero es:" + factorial);
      }
    else 
    {
        System.out.println("Tu numero es negativo, no se puede proceder");
    }
}
    
}
