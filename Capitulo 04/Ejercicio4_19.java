import java.util.*;
import java.util.regex.*;

/**
 * Ejercicio 19 del Capítulo 4: Obtener el décimo dígito (suma de verificación)
 * a partir de los nueve primeros de un código ISBN-10.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_19
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Nueve primeros dígitos del código ISBN: ");
        String isbn = entrada.next().trim();
        Pattern regex = Pattern.compile( "\\d{9}");
        Matcher resRegEx = regex.matcher( isbn);
        if (!resRegEx.matches())
        {
            System.out.println( "Error: Tienes que introducir 9 dígitos.");
            return;
        }
        
        int isbnTemp = Integer.parseInt( resRegEx.group());
        System.out.println( isbnTemp);
        short sumaDeDigitos = 0;
        for (int i = 9; i > 0; --i, isbnTemp /= 10)
            sumaDeDigitos += (isbnTemp % 10) * i;
        
        byte digito = (byte)(sumaDeDigitos % 11);

        System.out.println( "Código ISBN-10:" + isbn + 
                            (digito == 10 ? "X" : digito));
    }
}

