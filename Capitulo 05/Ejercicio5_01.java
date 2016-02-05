import java.util.*;

/**
 * Ejercicio 01 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_01
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);

        int positivos = 0;
        int negativos = 0;
        int numeros = 0;
        double total = 0;

        System.out.print( "Introduce los números enteros (finaliza con 0): ");
        do {
            int numero = sc.nextInt();
            if (numero == 0) break;
            if (numero > 0) ++positivos;
            if (numero < 0) ++negativos;
            ++numeros;
            total += numero;
        } while( true);

        if (numeros == 0)
        {
            System.out.println( "No se han introducido números.");
            return;
        }

        System.out.println( "Total de números: " + numeros);
        System.out.println( "Números positivos: " + positivos);
        System.out.println( "Números negativos: " + negativos);
        System.out.println( "Cantidad total: " + total);
        System.out.println( "Media total: " + total/numeros);
    }
}
