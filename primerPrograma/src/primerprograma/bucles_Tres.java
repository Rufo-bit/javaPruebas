
package primerprograma;
import javax.swing.*;
public class bucles_Tres
{
public static void main (String [] args)
{
    String genero="";//Se pone cadena vacía
    
    
    do
            {
            genero= JOptionPane.showInputDialog("Introduce tu genero (H/M)");//El Do es para que salte una y otra vez hasat introducir algo
            }
    while(genero.equalsIgnoreCase("H") == false && genero.equalsIgnoreCase("M") == false);
    //Si no ponen la letra h o m, regresara al do hasta que pongan una h o m
    
    int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm"));
           if (genero.equalsIgnoreCase("H"))
           {
               int pih = altura-110;
               System.out.println("Tu peso ideal es" + pih);
           }
           else
           {
               int pim = altura-120;
               System.out.println("Tu peso ideal es" + pim);
           }
}
}
