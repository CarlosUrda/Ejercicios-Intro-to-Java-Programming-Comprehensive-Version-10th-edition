import java.util.*;

/**
 * Ejercicio 1 del Capítulo 2.
 * Programa que lee una cantidad de grados Celsius y los convierte a grados
 * Farenheit.
 * 
 * @author Carlos A. Gómez Urda
 * @version 1.9
 */
public class Ejercicio2_01
{
    public static void main( String args[])
    {
        System.out.print( "Introduce los grados Celsius: ");
        Scanner entrada = new Scanner( System.in);

        double celsius = entrada.nextDouble();
        double farenheit = 9*celsius / 5 + 32;
        System.out.println( "Grados Farenheit: " + farenheit);
    }
}
