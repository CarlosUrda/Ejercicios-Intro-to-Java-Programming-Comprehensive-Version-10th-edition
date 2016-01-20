import java.util.*;

/**
 * Ejercicio 7 del Capítulo 2: Calcular el número de años y días a partir de un
 * número de minutos introducidos por el teclado. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_07
{
    public static void main( String args[])
    {
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.print( "Introduce el número de minutos: ");
        long minutos = entrada.nextLong();
       
        if (minutos < 0)
        {
            System.out.println( "El número de minutos debe ser positivo.");
            return;
        }

        long dias = minutos/(60*24);

        System.out.println( "Años: " + dias/365 + "; Días: " + dias%365);
    }
}
