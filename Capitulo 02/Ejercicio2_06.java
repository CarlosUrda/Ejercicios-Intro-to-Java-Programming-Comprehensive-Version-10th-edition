import java.util.*;

/**
 * Ejercicio 6 del Capítulo 2: Calcular a la suma de todos los dígitos que 
 * forman un entero.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_06
{
    public static void main( String args[])
    {
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.print( "Introduce el número entero [0-1000]: ");
        int numero = entrada.nextInt();
       
        if (numero < 0 || numero > 1000)
        {
            System.out.println( "Número introducido fuera de rango.");
            return;
        }

        int sumaDeDigitos = 0;
        while (numero > 0)
        {
            sumaDeDigitos += numero % 10;
            numero /= 10;
        }

        System.out.println( "La suma de sus dígitos es: " + sumaDeDigitos);
    }
}
