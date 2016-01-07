import java.util.*;

/**
 * Ejercicio 26 del Capítulo 3: Determinar si un número entero introducido es
 * divisible por 5 o 6, 5 y 6, 5 o 6 sin serlo por ambos.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_26
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in); //.useLocale( Locale.ENGLISH);

        System.out.print( "Introduce un número entero: ");
        int numero = entrada.nextInt();

        boolean divisiblePor5 = numero % 5 == 0;
        boolean divisiblePor6 = numero % 6 == 0;

        System.out.println( "¿Es divisible por 5 y 6?: " + 
                            (divisiblePor5 && divisiblePor6));
        System.out.println( "¿Es divisible por 5 o 6?: " + 
                            (divisiblePor5 || divisiblePor6));
        System.out.println( "¿Es divisible por 5 o 6, pero no ambos?: " +
                            (divisiblePor5 ^ divisiblePor6));

//        if (!divisiblePor5 && !divisiblePor6)
//        {
//            System.out.println( "El número no es divisible por 5 ni por 6.");
//            System.exit( -1);
//        }
//
//        if (divisiblePor5 && divisiblePor6)
//        {
//            System.out.println( "El número es divisible por 5 y 6.");
//            System.exit( -1);
//        }
//
//        System.out.println( "El número es divisible por " + 
//                            (divisiblePor5 ? "5." : "6."));
    }
}
 
