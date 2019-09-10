/*
Antonio
programa para mostrar las ganancias de un puesto de hamburguesas
Las ventas incrementan de Enero a Mayo
De Junio a Agosto se mantienen
De Septiembre a Diciembre suben de nuevo
 */
package primerprograma;

public class array_ejercicioDos 
{
    public static void main(String [] args)
    {
        double [][] ganancias = new double [12][4];
        double acumulador;
        double tasa= 0.10;
        
        for(int i = 0; i<12; i++)
        {
            ganancias[i][0] = 1000;//esta linea corresponde a la primer fila donde todos los valores seran igual a 1000
            acumulador =1000;
           
            if(i == 6 || i==5 || i==7 )//esta linea nos muestra como los meses de Junio, julio y agosto no suben ni bajan las ventas
            {
                for (int n = 0; n<4 ; n++)//esta linea es correspondiente al if
                {
                    ganancias[i][n] = acumulador;
                }
            }
            else//en caso de que no sean los meses de Junio, julio y agosto se procesera a hacer los calculos
            {
            for(int j = 1; j<4; j++)//se empeiza en 1 el for por que en la fila 1 ya tiene el valor 1000
            {
                
                acumulador = acumulador +(tasa * acumulador);//se hace la operadción
                ganancias[i][j] = acumulador;//el acumulador sustituira el valor en cada campo de la matriz
                
            }
            tasa = tasa + 0.10;//Se incrementa la tasa, ya que cada mes suben las ventas hasta un 10%
        }
        }
        
        //Recorre la matriz para mostrar los valores
        for(int c = 0; c<4;c++)//Muestra las columnas
        {
            System.out.println();
          if(c==0)
          {
              System.out.println("Enero    Febrero     Marzo     Abril     Mayo     Junio    Julio    Agosto   Septiembre     Octubre  ");
          }
            for(int f = 0; f<12; f++)//muestra las filas que son los doce meses
            {
                System.out.printf("%1.2f", ganancias[f][c]);
                System.out.print("   ");
            }
            
        }
        
    }
}
