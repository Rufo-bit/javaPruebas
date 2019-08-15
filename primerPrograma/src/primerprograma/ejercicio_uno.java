/*
 En este ejercicio se utilizara, numeros, entrada y salida de datos para hacer calculos
 */
package primerprograma;

import javax.swing.*;

public class ejercicio_uno 
{
public static void main(String[] args)
{
    String x = JOptionPane.showInputDialog("Introduce el primer dato: ");
    String y = JOptionPane.showInputDialog("Introduce el Segundo dato: ");
    
    double xUno = Double.parseDouble(x);
    double yUno = Double.parseDouble(y);
    
    double resultado = xUno + yUno;
    
    System.out.printf("%1.2f", resultado);
    System.out.printf("%1.2f", Math.sqrt(resultado));
    
}
}
