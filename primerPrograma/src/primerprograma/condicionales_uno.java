package primerprograma;

import java.util.*;

public class condicionales_uno 
{
    public static void main (String[] args)
    {
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Introduce tu edad");
        
        int edad = entrada.nextInt();
        
        if(edad<=18)
        {
            System.out.print("Eres un adolescente");
        }
        else if(edad<=30)
        {
            System.out.print("Eres un adulto");
        }
        else if(edad<=50)
                {
                    System.out.println("Eres un anciano");
                }
        else
        {
            System.out.print("Ya estas muerto");
        }
       
        
        
    }
}
