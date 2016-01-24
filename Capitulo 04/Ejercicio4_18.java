import java.util.*;
import java.util.regex.*;

/**
 * Ejercicio 18 del Capítulo 4: Mostrar las categorías de un académico a partir
 * de un código introducido.
 * determinado.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_18
{
    private static String capitalizar( String cadena)
    {
        return cadena.substring(0, 1).toUpperCase() + 
               cadena.substring(1).toLowerCase();
    }


    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.setLocale( Locale.ENGLISH);
        
        System.out.print( "Introduce el código [M|C|T][1-4]: ");
        String codigo = sc.next().trim().toUpperCase();
        Pattern regex = Pattern.compile( "([MCT])([1-4])");
        Matcher resRegEx = regex.matcher( codigo);
        if (!resRegEx.matches())
        {
            System.out.println( "Código incorrecto");
            return;
        }
        char estudios = resRegEx.group(1).charAt(0);
        char grado = resRegEx.group(2).charAt(0);

        String categoria = "";
     
        switch (estudios)
        {
            case 'M': 
                categoria = "Matemáticas";
                break;

            case 'C':
                categoria = "Ciencias de computación";
                break;

            case 'T':
                categoria = "Tecnología de información";
                break;
        }

        switch (grado)
        {
            case '1': 
                categoria += " Principiante";
                break;

            case '2':
                categoria += " Becario";
                break;

            case '3':
                categoria += " Graduado";
                break;

            case '4':
                categoria += " Experimentado";
        }

        System.out.printf( "Categoría: %s\n", categoria);
    }
}

 
