import java.util.*;

/**
 * Ejercicio 15 del Capítulo 4: Indicar el número asociado con una letra en 
 * el teclado de un teléfono.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_15
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "Introduce la letra: ");
        char letra = entrada.next().trim().toUpperCase().charAt(0);
        if (letra < 'A' || letra > 'Z')
        {
            System.out.println( "Tienes que introducir una letra A-Z");
            return;
        }

        if (letra == 'Z') letra -= 2;
        else if (letra >= 'S') letra--;

        byte numero = (byte)((letra - 'A') / 3 + 2);
        System.out.println( "El número asociado es " + numero);
        return;
    }
}

 
