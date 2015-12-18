import java.util.*;

/**
 * Ejercicio 16 del Capítulo 2: Calcular el área de un hexágono.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_16
{
	public static void main( String args[])
	{
        Locale.setDefault( Locale.ENGLISH);
	    Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce la longitud del lado del hexágono: ");
        final double lado = entrada.nextDouble();

        final double area = 3*Math.sqrt( 3) / 2 * Math.pow( lado, 2);
        System.out.printf( "Área del hexágono: %.4f\n", area);
	}
}
