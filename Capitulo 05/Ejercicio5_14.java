import java.util.*;

/**
 * Ejercicio 14 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_14
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        System.out.print( "Introduce el primer entero: ");
        int numero1 = sc.nextInt();

        System.out.print( "Introduce el segundo entero: ");
        int numero2 = sc.nextInt();

        int mcd = (numero1 <= numero2) ? numero1 : numero2;

        while (mcd >=1)
        {
            if (numero1 % mcd == 0 && numero2 % mcd == 0) break;
            --mcd;
        }

        System.out.printf( "El máximo común divisor es: %d\n", mcd);
    }
}



