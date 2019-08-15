
package primerprograma;

import javax.swing.*;

public class entradaDatos_dos 
{

public static void main (String []args)  
{
    String usuario=JOptionPane.showInputDialog("Introduce tu nombre");
    String edad=JOptionPane.showInputDialog("Introduce tu edad");
    
    int edad_usuario=Integer.parseInt(edad);
    
    
    System.out.println("Hola " + usuario + " el proximo año tendras " + (edad_usuario+1) + " años");
}
}
