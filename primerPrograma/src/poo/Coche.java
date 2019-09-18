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
   private String color;
   private int peso_total;
   private boolean asientos_cuero, climatizador;
    
    //Se declara un método constructor, se llama igual que la clase, establece un estado incial para el objeto
    
    public Coche()//Este constructor se utiliza en uso_coche.java
    {
        ruedas=4;
        largo=2000;
        ancho=300;
        motor=1600;
        peso_plataforma=500;
    }

    //GETTER
    public String dime_datos_generales()//Instrucción getter
    {
      return "La plataforma del vehículo tiene " + ruedas + " ruedas" + 
              ". Mide" + largo/1000 + " metros con un ancho de " + ancho +
              " centimetros y un peso de plataforma de " + peso_plataforma + 
              " kilos";
    }
    
    //SETTER
    public void establece_color(String color_coche)//Instrucción SETTER
    {
       // color ="azul";
       color = color_coche;//Aqui le asignamos el parametro de color_coche de tipo string a color
    }
    
    public String dime_color()
    {
        return "El color del coche es: " + color;
    }
    
    public void asientos(String asientos_cuero)//SETTER
    {
        //this.asientos_cuero = asientos_cuero;//son iguales, par adiferenciarlos se utliza el operador this
    
        if(asientos_cuero.equalsIgnoreCase("si"))
        {
            this.asientos_cuero=true;
        }
        else
        {
            this.asientos_cuero=false;
        }
         
    }
    
    public String dime_asientos()//GETTER
            {
                if(asientos_cuero==true)//no se utiliza this por que no hay confuisión con el argumento
                {
                    return"El coche tiene asientos de cuero";
                }
                else
                {
                    return"El coche tiene asientos de serie";
                }
                    
            }
    
    public void configura_climatizador(String climatizador)
    {
        if (climatizador.equalsIgnoreCase("si"))
        {
            this.climatizador = true;
        }
        else
        {
            this.climatizador = false;
        }
    }
    
    public String tiene_climatizador()
            {
                if(climatizador==true)
                {
                    return "El coche incorpora climatizador";
                }
                else
                {
                    return"El coche incorpora aire acondicionado";
                }
                                   
            }
    //Se declarara un getter y setter a la vez(no es recomendado este método)
    
    
    public String dime_peso_coche()//Se establece el valor de la variable total
                                    //y se edita también ese valor
    {
        int peso_carroceria = 500;
        peso_total = peso_plataforma + peso_carroceria;//establece
        
        if(asientos_cuero = true)
        {
            peso_total=peso_total+50;
        }
        
        if(climatizador=true)
        {
            peso_total = peso_total+20;
        }
        return "El peso total del coche es: " + peso_total;//devuelve
    }
    
    public int dime_precio()//método getter
    {
        int precio_final = 10000;
        
        if(asientos_cuero=true)
        {
            precio_final+=2000;
        }
        
        if(climatizador=true)
        {
            precio_final+=1500;
        }
        
        return precio_final;
    }
    
    
    
    
    
    
/* También es valido poner la clase aquí en vez de crear el archivo, pero no se recomienda
    public static void main(String[]args){
    Coche Renault=new Coche();
      System.out.println("Este coche tiene" + Renault.ruedas + "ruedas");
    
    }
    
    */
}
