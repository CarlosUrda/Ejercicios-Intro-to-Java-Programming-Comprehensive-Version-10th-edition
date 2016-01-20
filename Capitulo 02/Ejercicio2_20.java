import java.util.*;

/**
 * Ejercicio 20 del Capítulo 2: Calcular el interés obtenido durante un mes
 * a partir del dinero guardado en el banco y el interés anual.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_20
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce el balance: ");
        final double balance = entrada.nextDouble();

        System.out.print( "Introduce interés anual en porcentaje: ");
        final double porcentajeInteresAnual = entrada.nextDouble();
        final double razonInteresMensual = porcentajeInteresAnual / 1200;

        final double interesMensual = balance * razonInteresMensual;
        System.out.printf( "El interés mensual es: %.5f\n", interesMensual);
    }
}

