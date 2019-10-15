package Abdul;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 * @author Antonio
 * 2. Dado un array de números de 'N' posiciones ordenar sus valores 
 * en orden ascendente y descendente en otros dos arrays 
 */
public class ejercicioDos
{
    public static void main(String [] args)
    {
        Scanner entrada=new Scanner(System.in);
        System.out.println ("Por favor introduzca cuantos numeros ingreara");     
         int numeros = entrada.nextInt();
         
         int [] array = new int[numeros];
           
         /*Orden normal*/
         
         for(int i=0; i<numeros; i++)
         {
             array[i]=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: " + (i+1)));
     
         }
         
         for(int ascendente : array)
        {
            System.out.println("array Uno numero: " + ascendente);
        }
         
         /*Termina orden normal*/
         
         /*Orden ascendente*/
          for (int i = 0 ; i < array.length - 1 ; i++) {
            int min = i;
 
            //buscamos el menor número
            for (int j = i + 1 ; j < array.length ; j++) {
                if (array[j] < array[min]) {
                    min = j;    //encontramos el menor número
                }
            }
 
            if (i != min) {
                //permutamos los valores
                int aux = array[i];
                array[i] = array[min];
                array[min] = aux;
            }
        }
         /*Termina orden ascendente*/
         
            
       
    }
}
