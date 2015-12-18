import java.util.*;

/**
 * Ejercicio 18 del Capítulo 2: Mostrar tabla de valores donde cada fila muestra
 * la base, el exponente y el resultado de la potencia.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_18
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.printf( "a\tb\tpow(a,b)\n");
        for (int i = 1; i < 7; i++)
        {
            int a = i;
            int b = i+1;
            int potencia = (int)Math.pow( a, b);
            System.out.printf( "%d\t%d\t%d\n", a, b, potencia);
        }
    }
}
