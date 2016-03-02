import java.util.*;

/**
 * Ejercicio 18 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_18
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        int lineas = -1,
            patron = -1;
            
        while (true)
        {
            System.out.print( "Introduce el número de líneas [1-15]: ");
            lineas = sc.nextInt();

            if (lineas < 1 || lineas > 15) 
            {
                System.out.println( "ERROR: El número debe estar en el rango.");
                continue;
            }

            System.out.print( "Introduce el patrón a seguir [1-4]: ");
            patron = sc.nextInt();

            if (patron > 0 && patron < 5) break;

            System.out.println( "ERROR: El número debe estar en el rango.");
        }

        // Espacios en blanco + digitos de la 1º cifra + dígitos de 2ª cifra.
        int base = patron%2 == 0 ? lineas : 1;
        int incV = patron%2 == 0 ? -1 : 1;
        boolean inv = patron == 3;
        String ancho = patron/3 == 0 ? "" : ""+(2*lineas + lineas/10* (lineas-9));

        for (int i = 1; i <= lineas; ++i)
        {            
            String cad = "";
            byte incH;
            int inicio, fin;
            if (inv)
            {
                inicio = base;
                fin = 0;
                incH = -1;
            }
            else
            {
                inicio = 1;
                fin = base+1;
                incH = 1;
            }

            for (int j = inicio; j != fin; j+=incH)
                cad += " " + j;

            System.out.printf( "%"+ancho+"s\n", cad);

            base += incV;
        }
    }
}



