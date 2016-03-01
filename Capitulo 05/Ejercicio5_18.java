import java.util.*;

/**
 * Ejercicio 17 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_17
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        int lineas = -1;
        while (true)
        {
            System.out.print( "Introduce el número de líneas [1-15]: ");
            lineas = sc.nextInt();

            if (lineas > 0 && lineas < 16) break;

            System.out.println( "ERROR: El número debe estar en el rango.");
        }

        // Espacios en blanco + digitos de la 1º cifra + dígitos de 2ª cifra.
        int base = (lineas-1) + lineas + lineas/10* (lineas-9);
        for (int i = 1; i <= lineas; ++i)
        {
            String cad1 = "", cad2 = "";
            for (int j = i; j >= 2; --j)
            {
                cad1 += j + " ";
                cad2 += " " + (i-j+2);
            }

            System.out.printf( "%"+(base+cad2.length())+"s\n", cad1+"1"+cad2);
        }
    }
}



