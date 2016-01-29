
/**
 * Ejercicio 11 del Capítulo 01.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio11
{
	public static void main( String args[])
	{
		final double nacimientosPorSeg = 1.0/7.0;
		final double muertesPorSeg = 1.0/13.0;
		final double inmigrantesPorSeg = 1.0/45.0;
		final int annos = 5;
		final long segundosPorAnno = 365*24*60*60;
		long poblacion = 312032486;
		
		System.out.println( "Año 0: " + poblacion);
		for (int i = 0; i < annos; i++)
		{
			poblacion += (segundosPorAnno - muertesPorSeg + inmigrantesPorSeg)*
                         nacimientosPorSeg;
			System.out.println( "Año " + (i+1) + ": " + poblacion);
		}
	}
}
