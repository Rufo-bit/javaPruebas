
package primerprograma;

//matriz con números aleatorios
public class ejercicio_tres 
{
public static void main(String[] args)
    {
        int aleatorio[]= new int[100];
        
        for(int i = 0; i <100; i++)
        {
            aleatorio[i] = (int)Math.round(Math.random()*100);
        }
        
        for(int numero : aleatorio)
        {
            System.out.println(numero);
        }
    }
}
