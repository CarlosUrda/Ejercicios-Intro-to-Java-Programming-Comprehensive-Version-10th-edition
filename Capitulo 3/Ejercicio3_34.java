import java.util.*;

/**
 * Ejercicio 34 del Capítulo 3: Determinar si un punto está dentro del segmento
 * formado entre dos puntos. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_34
{
    private static boolean estaEnIntervalo( double limite1, double limite2, double valor)
    {
        return (limite1 <= limite2) ? (valor >= limite1 && valor <= limite2)
                                    : (valor >= limite2 && valor <= limite1);
    }


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

        if (estaEnIntervalo( rectaX1, rectaX2, puntoX) && condicion == 0)
            System.out.println( "El punto está en el segmento.");
        else
            System.out.println( "El punto no está en segmento.");
    }
}
 
