import java.util.*;

/**
 * Ejercicio 16 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_16
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        int numero = -1;
        while (true)
        {
            System.out.print( "Introduce el número a calcular sus factores: ");
            numero = sc.nextInt();

            if (numero > 0) break;

            System.out.println( "ERROR: El número debe ser positivo.");
        }

        String factores = numero == 1 ? "1" : "";

        int numeroTemp = numero;
        while (numeroTemp > 1)
        {
            for (int i = 2; i <= numeroTemp; ++i)
            {
                if (numeroTemp % i != 0) continue;
                numeroTemp /= i;
                factores += " " + i;
                break;
            }
        }

        System.out.printf( "Los factores de %d son: %s\n", numero, factores);
    }
}



