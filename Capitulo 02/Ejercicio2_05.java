import java.util.*;

/**
 * Ejercicio 5 del Capítulo 2: Calcular a partir de un subtotal el total real
 * después de haberle aplicado una razón en porcentaje.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_05
{
    public static void main( String args[])
    {
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.print( "Introduce el subtotal: ");
        double subtotal = entrada.nextDouble();
        System.out.print( "Introduce el porcentaje de la razón: ");
        double porcentajeRazon = entrada.nextDouble();
       
        double razon = porcentajeRazon/100 * subtotal; 
        double total = subtotal + razon;

        System.out.println( "La razón es: " + razon);
        System.out.println( "El total es: " + total);

    }
}
