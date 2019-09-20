
package pooEjercicio;


import javax.swing.*;
public class libro_uno 
{
    public static void main(String[] args)
    {
        Libro miLibro = new Libro();
        
        miLibro.dime_hojas(Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas hojas tiene el lbiro?")));
    }
}
