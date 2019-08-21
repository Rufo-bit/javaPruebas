
package primerprograma;

import javax.swing.*;
public class bucles_uno 
{
    public static void main(String[]args)
    {
        
        String clave="Rufino";
        String contra="";
        
        
        while(clave.equals(contra)==false)//Si la clave no es igual a contra entonces
        {
            contra = JOptionPane.showInputDialog("Introduce la contraseña por favor: ");
            
            if(clave.equals(contra)==false)
            {
                System.out.println("Contraseña incorrecta");
            }
        }
        System.out.println("Contraseña correcta, accso permitido");
    }
}
