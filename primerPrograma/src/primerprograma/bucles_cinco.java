//Se imprimira el factorial de los numeros
package primerprograma;

import javax.swing.*;

public class bucles_cinco 
{
public static void main(String[] args)
{
    int resultado=1;
    
    String entrada = JOptionPane.showInputDialog("Introduce el número");
    int numero = Integer.parseInt(entrada);
    
    for(int i = numero; i>0; i--)
    
    {
        
        
        
        resultado = i*resultado;
        // 1 * 2 * 3
     
        
    }
    System.out.println("El factorial del número es: " + resultado);
}
}
