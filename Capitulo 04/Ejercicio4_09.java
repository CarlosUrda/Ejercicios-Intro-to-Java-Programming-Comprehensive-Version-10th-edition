import java.util.*;

/**
 * Ejercicio 09 del Capítulo 4: Mostrar el código Unicode correspondiente a un
 * carácter.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_09
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "Introduce el carácter: ");
        char caracter = entrada.next().charAt(0);

        System.out.printf( "El código Unicode del carácter es: %d\n", 
                           (short)caracter);

   }
}

 
