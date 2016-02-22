import java.util.*;

/**
 * Ejercicio 04 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_04
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        System.out.print( "¿Número máximo de millas: " );
        int maxMillas = sc.nextInt();
        System.out.print( "Conversión de millas a kilómetros: ");
        double millaAKm = sc.nextDouble();

        System.out.println( "Millas      Kilómetros");
        for (int millas = 1; millas <= maxMillas; ++millas)
        {
            System.out.printf( "%-11d %11.2f\n", millas, millas*millaAKm);
        }

    }
}
 
