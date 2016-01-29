
/**
 * Ejercicio 10 del Capítulo 01.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio10
{
	public static void main( String args[])
	{
		final double kms = 45;
		final double minutos = 45;
		final double segundos = 30;
		
		double millas = kms / 1.6;
		double horas = minutos/60 + segundos/3600;
		double velocidad = millas / horas;

		System.out.println("Millas: " + millas);
		System.out.println("Horas: " + horas);
		System.out.println("Velocidad: " + velocidad);
	}
}
