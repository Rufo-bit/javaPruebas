package Abdul;

/**
 * @author Antonio
 * 5. Escriba un codigo que cree un arreglo de tamaño N y lo llene con
 *  numeros aleatorios, imprimir solo los numeros que son mayores a su indice. 
 */
public class ejercicioCinco 
{
	public static void main(String[] args) 
	{
		
		int aleatorio = (int) (Math.random()*10)+1;
		
		int array[] = new int [aleatorio];
		
		for(int i = 0; i <= array.length-1; i++)
		{
			
				int contador = i;
			
				array[i] = (int) (Math.random()*10)+1;
				
				if(contador == array[i])
				{
					System.out.println("null");//Le agregue un null para identificar el que es repetido
				}
					else
					
					{
						System.out.println(i + " = "+ (array[i])+"   ");
					}
		}	
	}
}
