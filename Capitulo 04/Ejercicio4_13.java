import java.util.*;

/**
 * Ejercicio 13 del Capítulo 4: Comprobar si una letra es vocal o consonante.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_13
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "Introduce la cadena a comprobar sus letras: ");
        String cadena = entrada.next().trim();
    
        for (char letra : cadena.toCharArray())
        {
            char letraMayus = Character.toUpperCase( letra);

            if (!Character.isLetterOrDigit( letra))
                System.out.println( letra + " no es letra ni dígito.");
            else if (Character.isDigit( letra))
                System.out.println( letra + " es un dígito.");
            else if (letraMayus=='A' || letraMayus=='E' || letraMayus=='I' ||
                     letraMayus=='O' || letraMayus=='U')
                System.out.println( letra + " es una vocal.");
            else
                System.out.println( letra + " es una consonante.");
        }
    }
}

 
