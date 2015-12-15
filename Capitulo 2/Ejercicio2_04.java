import java.util.*;

/**
 * Ejercicio 4 del Capítulo 2: Convertir una cantidad de libras leídas como 
 * entrada a kilogramos
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_04
{
    public static void main( String args[])
    {
        System.out.print( "Introduce la cantidad de libras: ");
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        double libras = entrada.nextDouble();
        double kilogramos = libras * 0.454;

        System.out.println( "Kilogramos: " + kilogramos);

    }
}
