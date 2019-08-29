//Se identificara el arroba de un correo mediante un for
package primerprograma;

import javax.swing.JOptionPane;


public class bucles_cuatro 
{
public static void main (String[] args)
{
    Boolean arroba = false;
    String correo = JOptionPane.showInputDialog("Introduce tu correo");
    
    for(int i = 0; i <correo.length(); i++)
    {
        if(correo.charAt(i)=='@')
        {
            arroba = true;
        }
    }
        if(arroba== true)
        {
            System.out.println("Tu correo es valido");
        }
        else
        {
            System.out.println("Tu correo le falta arroba, es invalido");
        }
    
    
    System.out.println("Tu correo tiene " + correo.length() + "caracteres");
    
}
}
