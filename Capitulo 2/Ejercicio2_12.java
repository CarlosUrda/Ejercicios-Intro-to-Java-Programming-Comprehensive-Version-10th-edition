import java.util.*;

/**
 * Ejercicio 12 del Capítulo 2: Calcular la distancia mínima necesitada por
 * un avión para poder despegar a partir de la velocidad de despegue y de la 
 * aceleración del avión, ambos datos leídos por teclado.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_12
{
    public static void main( String args[])
    {
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.print( "Introduce la velocidad: ");
        double velocidad = entrada.nextDouble();
        System.out.print( "Introduce la aceleración: ");
        double aceleracion = entrada.nextDouble();

        double distancia = Math.pow( velocidad, 2) / (2*aceleracion);

        System.out.println( "La distancia necesaria es: " + distancia);
    }
}
