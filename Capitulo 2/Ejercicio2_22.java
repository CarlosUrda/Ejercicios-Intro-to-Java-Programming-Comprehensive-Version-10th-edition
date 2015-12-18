import java.util.*;

/**
 * Ejercicio 22 del Capítulo 2: A partir de una cantidad inicial de dólares y
 * centavos desplegar la cantidad de dólares, cuartos de dólar, dimes de dólar,
 * níquel de dólar y peniques. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_22
{
	public static void main( String args[])
	{
        Locale.setDefault( Locale.ENGLISH);
	    Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce cantidad inicial de dólares.centavos: ");
        final double cantidadInicial = entrada.nextDouble();

        final int totalCentavos = (int)(cantidadInicial * 100);
        final int dolares = totalCentavos / 100;
        int cantidadRestante = totalCentavos % 100;
        final int cuartos = cantidadRestante / 25;
        cantidadRestante = cantidadRestante % 25;
        final int dimes = cantidadRestante / 10;
        cantidadRestante = cantidadRestante % 10;
        final int niqueles = cantidadRestante / 5;
        cantidadRestante = cantidadRestante % 5;
        final int peniques = cantidadRestante;

        System.out.println( "Cantidad total");
        System.out.println( "Dólares: " + dolares);
        System.out.println( "Cuartos: " + cuartos);
        System.out.println( "Dimes: " + dimes);
        System.out.println( "Níqueles: " + niqueles);
        System.out.println( "Peniques: " + peniques);
	}
}
