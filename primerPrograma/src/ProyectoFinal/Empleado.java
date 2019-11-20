/*
 Empezando proyecto de Abdul
Se creara un sistema de nomina de Empleados
 */
package ProyectoFinal;

import java.util.*;

class Empleado
{
    //Declarar variables
    
    //cod_empleado
    private String nombre;
    private int edad;
    private char RFC;
    private double sueldo_base;
    private double comision;
    private int dias_laborados;
    private char turno;
    private float horas_laboradas;
    private Date alta_contrato;
    
    public Empleado(String nom, int edad, char RFC, double sueldo_base, int dias_laborados, char turno, float horas_laboradas, int agno, int mes, int dia )
    {
     nombre = nom;
     this.edad = edad;
     this.RFC = RFC;
     this.sueldo_base = sueldo_base;
     this.dias_laborados = dias_laborados;
     this.turno = turno;
     this.horas_laboradas = horas_laboradas;
     this.alta_contrato = alta_contrato;
     
     GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
     
     alta_contrato = calendario.getTime();
     
     
     
    }
    
    //GETTER Y SETTER
    
    //La regla del negocio es que por cada hora extra trabajada se acumulara 150 pesos más al trabajador,
    //Las horas de trabajo seran 7 horas por dias
    //Si trabajan un día extra se pagara 1200
    
    //SETTER
    
    public void Setnombre (String escribe_nombre)
    {
        nombre = escribe_nombre;
    }
    
    //GETTER
    public String Getnombre ()
    {
        return "El nombre del empleado es: " + nombre;
    }
    
    
    //SETTER
    public void SetEdad (int escribe_edad)
            {
       edad = escribe_edad;

            }
    //GETTER
    public String GetEdad()
            {
                return "La edad de: " + edad;
            }
    
    //rfc
    //setter
    public void SetRFC (char escribe_rfc)
    {
        RFC = escribe_rfc;
    }
            
    //getterr
    
    public String getRFC()
    {
        return "RFC : " + RFC;
    }
    
    //setter        
    public void SetSueldoBase (int escribe_sueldo)
    {
        this.sueldo_base = escribe_sueldo;
    }
    
    
    public void SetDias_laborados (int escribe_dias)
    {
    	this.dias_laborados = escribe_dias;
    }
    
    public void SetHoras_laboradas (int escribe_horas)
    {
    	horas_laboradas = escribe_horas;
    }
    
    
    //GETTERS
    public Date GetDameAlta()
    {
    	return alta_contrato;
    }
    
}

