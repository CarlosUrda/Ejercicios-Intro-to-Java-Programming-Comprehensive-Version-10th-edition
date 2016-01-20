import java.util.*;

/**
 * Ejercicio 13 del Capítulo 2: Calcular la cantidad de dinero guardada en el
 * banco después de ir ingresando todos los meses una cantidad y tras haberse
 * aplicado cada mes los intereses correspondientes a partir del interés anual.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_13
{
    public static void main( String args[])
    {
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.print( "Introduce la cantidad a ingresar cada mes: ");
        final double ingresoMensual = entrada.nextDouble();

        System.out.print( "Introduce el interés anual en procentaje: ");
        final double interesAnual = entrada.nextDouble();
        final double interesMensual = interesAnual / 1200;

        System.out.print( "Introduce el número de meses a calcular: ");
        final double meses = entrada.nextDouble();
   
        double cuenta = 0;
        for (int i = 0; i < meses; i++)
        {
            cuenta += ingresoMensual;
            cuenta *= 1 + interesMensual;
        }

        System.out.println( "Cuenta bancaria: " + cuenta);
    }
}
