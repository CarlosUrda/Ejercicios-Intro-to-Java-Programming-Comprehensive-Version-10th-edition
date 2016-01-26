import java.util.*;

/**
 * Ejercicio 24 del Capítulo 4: Ordenar los nombres de tres ciudades.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_24
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Nombre de la ciudad 1: ");
        String ciudad1 = entrada.nextLine();
        System.out.print( "Nombre de la ciudad 2: ");
        String ciudad2 = entrada.nextLine();
        System.out.print( "Nombre de la ciudad 3: ");
        String ciudad3 = entrada.nextLine();
        String temp;

        if (ciudad1.compareTo( ciudad2) > 0)
        {
            temp = ciudad1;
            ciudad1 = ciudad2;
            ciudad2 = temp;
        }

        if (ciudad2.compareTo( ciudad3) > 0)
        {
            temp = ciudad2;
            ciudad2 = ciudad3;
            ciudad3 = temp;
 
            if (ciudad1.compareTo( ciudad2) > 0)
            {
                temp = ciudad1;
                ciudad1 = ciudad2;
                ciudad2 = temp;
            }
        }

        System.out.printf( "Las ciudades ordenadas son: %s %s %s\n",
                           ciudad1, ciudad2, ciudad3);
    }
}

