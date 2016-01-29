
/**
 * Ejercicio 13 del Capítulo 01.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio13
{
	public static void main( String args[])
	{
		final double a = 3.4;
		final double b = 50.2;
		final double e = 44.5;
		final double c = 24;
		final double d = 24;
		final double f = 24;
		
		double x = (e*d - b*f) / (a*d - b*c);
		double y = (a*f - e*c) / (a*d - b*c);

		System.out.println("X: " + x);
		System.out.println("Y: " + y);
	}
}
