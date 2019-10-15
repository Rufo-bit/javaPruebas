
package pooEjercicio;

import javax.swing.JOptionPane;

/**
 * @author Antonio
 * En esta clase nos arrjoara los datos de los empleados
 */
public class nomina 

{
    public static void main (String[] args)
{
    
   // clase_empleado empleados = new clase_empleado();
    String nombre;
    int edad;
    double sueldo;
    int agno;
    int mes;
    int dia;
    int numEm;
    
    numEm = Integer.parseInt(JOptionPane.showInputDialog("Cuantos empleados ingresaras: "));
    clase_empleado[] empleadosLibreria = new clase_empleado [numEm];
   
    
    for (int i = 0; i<numEm; i++)
    {
       // empleados.dameNombre(JOptionPane.showInputDialog("Ingresa nombre: "));
  
        nombre =  JOptionPane.showInputDialog("ingresa nombre: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Ingresa edad: "));
        sueldo = Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu sueldo: "));
        agno=Integer.parseInt(JOptionPane.showInputDialog("Ingresa año de alta"));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Ingresa mes de alta"));
        dia=Integer.parseInt(JOptionPane.showInputDialog("Ingresa día de alta"));
        
        
        empleadosLibreria[i] = new clase_empleado(nombre, edad, sueldo, agno, mes, dia); 
        
        /*for(int j = 0; j<3; i++)
        {
           empleadosLibreria[j] = new clase_empleado(nombre, edad, sueldo, agno, mes, dia); 
        }*/
   
        /*for(clase_empleado z:empleadosLibreria)
        {
       System.out.println(nombre + edad +  sueldo + agno + mes + dia);
        }
    */
    }
        for (int k=0;k<numEm;k++)
        {
            System.out.println("Nombre: " + empleadosLibreria[k].dameNombre() + " edad: " + 
                    empleadosLibreria[k].dameEdad() +   " Sueldo: "  + 
                    empleadosLibreria[k].dameSueldo() + " Fecha alta: " + empleadosLibreria[k].dameAlta());
        }
  
    
    
}
    
}
