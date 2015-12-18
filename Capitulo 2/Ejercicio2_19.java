import java.util.*;

/**
 * Ejercicio 19 del Capítulo 2: Calcular el área de un triángulo a partir de
 * las coordenadas de sus puntos solicitadas por teclado.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_19
{
	public static void main( String args[])
	{
        Locale.setDefault( Locale.ENGLISH);
	    Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce las coordenadas x e y del punto 1: ");
        final double x1 = entrada.nextDouble();
        final double y1 = entrada.nextDouble();

        System.out.print( "Introduce las coordenadas x e y del punto 2: ");
        final double x2 = entrada.nextDouble();
        final double y2 = entrada.nextDouble();

        System.out.print( "Introduce las coordenadas x e y del punto 3: ");
        final double x3 = entrada.nextDouble();
        final double y3 = entrada.nextDouble();
   
        double lado1 = Math.sqrt( Math.pow( x2-x1, 2) + Math.pow( y2-y1, 2));
        double lado2 = Math.sqrt( Math.pow( x3-x1, 2) + Math.pow( y3-y1, 2));
        double lado3 = Math.sqrt( Math.pow( x3-x2, 2) + Math.pow( y3-y2, 2));

        double s = (lado1 + lado2 + lado3) / 2;
        double area = Math.sqrt( s * (s-lado1) * (s-lado2) * (s-lado3));
        System.out.printf( "Área del triángulo: %.4f\n", area);
	}
}
