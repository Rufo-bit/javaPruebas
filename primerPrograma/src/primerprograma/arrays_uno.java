/*
Programa con arrays
Se hara un sistema de calificaciones para alumnos con su calificación
*/
package primerprograma;


public class arrays_uno 
{
    public static void main(String[] args)
    {
        /*int calificaciones [] = new int [5];
        calificaciones[0]=;
        calificaciones[1]=;
        calificaciones[2]=;
        calificaciones[3]=;
        calificaciones[4]=;
        */
        int [] calificaciones={10,9,7,6,4,5};
        
        for (int i = 0; i<calificaciones.length;i++)
        {
            System.out.println("Las califiaciones son " + i + "=" + calificaciones[i]);
            
        }
    }
    
}
