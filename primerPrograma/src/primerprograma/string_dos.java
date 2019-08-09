package primerprograma;

public class string_dos 
{
    public static void main(String[] args)
    {
        String frase = "Este es un mensaje de prueba en Java";
        
        String frase_resumen = frase.substring(8, 28) + " para novatos " + frase.substring(29, 36);
        
        System.out.println(frase_resumen);
        
        
    }
    
}
