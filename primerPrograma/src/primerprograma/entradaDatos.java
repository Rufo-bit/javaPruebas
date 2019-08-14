
package primerprograma;

import java.util.Scanner;


public class entradaDatos 
{
public static void main(String[] args)
{
    Scanner entrada=new Scanner(System.in);
    
    System.out.println("Introduce tu nombre: ");
    String usuario = entrada.nextLine();
    
    System.out.println("Introduce tu edad: ");
    int edad = entrada.nextInt();
    
    System.out.println("Hola " + usuario + " Tu tienes " + edad + " años, y el proximo año tendras " + (edad+1));
    
    
    
   

}
}
