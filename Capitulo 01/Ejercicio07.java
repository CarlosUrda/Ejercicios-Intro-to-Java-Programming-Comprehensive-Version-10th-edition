
/**
 * Ejercicio 07 del Capítulo 01.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio07
{
	public static void main( String args[])
	{
		final long maxN 	= 1000000000;
		double resultado 	= 0;
		byte factor 		= 1;
		
		for (int i = 0; i < maxN; i++, factor *= -1)
		{
			resultado += factor * 1.0 / (i*2 + 1);
		}
		
		resultado *= 4;

		System.out.println("El resultado del sumatorio para PI es: " + resultado);
	}
}
