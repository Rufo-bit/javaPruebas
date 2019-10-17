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
         
         for(int random : array)
        {
            System.out.println("array Uno numero: " + random);
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
          
          for(int ascendente : array)
        {
            System.out.println("array Uno numero: " + ascendente);
        }
         /*Termina orden ascendente*/
         
         /*Empieza orden descendiente*/
         
         for(int i=0; i<array.length -1;i++)
         {
             int max = i;
         
         
            for(int j= 0; j<array.length -1;j++)
            {
                if(array[j] > array[i])
                {
                    max = j; 
                }
            }
         /*Temina orden descendiente*/
          if(i != max)
          {
              int aux = array[i];
                array[i] = array[max];
                array[max] = aux;
          }
         }
         
         for(int descendente : array)
        {
            System.out.println("array Uno numero: " + descendente);
        }
         
    }
}
