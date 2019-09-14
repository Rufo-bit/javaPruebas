/*
Empiezo a programar en Java
Concepto de clase, objeto y método
Antonio
*/
package poo;
public class Coche
{
    private int ruedas;//Se declaro el modificador de acceso private, la función de esto es     
                       // que no puedes modificar el dato en otra clase, solamente en la clase donde
                       //se origino el dato
   private int largo;
    private int ancho;
   private int motor;
   private int peso_plataforma;
   String color;
   int peso_total;
   boolean asientos_cuero, climatizador;
    
    //Se declara un método constructor
    
    public Coche()//Este constructor se utiliza en uso_coche.java
    {
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;
    }

    //GETTER
    public String dime_largo()//Instrucción getter
    {
      return "El largo del coche es: " + largo; 
    }
    
    //SETTER
    public void establece_color()//Instrucción SETTER
    {
        color ="azul";
    }
    
    public String dime_color()
    {
        return "El color del coche es: " + color;
    }
/* También es valido poner la clase aquí en vez de crear el archivo, pero no se recomienda
    public static void main(String[]args){
    Coche Renault=new Coche();
      System.out.println("Este coche tiene" + Renault.ruedas + "ruedas");
    
    }
    
    */
}
