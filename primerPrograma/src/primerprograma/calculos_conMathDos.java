package primerprograma;
public class calculos_conMathDos 
{

	public static void main(String[] args) 
	{
			//EJERCICIO 1 math.round()
			String nombre = "Antonio";  
			float num1=2.68F;
			int resultado=Math.round(num1); //Math.round-->redondea el numero
			
			//EJERCICIO 2  refundicion
			double num2 = 5.56;
			int resultadoDos = (int)Math.round(num2);//Refundicion, lo que se hizo en esta linea fue convertir el doble en entero
			
			//EJERCICIO 3 math.pow()
			double base = 5;
			double exponente = 4;
			
			int resultadoTres = (int)Math.pow(base, exponente);
			
			//RESULTADO 1
			System.out.println(nombre + " tiene " + resultado + " pesos ");
			
			//RESULTADO 2
			System.out.println(resultadoDos);
			
			//RESULTADO 3
			System.out.println("El resultado de " + base + " elevado a " + exponente + " da como resultado = " + resultadoTres);
			
	}

}
