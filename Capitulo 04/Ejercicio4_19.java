import java.util.*;

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
        long isbn = entrada.nextLong();

        byte digito;
        int sumaDeDigitos = 0;
        long isbnTemp = isbn;
        for (int i = 9; i >= 0; --i)
        {
            digito = (byte)(isbnTemp % 10);
            isbnTemp /= 10;
            sumaDeDigitos += digito * i;
        }
        
        digito = (byte)(sumaDeDigitos % 11);

        System.out.printf( "Código ISBN-10: %09d%s\n", isbn, 
                           (digito == 10 ? "X" : digito));
    }
}

