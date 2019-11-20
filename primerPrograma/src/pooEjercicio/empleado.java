/*Se crearan empleos con solo un fichero y arrays*/
package pooEjercicio;

import java.util.*;

        class empleado
        {
            private String nombre;
            private double sueldo;
            private Date altaContrato;
            private int edad;
            
            public empleado( String nom, int eda, double sue, int agno, int mes, int dia)
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


