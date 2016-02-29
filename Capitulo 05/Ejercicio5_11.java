import java.util.*;

/**
 * Ejercicio 11 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_11
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        System.out.print( "Introduce el límite inferior: ");
        int inferior = sc.nextInt();

        System.out.print( "Introduce el límite superior: ");
        int superior = sc.nextInt();

        int porLinea = 0;
        for (int i = inferior; i <= superior; i++)
        {
            if (!((i%5 == 0) ^ (i%6 == 0))) continue;
 
            System.out.print( i);
            System.out.print( (++porLinea%10 == 0) ? "\n" : " ");
        }
    }
}



