package primerprograma;

public class Booleanos
{

	public static void main(String[] args) 
	{
		boolean Verdadero = true;
		boolean Falso = false;
		
		String txt="hola Mundo";
		
		System.out.println(Verdadero); 
		System.out.println(Falso); 
		
		System.out.println("La longitud de la cadena es: " + txt.length()); //En esta linea utilizamos el metodo lenght() para traer cuantos caracteres tiene la cadena
		System.out.println(txt.toUpperCase());   // Outputs "HELLO WORLD"
		System.out.println(txt.toLowerCase());   // Outputs "hello world"
	}

}
