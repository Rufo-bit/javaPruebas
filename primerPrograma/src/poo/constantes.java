
package poo;

public class constantes 
{
public static void main(String[] args) //Todo programa Java tiene clase principal y comienza con el método main
                                        //el void y main es que no devuelve ningun dato
                                           //el public es para que se pueda acceder fuera de la clase
                                           //stetic es que no actua sobre ningun objeto, el método main se encarga de construir su
                                           //propios objetos
                                           //El main recibe parametros String y un array
{
    Empleados empleadoUno = new Empleados("Paco");
    Empleados empleadoDos = new Empleados("Ana");
    Empleados empleadosTres = new Empleados("Antonio");
    
    empleadoUno.cambioSeccion("RRHH");

    System.out.println(empleadoUno.devuelveDato());
    
   
    
    System.out.println(empleadoDos.devuelveDato());
 
    
    System.out.println(empleadosTres.devuelveDato());
    
    System.out.println(Empleados.dameIdSiguiente());
    
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
    
    public static String dameIdSiguiente()//método estatico, propia de la clase
    {
        return "El ID siguiente es: " + IdSiguiente;//La variable IdSiguiente no tiene problemas con el método por que son estaticos
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