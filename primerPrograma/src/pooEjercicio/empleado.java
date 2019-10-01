/*Se crearan empleos con solo un fichero y arrays*/
package pooEjercicio;

import java.util.*;
import javax.swing.*;
public class empleado 
{
public static void main (String[] args)
{
    String nombre;
    int edad;
    double sueldo;
    int agno;
    int mes;
    int dia;
    
    clase_empleado[] empleadosLibreria = new clase_empleado [4];
    
    for (int i = 0; i<3; i++)
    {
        nombre=JOptionPane.showInputDialog("Ingresa nombre: ");
        edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresa edad: "));
        sueldo=Double.parseDouble(JOptionPane.showInputDialog("Ingresa tu sueldo: "));
        agno = Integer.parseInt(JOptionPane.showInputDialog("Ingresa año de alta"));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingresa mes de alta"));
        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingresa día de alta"));
    
        
        for(int j = 0; j<4; i++)
        {
           empleadosLibreria[j] = new clase_empleado(nombre, edad, sueldo, agno, mes, dia); 
        }
    }
   
   
    
}
}



        class clase_empleado
        {
            private String nombre;
            private double sueldo;
            private Date altaContrato;
            private int edad;
            
            public clase_empleado(String nom, int eda, double sue, int agno, int mes, int dia)
            {
              nombre = nom;
              edad=eda;
              sueldo = sue;
              
              GregorianCalendar calendario = new GregorianCalendar (agno, mes-1, dia);
              
              altaContrato = calendario.getTime();

            }

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

