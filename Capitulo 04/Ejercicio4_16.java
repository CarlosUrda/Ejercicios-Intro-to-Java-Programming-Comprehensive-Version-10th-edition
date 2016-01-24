import java.util.*;

/**
 * Ejercicio 16 del Capítulo 4: Mostrar una letra en mayúsculas aleatoriamente.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_16
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        char letra = (char)(('Z'-'A'+1) * Math.random() + 'A');

        System.out.printf( "Letra: %c\n", letra);
    }
}

 
