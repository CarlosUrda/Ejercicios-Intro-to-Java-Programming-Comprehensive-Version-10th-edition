import java.util.*;

/**
 * Ejercicio 19 del Capítulo 3: Calcular el perímetro de un triángulo a partir
 * de la longitud de sus lados.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_19
{
    public static void main(String[] args) 
    {
        //Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.print( "Introduce la longitud del lado 1: ");
        double lado1 = entrada.nextDouble();
        System.out.print( "Introduce la longitud del lado 2: ");
        double lado2 = entrada.nextDouble();
        System.out.print( "Introduce la longitud del lado 3: ");
        double lado3 = entrada.nextDouble();

        if (lado1+lado2 < lado3 || lado2+lado3 < lado1 || lado1+lado3 < lado2)
        {
            System.out.println( "La suma de cada par de lados debe ser mayor" +
                                " que el lado restante.");
            return;
        }

        double permitetro = lado1 + lado2 + lado3;
        System.out.println( "El perímetro del triángulo es: " + permitetro);
    }
}
 
