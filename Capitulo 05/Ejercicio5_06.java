import java.util.*;

/**
 * Ejercicio 06 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_06
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        System.out.print( "¿Valor inicial de millas?: " );
        int iniMillas = sc.nextInt();
        System.out.print( "¿Valor final de millas?: " );
        int finMillas = sc.nextInt();
        System.out.print( "¿Valor inicial de kilómetros?: " );
        int iniKm = sc.nextInt();
        System.out.print( "¿Valor final de kilómetros?: " );
        int finKm = sc.nextInt();
        System.out.print( "Número de valores: ");
        double filas = sc.nextInt();
        System.out.print( "Conversión de millas a kilómetros: ");
        double millaAKm = sc.nextDouble();


        double incMillas = (finMillas - iniMillas) / (filas-1);
        double incKm = (finKm - iniKm) / (filas-1);
        System.out.println( "Millas       kilómetros  |  Kilómetros       Millas");
        for (int i = 0; i < filas; ++i)
        {
            double millas = iniMillas + incMillas*i;
            double km = iniKm + incKm*i;
            System.out.printf( "%-11.2f %11.2f  |  %-11.2f %11.2f\n", 
                               millas, millas*millaAKm, km, km/millaAKm);
        }

    }
}
 
