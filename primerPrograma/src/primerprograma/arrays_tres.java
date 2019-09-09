/*
Arrays bidimensionales
Antonio M
 */
package primerprograma;

public class arrays_tres 
{
public static void main (String [] args)
{
    int matrizUno [][] = new int[4][5];
            //Conforme sea la dimension aumentan los corchetes
            
    matrizUno[0][0]=0;
    matrizUno[0][1]=1;
    matrizUno[0][2]=2;
    matrizUno[0][3]=3;
    matrizUno[0][4]=4;

    matrizUno[1][0]=5;
    matrizUno[1][1]=66;
    matrizUno[1][2]=7;
    matrizUno[1][3]=8;
    matrizUno[1][4]=9;
    
    matrizUno[2][0]=10;
    matrizUno[2][1]=11;
    matrizUno[2][2]=12;
    matrizUno[2][3]=13;
    matrizUno[2][4]=14;

    matrizUno[3][0]=15;
    matrizUno[3][1]=16;
    matrizUno[3][2]=17;
    matrizUno[3][3]=18; 
    matrizUno[3][4]=19;
    
   
    
    for (int i = 0; i<4;i++)
   { 
       System.out.println("");
       for(int k = 0; k<5;k++)
       {           
            System.out.print(matrizUno[i][k] + " ");
       }
   }
  
   
            




}
}
