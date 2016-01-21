import java.util.*;

/**
 * Ejercicio 08 del Capítulo 4: Mostrar el carácter correspondiente a un
 * correspondiente código ASCII.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_08
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "Introduce el código ASCII [0-127]: ");
        byte codigo = entrada.nextByte();

        System.out.println( "Carácter asociado al código: " + (char)codigo);
    }
}

 
