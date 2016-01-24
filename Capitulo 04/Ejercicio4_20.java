import java.util.*;

/**
 * Ejercicio 20 del Capítulo 4: Mostrar la longitud y primer carácter de una
 * cadena.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_20
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce una cadena: ");
        String cadena = entrada.next();
        System.out.println( "Longitud de la cadena: " + cadena.length());
        System.out.println( "Primer carácter: " + cadena.charAt(0));
    }
}

