import java.util.*;

/**
 * Ejercicio 8 del Capítulo 3: Solicitar tres enteros por teclado y mostrarlos
 * en orden creciente. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_08
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce los tres números enteros a ordenar: ");
        int numero1 = entrada.nextInt();
        int numero2 = entrada.nextInt();
        int numero3 = entrada.nextInt();

        if (numero1 > numero2)
        {
            numero1 += numero2;
            numero2 = numero1 - numero2;
            numero1 -= numero2;
        }
        if (numero2 > numero3)
        {
            numero3 += numero2;
            numero2 = numero3 - numero2;
            numero3 -= numero2;

            if (numero1 > numero2)
            {
                numero1 += numero2;
                numero2 = numero1 - numero2;
                numero1 -= numero2;
            }
        }
        
        System.out.println( "Números ordenados: " + numero1 + " " + numero2 +
                            " " + numero3);
    }
}
