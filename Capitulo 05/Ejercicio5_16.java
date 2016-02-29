import java.util.*;

/**
 * Ejercicio 15 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_15
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        System.out.print( "Introduce el carácter inicial: ");
        char inicio = sc.next().trim().charAt(0);

        System.out.print( "Introduce el carácter final: ");
        char fin = sc.next().trim().charAt(0);

        if (inicio > fin)
        {
            char temp = fin;
            fin = inicio;
            inicio = temp;            
        }

        int i = 1;
        for (char c = inicio; c <= fin; ++c, ++i)
        {
            System.out.print( c);
            System.out.print( i%10 == 0 ? "\n": " ");
        }

        System.out.println();
    }
}



