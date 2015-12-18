import java.util.*;

/**
 * Ejercicio 23 del Capítulo 2: Calcular el coste de recorrer una distancia 
 * en coche a partir de la distancia recorrida, galeones de gasolina consumidos
 * por el coche cada milla y el coste por galeón.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_23
{
	public static void main( String args[])
	{
        Locale.setDefault( Locale.ENGLISH);
	    Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce la distancia a conducir en millas: ");
        final double distancia = entrada.nextDouble();

        System.out.print( "Introduce el precio del galeón de gasolina: $");
        final double precioGaleon = entrada.nextDouble();
                
        System.out.print( "Introduce las millas recorridas por galeón: ");
        final double millasGaleon = entrada.nextDouble();

        final double costeViaje = (distancia / millasGaleon) * precioGaleon;
        System.out.printf( "El coste del viaje es: $%.2f\n", costeViaje);
	}
}
