
package poo;

/*Paso de parametros*/
import javax.swing.*;

public class Uso_cocheDos
{
public static void main (String [] args)
{
        Coche micoche = new Coche();
        
        micoche.establece_color(JOptionPane.showInputDialog("Introduce color: "));//Se pasa un parametro de tipo String
        //micoche.color="rosa";//ESTA ES LA MANER AINCORRECTA, YA QUE NO SE PUEDE ACCEDER 
        
        System.out.println(micoche.dime_datos_generales()); 
        
        System.out.println(micoche.dime_color());
        
        micoche.asientos(JOptionPane.showInputDialog("Tiene asientos de cuero? 'si' 'no' "));
        System.out.println( micoche.dime_asientos());
        
        micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador: 'si' 'no'"));
        System.out.println(micoche.tiene_climatizador());
        
        System.out.println(micoche.dime_peso_coche());
        
        System.out.println("El valor del coche es" + micoche.dime_precio());
}
}
