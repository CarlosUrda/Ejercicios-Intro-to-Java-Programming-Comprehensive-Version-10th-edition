import java.util.*;

/**
 * Ejercicio 22 del Capítulo 4: Comprobar si una cadena es subcadena de otra
 * cadena.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_22
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce la cadena principal: ");
        String cadena = entrada.nextLine();

        System.out.print( "Introduce la subcadena: ");
        String subcadena = entrada.nextLine();

        String si_no = cadena.contains( subcadena) ? "sí" : "no";
        System.out.printf("%s %s es subcadena de %s\n",subcadena,si_no,cadena);
    }
}

