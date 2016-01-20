import java.util.*;

/**
 * Ejercicio 22 del Capítulo 3: Comprobar si las coordenadas de un punto dado 
 * por el usuario están dentro de un círculo.
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

        System.out.print( "Introduce las coordenadas X e Y del punto: ");
        double puntoX = entrada.nextDouble();
        double puntoY = entrada.nextDouble();

        System.out.print( "Introduce las coordenadas X e Y del centro: ");
        double centroX = entrada.nextDouble();
        double centroY = entrada.nextDouble();

        System.out.print( "Introduce el radio: ");
        double radio = entrada.nextDouble();

        double distancia = Math.sqrt( Math.pow( puntoX - centroX, 2) + 
                                      Math.pow( puntoY - centroY, 2));

        System.out.printf( "El punto (%.3f,%.3f) " + 
                           (distancia > radio ? "no" : "sí") + " está en el" + 
                           " círculo con radio %.3f\n", puntoX, puntoY, radio);

    }
}
 
