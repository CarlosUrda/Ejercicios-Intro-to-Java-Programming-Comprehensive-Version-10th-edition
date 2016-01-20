import java.util.*;

/**
 * Ejercicio 02 del Capítulo 4: Calcular la distancia entre dos puntos en una
 * esfera. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_02
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "Introduce la latitud y longitud del punto 1: ");
        double lat1 = Math.toRadians( entrada.nextDouble());
        double lon1 = Math.toRadians( entrada.nextDouble());

        System.out.print( "Introduce la latitud y longitud del punto 2: ");
        double lat2 = Math.toRadians( entrada.nextDouble());
        double lon2 = Math.toRadians( entrada.nextDouble());

        final double radio = 6371.01;   // Radio de la Tierra
        double dist = radio * Math.acos( Math.sin( lat1) * Math.sin( lat2) +
                                         Math.cos( lat1) * Math.cos( lat2) *
                                         Math.cos( lon1 - lon2));
        System.out.printf( "Distancia de los dos puntos es: %.2f km\n", dist); 
    }
}


