import java.util.*;

/**
 * Ejercicio 32 del Capítulo 3: Determinar si un punto está en el lado
 * izquierdo, derecho o forma parte de una línea determinada por otros dos 
 * puntos.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_32
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in); //.useLocale( Locale.ENGLISH);

        System.out.print( "Coordenadas X e Y del punto 1 de la recta: ");
        double rectaX1 = entrada.nextDouble();
        double rectaY1 = entrada.nextDouble();

        System.out.print( "Coordenadas X e Y del punto 2 de la recta: ");
        double rectaX2 = entrada.nextDouble();
        double rectaY2 = entrada.nextDouble();

        System.out.print( "Coordenadas X e Y del punto a comprobar: ");
        double puntoX = entrada.nextDouble();
        double puntoY = entrada.nextDouble();

        double condicion = (rectaX2-rectaX1)*(puntoY-rectaY1) - 
                           (puntoX-rectaX1)*(rectaY2-rectaY1);

        if (condicion > 0)
            System.out.println( "El punto está en el lado izqdo de la línea.");
        else if (condicion == 0)
            System.out.println( "El punto está en la misma línea.");
        else
            System.out.println( "El punto está en el lado decho de la línea.");
    }
}
 
