import java.util.*;

/**
 * Ejercicio 22 del Capítulo 3: Comprobar si las coordenadas de un punto dado 
 * por el usuario están dentro de un círculo de centro (0,0) y radio 10.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_22
{
    public static void main( String[] args)
    {
        // Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.print( "Introduce las coordenadas X e Y: ");
        double x = entrada.nextDouble();
        double y = entrada.nextDouble();
    
        final double radio = 10;

        double distancia = Math.sqrt( Math.pow( x, 2) + Math.pow( y, 2));

        if (distancia > radio)
            System.out.println( "El punto está fuera");
        else
            System.out.println( "El punto está dentro");

    }
}
 
