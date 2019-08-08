
package primerprograma;


public class string_uno 
{
    public static void main(String[] args)
    {
        String nombre="Antonio";
        
        System.out.println("Mi nombre es: " + nombre );
        System.out.println("Mi nombre tiene: " + nombre.length() + " letras" );
        System.out.println("La primer letra de mi nombre es:  " + nombre.charAt(0) );
        
        int x;
        x=nombre.length();
                
        System.out.println("La ultima letra de mi nombre es:  " + nombre.charAt(x-1) );
        
        
        
        
    }
    
}
