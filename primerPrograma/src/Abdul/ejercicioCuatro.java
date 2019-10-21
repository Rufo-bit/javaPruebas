
package Abdul;

import java.util.*;

/**
 * @author Antonio
 * 4. Crear un programa en java que cree 2 matrices bidimencionales con dimensiones 
 * y datos dados por el usuario, debe realizar la suma e imprimirla
 */
public class ejercicioCuatro 
{
    public static void main (String [] args)
    {
     Scanner entrada = new Scanner(System.in);
     
     //Dimensiones de matrices
     
     System.out.println("De que ancho sera tu matriz 1");
     int anchoUno = entrada.nextInt();
     
     System.out.println("De que largo sera tu matriz 1");
     int largoUno  = entrada.nextInt();
     
     System.out.println("De que ancho sera tu matriz 2");
     int anchoDos = entrada.nextInt();
     
     System.out.println("De que largo sera tu matriz 2");
     int largoDos  = entrada.nextInt();
     
    //Declaracion de matrices
     int matrizUno [][] = new int [anchoUno][largoUno];
     
     int matrizDos [][] = new int [anchoDos][largoDos];
     
     int matrizResultado [][] = new int [anchoUno][largoDos];
     
     
     //Pedir datos de matrices
     
     System.out.println("Matriz Uno");
      for (int i=0; i<=anchoUno-1; i++)
            {
             for (int j=0; j<=largoUno-1; j++){
                 System.out.print("Escribir valor " + i + " , " + j + " : ");
                 matrizUno [i][j]= entrada.nextInt();
                }
            }
      
      System.out.println("Matriz Dos");
       for (int i=0; i<=anchoDos-1; i++)
            {
             for (int j=0; j<=largoDos-1; j++){
                 System.out.print("Escribir valor " + i + " , " + j + " : ");
                 matrizDos [i][j]= entrada.nextInt();
                }
            }
     
    
     //matrizUno
     int filas = matrizUno.length;
     int columnas = matrizUno[0].length;
     
     //Primera matriz
      System.out.println("Primera matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizUno[i][j] + "   ");
            }
            System.out.println("");
        }
        
        //Segunda matriz
     int filasDos = matrizDos.length;
     int columnasDos = matrizDos[0].length;
     
     //Pedir datos de matrizUno
      System.out.println("Primera matriz:");
        for (int i = 0; i < filasDos; i++) {
            for (int j = 0; j < columnasDos; j++) {
                System.out.print(matrizDos[i][j] + "   ");
            }
            System.out.println("");
        }
        
        //Suma
        
         for (int i=0; i<=anchoUno-1; i++){
             for (int j=0; j<=largoUno-1; j++){
                 matrizResultado [i][j]= matrizUno[i][j]+matrizDos[i][j];
                }
            }
        
        
        //Resultado
        
        System.out.println("Matriz resultante de la suma :");
    for (int i=0;i<=anchoUno-1;i++){
            for (int j=0;j<=largoDos-1;j++) {
                System.out.print(matrizResultado[i][j] + " ");
            }
            System.out.println("");
            
        }
             
            
    }
}
