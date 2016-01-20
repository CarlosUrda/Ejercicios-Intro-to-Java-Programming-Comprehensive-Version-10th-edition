import java.util.*;

/**
 * Ejercicio 21 del Capítulo 2: Calcular la futura inversión obtenida a partir 
 * de la inversión inicial, el número de años y la razón de interés anual.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_21
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce la inversión inicial: ");
        final double inversionInicial = entrada.nextDouble();

        System.out.print( "Introduce el porcentaje del interés anual: ");
        final double porcentajeInteresAnual = entrada.nextDouble();
        final double razonInteresMensual = porcentajeInteresAnual / 1200;

        System.out.print( "Introduce el número de años: ");
        final int numeroDeAnnos = entrada.nextInt();
       
        double valorAcumulado = inversionInicial * 
                                Math.pow( 1 + razonInteresMensual,
                                          numeroDeAnnos * 12);
        System.out.printf( "El valor acumulado es: %.2f\n", valorAcumulado);
    }
}
