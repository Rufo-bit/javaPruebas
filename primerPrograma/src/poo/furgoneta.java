
package poo;

//Antonio Muñoz
//Esta clase contendras los temas de herencia

public class furgoneta /*subclase*/extends Coche //superclase
{
    private int capacidad_carga;
    private int lugares_extra;

    
    public furgoneta(int lugares_extra, int capacidad_carga)
    {
        super();//la instrucción super llama al construcotr de la clase padre
        this.capacidad_carga=capacidad_carga;
        
        this.lugares_extra=lugares_extra;
    }
    
    //GETTER
    
    public String DimeDatosFurgoneta()
    {
        return "La capacidad de carga es: " + capacidad_carga + 
                " Y tiene: " + lugares_extra + " lugares.";
    }
    
    
}
