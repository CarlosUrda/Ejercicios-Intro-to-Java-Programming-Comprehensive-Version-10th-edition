import java.util.*;

/**
 * Ejercicio 03 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_03
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        System.out.print( "¿Número máximo de kilogramos: " );
        int maxKilos = sc.nextInt();
        System.out.print( "Conversión de kilos a libras: ");
        double kiloALibra = sc.nextDouble();

        System.out.println( "Kilogramos       Libras");
        for (int kilos = 1; kilos <= maxKilos; kilos += 2)
        {
            System.out.printf( "%-11d %11.2f\n", kilos, kilos*kiloALibra);
        }

    }
}
 
