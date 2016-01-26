import java.util.*;

/**
 * Ejercicio 21 del Capítulo 4: Comprobar si un número de la Seguridad Social
 * es introducido en un formato correcto.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_21
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce el número de S.S.: ");
        String cadena = entrada.next().trim();

        if (cadena.matches( "\\d{3}-\\d{2}-\\d{4}"))
            System.out.println( "Formato de S.S. correcto.");
        else
            System.out.println( "Formato de S.S. incorrecto.");
    }
}

