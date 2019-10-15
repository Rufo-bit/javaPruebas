
package Abdul;

/**
 @author Antonio
 * Dado un array de números de 'N' posiciones con valores {1,2,3,4,5}, 
 * guardar los valores de este array en otro array distinto pero con los valores invertidos, 
 * es decir, que el segundo array debera tener los valores {5,4,3,2,1}.
 */
public class ejercicioUno 
{
    public static void main (String [] args)
    {  
        
        int[] numeros= {1,2,3,4,5};
        
        int[] numerosInvertidos=new int[numeros.length];
        
        
        for(int i=(numeros.length-1),j=0;i>=0;i--,j++)
        {
           numerosInvertidos[j]=numeros[i];
           
           System.out.print(numerosInvertidos[j]);
        }
        
        
        

    }
}
