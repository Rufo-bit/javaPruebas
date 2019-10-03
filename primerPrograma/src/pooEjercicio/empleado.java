/*Se crearan empleos con solo un fichero y arrays*/
package pooEjercicio;

import java.util.*;
import javax.swing.*;


public class empleado 
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

        class clase_empleado
        {
            private String nombre;
            private double sueldo;
            private Date altaContrato;
            private int edad;
            
            public clase_empleado( String nom, int eda, double sue, int agno, int mes, int dia)
            {
              nombre = nom;
              edad=eda;
              sueldo = sue;
              
              GregorianCalendar calendario = new GregorianCalendar (agno, mes-1, dia);
              
              altaContrato = calendario.getTime();

            }
            //SETTER
           /* public void estableceNombre(String dameNombre)
            {
                nombre = dameNombre;
            }*/
            //GETTER
            public String dameNombre()
            {
                return nombre;
            }
            
            public int dameEdad()
            {
                return edad;
            }
            
            public double dameSueldo()
            {
                return sueldo;
            }
            
            public Date dameAlta()
            {
                return altaContrato;
            }
            
            //SETTER
            
            
            
            public void subeSueldo(double porcentaje)
            {
                double aumento = sueldo * porcentaje/100;
                sueldo+=aumento;                                      
            }
            
                    

        }

