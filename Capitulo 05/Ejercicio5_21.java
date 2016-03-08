import java.util.*;

/**
 * Ejercicio 20 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_21
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in); //.useLocale( Locale.ENGLISH);

        System.out.print( "Introduce la cantidad del préstamo: ");
        double prestamo = sc.nextDouble();

        System.out.print( "Introduce los años del préstamo: ");
        double annos = sc.nextInt();

        System.out.print( "Introduce los rangos de interés inicial y final (%): ");
        double interesIni = sc.nextDouble();
        double interesFin = sc.nextDouble();

        System.out.print( "Introduce el incremento de cada rango: ");
        double interesInc = sc.nextDouble();

        System.out.println( "Interés        Pago Mensual       Pago Total");
        for (double interes = interesIni; interes <= interesFin; interes += interesInc)
        {
            double razonInteresMensual = interes / 1200;
            double pagoMensual = prestamo * razonInteresMensual / 
                                 (1 - 1/Math.pow(1+razonInteresMensual, 12*annos));
            double pagoTotal = pagoMensual * annos * 12;
            System.out.printf( "%.3f%%\t\t%-10.2f\t%-10.2f\n", 
                               interes, pagoMensual, pagoTotal);
        }

    }
}
