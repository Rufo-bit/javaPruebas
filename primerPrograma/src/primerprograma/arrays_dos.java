
package primerprograma;

import javax.swing.*;
public class arrays_dos 
{
    public static void main (String [] args)
    {
        String paises[] = new String[8];
        
        for(int i = 0; i<8; i++)
        {
            paises[i]=JOptionPane.showInputDialog("Introduce un país: " + (i+1));
        }
        
        
        /*paises[0]="México";
        paises[1]="Rusia";
        paises[2]="Australia";
        paises[3]="Inglaterra";
        paises[4]="España";
        paises[5]="Irlanda";
        paises[6]="Amsterdam";
        paises[7]="Canada";*/
        
            //String paises[]={"México", "España", "Rusia", "Inglaterra", "Irlanda", "Canada", "Australia"};
        
        for(String pais : paises)
        {
            System.out.println("País" + pais);
        }
    }
}
