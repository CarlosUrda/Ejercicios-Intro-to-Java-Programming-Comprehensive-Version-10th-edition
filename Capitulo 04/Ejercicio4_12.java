import java.util.*;

/**
 * Ejercicio 12 del Capítulo 4: Pasar un número hexadecimal a formato binario.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_12
{
    /**
     * Convertir una cifra en hexadecimal a binario.
     *
     * @param cifraHex Carácter cuyo valor es la cifra en hexadecimal.
     * @return Cadena con la cifra en binario.
     */
    private static String cifraHexABin( char cifraHex)
    {
        byte cifraDec = -1;

        if (cifraHex >= 'A' && cifraHex <= 'F')
            cifraDec = (byte)(cifraHex - 'A' + 10);
        else if (Character.isDigit( cifraHex))
            cifraDec = (byte)(cifraHex - '0');
        else
            return null;

        StringBuffer cifraBin = new StringBuffer( "0000");
        for (int i = 3; cifraDec > 0; --i, cifraDec /= 2)
            cifraBin.setCharAt( i, (char)('0' + ( cifraDec % 2)));

        return cifraBin.toString();
    }

    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "Introduce el número hexadecimal: ");
        String hex = entrada.next().trim().toUpperCase();
    
        System.out.print( "En binario: ");
        for (char cifraHex : hex.toCharArray())
            System.out.print( cifraHexABin( cifraHex));

        System.out.println( "\n");

    }
}

 
