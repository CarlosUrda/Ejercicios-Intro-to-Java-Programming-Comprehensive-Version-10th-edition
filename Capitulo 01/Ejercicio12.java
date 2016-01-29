
/**
 * Ejercicio 12 del Capítulo 01.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio12
{
	public static void main( String args[])
	{
		final double millas = 24;
		double horas = 1;
		final double minutos = 40;
		final double segundos = 35;
		
		double kms = millas * 1.6;
		horas = horas + minutos/60 + segundos/3600;
		double velocidad = kms / horas;

		System.out.println("Kms: " + kms);
		System.out.println("Horas: " + horas);
		System.out.println("Velocidad: " + velocidad);
	}
}
