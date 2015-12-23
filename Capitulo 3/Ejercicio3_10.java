import java.util.*;

/**
 * Ejercicio 10 del Capítulo 3: Acertar el resultado de una suma de números 
 * menores que 100.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_10
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        int numero1 = (int)(Math.random() * 100);
        int numero2 = (int)(Math.random() * 100);

        System.out.print("¿Cuánto es " + numero1 + " + " + numero2 + "?: ");
        int respuesta = entrada.nextInt();
        int suma = numero1 + numero2;
        if (suma == respuesta)
            System.out.println( "¡Acertaste!");
        else 
        {
            System.out.println( "Fallaste");
            System.out.println( numero1 + " + " + numero2 + " es " + suma);
        }
    }
}

