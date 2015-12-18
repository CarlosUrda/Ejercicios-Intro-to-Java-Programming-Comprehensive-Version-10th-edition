import java.util.*;

/**
 * Ejercicio 14 del Capítulo 2: Calcular el índice de masa corporal.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_14
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce el peso en libras: ");
        final double pesoLibras = entrada.nextDouble();
        final double pesoKg = pesoLibras * 0.45359237;

        System.out.print( "Introduce la altura en pulgadas: ");
        final double alturaPulgadas = entrada.nextDouble();
        final double alturaMetros = alturaPulgadas * 0.0254;


        final double imc = pesoKg / Math.pow( alturaMetros, 2);
        String salida = String.format( "Índice de masa corporal: %.4f", imc);
        System.out.println( salida);
    }
}
