import java.util.*;

/**
 * Ejercicio 15 del Capítulo 2: Calcular la distancia entre dos puntos.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_15
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce las coordenadas x e y del punto 1: ");
        final double x1 = entrada.nextDouble();
        final double y1 = entrada.nextDouble();

        System.out.print( "Introduce las coordenadas x e y del punto 2: ");
        final double x2 = entrada.nextDouble();
        final double y2 = entrada.nextDouble();

        final double distancia = Math.sqrt( Math.pow( x2-x1, 2) + 
                                            Math.pow( y2-y1, 2));
        System.out.printf( "Distancia entre los dos puntos: %.4f\n", distancia);
    }
}
