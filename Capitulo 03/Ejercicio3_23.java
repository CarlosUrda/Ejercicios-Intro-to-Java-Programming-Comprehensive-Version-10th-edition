import java.util.*;

/**
 * Ejercicio 23 del Capítulo 3: Comprobar si las coordenadas de un punto dado 
 * por el usuario están dentro de un rectángulo.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_23
{
    public static void main( String[] args)
    {
        // Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.print( "Introduce las coordenadas X e Y del punto: ");
        double puntoX = entrada.nextDouble();
        double puntoY = entrada.nextDouble();

        System.out.print( "Introduce las coordenadas X e Y del centro del " + 
                          "rectángulo: ");
        double centroX = entrada.nextDouble();
        double centroY = entrada.nextDouble();

        System.out.print( "Introduce el ancho y alto del rectángulo: ");
        double ancho = entrada.nextDouble();
        double alto = entrada.nextDouble();

        boolean dentro = puntoX - centroX < ancho / 2 && 
                         puntoY - centroY < alto / 2;

        System.out.printf( "El punto (%.3f,%.3f) " + 
                           (dentro ? "sí" : "no") + " está en el rectángulo " + 
                           "con ancho %.3f y alto %.3f\n", 
                           puntoX, puntoY, ancho, alto);

    }
}
 
