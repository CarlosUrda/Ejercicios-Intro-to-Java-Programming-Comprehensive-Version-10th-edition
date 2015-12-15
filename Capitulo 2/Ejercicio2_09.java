import java.util.*;

/**
 * Ejercicio 9 del Capítulo 2: Calcular la velocidad media a partir de las
 * velocidades inicial y final, y del tiempo transcurrido introducidos por
 * teclado. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_09
{
    public static void main( String args[])
    {
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.print( "Introduce la velocidad inicial: ");
        double velocidadInicial = entrada.nextDouble();
        System.out.print( "Introduce la velocidad final: ");
        double velocidadFinal = entrada.nextDouble();
        System.out.print( "Introduce el tiempo transcurrido: ");
        double tiempo = entrada.nextDouble();

        double velocidadMedia = (velocidadFinal - velocidadInicial) / tiempo;
        System.out.println( "La velocidad media es: " + velocidadMedia); 
    }
}
