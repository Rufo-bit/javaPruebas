package primerprograma;
import java.util.*;
import javax.swing.*;
 
public class condicionales_dos 
{
public static void main(String[] args)
{
    Scanner entrada = new Scanner (System.in);
    
    System.out.println("Elige la opción: \n1-Cuadrado \n2-Rectángulo \n3-Triangulo \n4-Circulo");
    
    int figura = entrada.nextInt();
    
    switch (figura)
    {
        case 1: 
        
            int ladoC = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado: "));
            
            System.out.println("El área del cuadrado es: " + Math.pow(ladoC, 2));
            
            break;
            
        case 2:
            
            int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));
            int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));
            
            double resultadoR = base * altura;
            
            System.out.println("El área del rectangulo es: " + resultadoR);            
            break;
            
        case 3:
            base = Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));
            altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));
            
            double resultadoT = (base * altura)/2;
            System.out.println("El área del triangulo es: " + resultadoT);            
            break;
            
        case 4:
            int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio: "));
            
            System.out.println("El área de un circulo es: ");
            System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
            break;
            
            
        
        
    }
          
    
    
}
}
