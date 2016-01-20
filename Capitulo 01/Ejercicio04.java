
/**
 * Escribir un programa que muestre una tabla con los cuadrados y los cubos de unos números
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio04
{
	public static void main( String args[])
	{
		System.out.println("a\ta^2\ta^3");

		for (int i = 1; i < 10; i++)
		{
			System.out.println(i + "\t" + i*i + "\t" + i*i*i);
		}
	}
}