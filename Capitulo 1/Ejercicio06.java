
/**
 * Escribir un programa que muestre el resultado de un sumatorio
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio06
{
	public static void main( String args[])
	{
		long resultado = 0;
		
		for (int i = 1; i < 100; i++)
			resultado += i;
		
		System.out.println("El resultado del sumatorio es: " + resultado);
	}
}