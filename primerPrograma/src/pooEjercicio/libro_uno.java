
package pooEjercicio;


import javax.swing.*;
public class libro_uno 
{
    public static void main(String[] args)
    {
        libro miLibro = new libro();
        
        
          miLibro.establece_peso_hojas(Integer.parseInt(JOptionPane.showInputDialog("¿Cuantas hojas tiene el lbiro?")));
        System.out.println(miLibro.establece_peso());
        
                miLibro.dime_pasta(JOptionPane.showInputDialog("Tendra pasta dura? 'si' 'no'"));
       System.out.println(miLibro.pasta());
        
               miLibro.establece_nuevo(JOptionPane.showInputDialog("El libro es nuevo: "));
        System.out.println(miLibro.dime_nuevo());
        
                miLibro.establece_editorial(JOptionPane.showInputDialog("Que editorial es el libro: "));
        System.out.println(miLibro.dime_editorial());
        
        System.out.println("El precio del libro es: " + miLibro.dime_precio());
        
        
    }
}
