import java.util.*;

/**
 * Ejercicio 19 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_19
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

        int ancho = (""+(int)Math.pow( 2, lineas-1)).length() + 1;
        int base = lineas*ancho;
        for (int i = 1; i <= lineas; ++i)
        {
            String cad1 = "", cad2 = "";
            for (int j = 1; j <= i; ++j)
            {
                String valor = String.format( "%"+ancho+"s", (int)Math.pow( 2, j-1));
                cad1 += valor;
                if (j == i) break;
                cad2 = valor + cad2;
            }

            System.out.printf( "%"+(base+cad2.length())+"s\n", cad1 + cad2);
        }
    }
}



