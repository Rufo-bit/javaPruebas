package primerprograma;

public class manipulacionDeStrings 
{

	public static void main(String[] args) 
	{
			
			String nombre = "Antonio";
			
			System.out.println("Mi nombre es " + nombre);
			
			//METODO lenght()
			System.out.println("Mi nombre tiene " + nombre.length() + " letras.");

			//METODO charAt
			System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));	
			
			//Hacer que te de la ultima letra de cualquier nombre
			int ultima_letra;
			
			ultima_letra=nombre.length();
			
			System.out.println("Y la ultima letra es la " + nombre.charAt(ultima_letra-1));
			
	
	}

}
