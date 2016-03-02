import java.util.*;

/**
 * Ejercicio 20 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_20
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        int inferior = -1, superior = -1;
        while (true)
        {
            System.out.print( "Introduce el ĺimite inferior > 0: ");
            inferior = sc.nextInt();

            if (inferior < 1)
            {
                System.out.println( "ERROR: El límite inferior debe ser > 0.");
                continue;
            }

            System.out.print( "Introduce el ĺimite superior > 1: ");
            superior = sc.nextInt();

            if (superior > 1 && superior >= inferior) break;

            System.out.println( "ERROR: El límite superior debe ser > 1 y >= inferior.");
        }

        int ancho = (""+(int)superior).length() + 1;
       
        for (int i = inferior, primos = 0; i <= superior; ++i)
        {
            boolean primo = true;
            for (int j = 2; j <= i/2; ++j)
            {
                if (i%j != 0) continue;
                primo = false;
                break;
            }

            if (!primo) continue;

            System.out.printf( "%"+ancho+"s", i + ((++primos%8 == 0) ? "\n" : " "));
        }

        System.out.println();
    }
}



