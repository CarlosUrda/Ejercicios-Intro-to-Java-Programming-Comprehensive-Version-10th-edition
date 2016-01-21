import java.util.*;

/**
 * Ejercicio 11 del Capítulo 4: Pasar un número decimal a formato hexadecimal.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_11
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "Introduce el número decimal: ");
        int dec = entrada.nextInt();
        String signo = dec < 0 ? "-" : "";
        dec = Math.abs( dec);

        StringBuffer hex = new StringBuffer();
        do {
            byte cifra = (byte)(dec % 16);
            hex.insert( 0, (char)((cifra<10) ? ('0'+cifra) : ('A'+cifra-10)));
            dec /= 16;
        } while (dec > 0); 

        System.out.println( "En hexadecimal: " + signo + hex);
   }
}

 
