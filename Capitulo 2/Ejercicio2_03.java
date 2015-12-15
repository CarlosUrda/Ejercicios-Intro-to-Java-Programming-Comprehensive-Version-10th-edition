import java.util.*;

/**
 * Ejercicio 3 del Capítulo 2.
 * Programa que lee una dimensión en pies y la convierte a metros.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.9
 */
public class Ejercicio2_03
{
    public static void main( String args[])
    {
        System.out.print( "Introduce los pies: ");
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        double pies = entrada.nextDouble();
        double metros = pies * 0.305;

        System.out.println( "Metros: " + metros);
    }
}
