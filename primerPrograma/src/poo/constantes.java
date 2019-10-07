
package poo;

public class constantes 
{
public static void main(String[] args)
{
    Empleados empleadoUno = new Empleados("Paco");
    Empleados empleadoDos = new Empleados("Ana");
    Empleados empleadosTres = new Empleados("Antonio");
    
    empleadoUno.cambioSeccion("RRHH");

    System.out.println(empleadoUno.devuelveDato());
    
   
    
    System.out.println(empleadoDos.devuelveDato());
 
    
    System.out.println(empleadosTres.devuelveDato());
    
}
}

class Empleados 
{
    private final String nombre; //con el final no se pueden modificar las variables si ya se le establecio un valor
    private String seccion;
    private int id;//Se declara privado para que se mantenga en esta clase
    
    private static int IdSiguiente=1; //Vairable que se compartira en otros objetos, sera única de la clase
    
    public Empleados (String nom)
    {
        nombre=nom;
        
        seccion="Administracion";
        
        
        id=IdSiguiente;//Le asignamos IdSiguiente que sera el que ira incrementando, sin repetir valor
                        //Aparte garantiza que no se podra modificar el valor en otros objetos
        
        IdSiguiente++;//incrementador
    }
    
    public void cambioSeccion(String seccion)
    {
        this.seccion=seccion;//this.seccion corresponde al campo de clase
                             //private String seccion;
    }

 
    
    public String devuelveDato()
            {
                return  "El nombre es: " + nombre + " y la seccion es: " + seccion + " con id: " + id;
            }
}