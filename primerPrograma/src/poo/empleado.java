/*
Se creara al objeto empleado de una empresa la cual vendera el coche
Tendra los atributos de nombre, sueldo, fecha alta, subir sueldo(método)
Todo esto se hara cn un unico fichero fuente
Todo se desarrolara en la clase principal
Antonio
*/
//PRIMER CODIGO
/*
package poo;

import java.util.*;

public class empleado 
{
    public static void main(String[] args)
    {
        //Se instancia 
        clase_empleado empleado1 = new clase_empleado("Antonio Muñoz", 85000, 2005, 12, 17);
        clase_empleado empleado2 = new clase_empleado("Fabian Muñoz", 90000, 2008, 9, 12);    
        clase_empleado empleado3 = new clase_empleado("Victor Muñoz", 100000, 2010, 11, 27);
        
        
        empleado1.subeSueldo(5);
        empleado2.subeSueldo(5);
        empleado3.subeSueldo(5);
                   
        System.out.println("nombre: " + empleado1.dameNombre() + " tu sueldo es: " + empleado1.dameSueldo()
        + " fecha de alta: " + empleado1.dameAlta());
    
         System.out.println("nombre: " + empleado2.dameNombre() + " tu sueldo es: " + empleado2.dameSueldo()
        + " fecha de alta: " + empleado2.dameAlta());
         
          System.out.println("nombre: " + empleado3.dameNombre() + " tu sueldo es: " + empleado3.dameSueldo()
        + " fecha de alta: " + empleado3.dameAlta());
    
    }
}
    //clase
class clase_empleado
{
    //método contructor que recibira argumentos
    public clase_empleado(String nom, double sue, int agno, int mes, int dia)
            {
                nombre = nom;
                sueldo = sue;
                
                //GregorianCalendar -->Clase para modificar fecha
                
                GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
            
                altaContrato=calendario.getTime(); //El get llama los metodos de la clase GregorianCalendar
            
            }
    
    public String dameNombre()//GETTER
    {
        return nombre;
    }
    
    public double dameSueldo()//getter
    {
        return sueldo;
    }
    
    public Date dameAlta()//GETTER
    {
        return altaContrato;
    }
    
    public void subeSueldo(double porcentaje)//SETTER
    {
        double aumento = sueldo * porcentaje/100;
        sueldo+=aumento;
    }

//Declarar variables de clase, pero ahora seran al final
    private String nombre;
    private double sueldo;
    private Date altaContrato;//Este es Date por que getTiem() devulve valores Date
  
}
    
*/

//Segundo código

package poo;

import java.util.*;

public class empleado 
{
    public static void main(String[] args)
    {
        jefatura jefe_RRHH= new jefatura("Jorge Alvarado", 200000, 2019, 11, 2);
        jefe_RRHH.estableceIncentivo(50);
        
        
        clase_empleado[] misEmpleados = new clase_empleado[6];
        
        misEmpleados[0] = new clase_empleado("Antonio Muñoz", 85000, 2005, 12, 3);
        misEmpleados[1] = new clase_empleado("Fabian Muñoz", 95000, 2009, 6, 2);
        misEmpleados[2] = new clase_empleado("Victor Muñoz", 100000, 20015, 11, 5);
        misEmpleados[3] = new clase_empleado(" José Antonio"); //Llamara al segundo contructor por tener un argumento
        misEmpleados[4]= jefe_RRHH; //principio de sustitución, esto es un claro de polimorfismo
        misEmpleados[5]= new jefatura("María", 9500, 1999,5,25);
        
        //refundicion o casting de objeto empleado a objeto jefatura
        jefatura jefaFinanzas = (jefatura) misEmpleados[5];
        jefaFinanzas.estableceIncentivo(5000);
        
        
        /*for(int i=0; i<3; i++)
        {
            misEmpleados[i].subeSueldo(5);
        }*/
    
        for(clase_empleado e: misEmpleados)
        {
            e.subeSueldo(5);
        }
        
        
        for (int i=0;i<6;i++)
        {
            System.out.println("Nombre: " + misEmpleados[i].dameNombre() + " Sueldo: " + 
                    misEmpleados[i].dameSueldo()/*Aquí vemos que la clase toma el metodo dependiendo si es empleado o jefatura*/
                    + " Fecha alta: " + misEmpleados[i].dameAlta());
        }
    }
}
    //clase
class clase_empleado
{
    //método contructor qffue recibira argumentos
    public clase_empleado(String nom, double sue, int agno, int mes, int dia) //un constructor no lleva void y no devuelve datos
            {
                nombre = nom;
                sueldo = sue;
                
                //GregorianCalendar -->Clase para modificar fecha
                
                GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
            
                altaContrato=calendario.getTime(); //El get llama los metodos de la clase GregorianCalendar
            
            }
    
    
     //Sobrecarga de constructores
    //Es cuando quieres utilizar varios constructores dentro de una misma clase
    //deben tener direntes tipos de argumentos para no generar confusion en el compilador
    
    
    public clase_empleado(String nom) //Segundo Constructor
    {
        this(nom, 30000, 2000, 01, 01);//El this dentro de un constructor, llama al otro constructor de la otra que coincida 
                                        //con sus parametros correspondientes
        
    
    }
    
    
    
    public String dameNombre()//GETTER
    {
        return nombre;
    }
    
    public /*final*/double dameSueldo()//getter  //Si se le pone final, ningun otra clase puede utilizar
                                                    //el método
    {
        return sueldo;
    }
    
    public Date dameAlta()//GETTER
    {
        return altaContrato;
    }
    
    public void subeSueldo(double porcentaje)//SETTER
    {
        double aumento = sueldo * porcentaje/100;
        sueldo+=aumento;
    }

//Declarar variables de clase, pero ahora seran al final
    private String nombre;
    private double sueldo;
    private Date altaContrato;//Este es Date por que getTiem() devulve valores Date
  
}
    
    

/*final*/ class jefatura extends clase_empleado //Con este final evita que se sigan heredando otras clases
{
    public jefatura(String nom, double sue, int agno, int mes, int dia)
    {
        super(nom, sue, agno, mes, dia);
    }

    public void estableceIncentivo(double b)//GETTER
    {
        incentivo = b;
    }
    
    
    //Con este método anulamos el metodo Dame Sueldo de la claseEmpleado, esto para evitar conflictos
    //Se sobrescrive el dameSueldo de clase_empleado
    public double dameSueldo()
    {
        double sueldoJefe = super.dameSueldo();//Llamamos al metodo de la calse padre, no llamara al metodo
                                                //de jefatura si no a l de clase_empleado
        return sueldoJefe + incentivo;
    }
    private double incentivo;
    
  
}

