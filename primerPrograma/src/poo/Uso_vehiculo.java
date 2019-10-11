
package poo;

/*Paso de parametros*/
//import javax.swing.*;
//
//public class Uso_vehiculo
//{
//public static void main (String [] args)
//{
//        Coche micoche = new Coche();
//        
//        micoche.establece_color(JOptionPane.showInputDialog("Introduce color: "));//Se pasa un parametro de tipo String
//        //micoche.color="rosa";//ESTA ES LA MANER AINCORRECTA, YA QUE NO SE PUEDE ACCEDER 
//        
//        System.out.println(micoche.dime_datos_generales()); 
//        
//        System.out.println(micoche.dime_color());
//        
//        micoche.asientos(JOptionPane.showInputDialog("Tiene asientos de cuero? 'si' 'no' "));
//        System.out.println( micoche.dime_asientos());
//        
//        micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador: 'si' 'no'"));
//        System.out.println(micoche.tiene_climatizador());
//        
//        System.out.println(micoche.dime_peso_coche());
//        
//        System.out.println("El valor del coche es" + micoche.dime_precio());
//}
//}

public class Uso_vehiculo
{
    public static void main (String[] args)
    {
        Coche micoche1 = new Coche();
        
        micoche1.establece_color("Rojo");
        
        furgoneta miFurgoneta1 = new furgoneta(7 ,580); //Objeto con herencia
        
        miFurgoneta1.establece_color("Azul");
        
        miFurgoneta1.asientos("Si");
        
        miFurgoneta1.configura_climatizador("Si");
        
        System.out.println(micoche1.dime_datos_generales() + micoche1.dime_color());
    
        System.out.println(miFurgoneta1.dime_datos_generales() + miFurgoneta1.DimeDatosFurgoneta());
    }
}
