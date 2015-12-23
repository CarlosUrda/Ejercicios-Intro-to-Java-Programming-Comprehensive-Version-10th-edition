import java.util.*;

/**
 * Ejercicio 12 del Capítulo 3: Mostrar si un número es palíndromo.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_12
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce el número: ");
        long numero = entrada.nextLong();
        long numeroTemp = numero;
        long espejo = 0;

        for (short i = 0; numeroTemp > 0; i++) 
        {
            espejo = espejo*10 + numeroTemp%10;
            numeroTemp /= 10;
        } 
        
        System.out.println( "El número " + ((numero == espejo) ? "es": "no es") +
                            " palíndromo => " + espejo);
    }
}

