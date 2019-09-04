/*
 Imprimir los enteros del 1 al 20 utilizando while y la variable contador i
 La variable i se ha declarado, pero no se ha incializad
    Imprimir solamente 5 centeros por línea(Sugerencia usar calculo i%5. Cuando el valor
    de esta expresión sea 0, imprimir un caracter de nueva línea, de lo contratio,  
    imprima un caracter de tabulación)
 */
package primerprograma;


public class tareaCuatro 
{
    public static void main(String[] args)
    {
        int i=0;
        
        while(i<20)
        {
            i++;
            if(i%5==0)
            {
                System.out.println(" ");
            }
         System.out.print(i);
        }
        
        
               
        
        
    }
}
