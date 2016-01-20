import java.util.*;

/**
 * Ejercicio 27 del Capítulo 3: Determinar si un punto está situado dentro de
 * un triángulo.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_27
{
    private static boolean signoDeTriangulo( double p1X, double p1Y, double p2X, 
                                             double p2Y, double p3X, double p3Y)
    {
        return (p1X - p3X) * (p2Y - p3Y) - (p2X - p3X) * (p1Y - p3Y) > 0;
    }


    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in); //.useLocale( Locale.ENGLISH);

        System.out.print( "Coordenadas X e Y del punto 1 del triángulo: ");
        double rectX1 = entrada.nextDouble();
        double rectY1 = entrada.nextDouble();

        System.out.print( "Coordenadas X e Y del punto 2 del triángulo: ");
        double rectX2 = entrada.nextDouble();
        double rectY2 = entrada.nextDouble();

        System.out.print( "Coordenadas X e Y del punto 3 del triángulo: ");
        double rectX3 = entrada.nextDouble();
        double rectY3 = entrada.nextDouble();

        System.out.print( "Coordenadas X e Y del punto a comprobar: ");
        double puntoX = entrada.nextDouble();
        double puntoY = entrada.nextDouble();

        boolean signoTriang = signoDeTriangulo( rectX1, rectY1, rectX2, rectY2, 
                                                rectX3, rectY3);
        boolean signoPuntoA = signoDeTriangulo( rectX1, rectY1, rectX2, rectY2,
                                                puntoX, puntoY);
        boolean signoPuntoB = signoDeTriangulo( rectX2, rectY2, rectX3, rectY3,
                                                puntoX, puntoY);
        boolean signoPuntoC = signoDeTriangulo( rectX3, rectY3, rectX1, rectY1,
                                                puntoX, puntoY);

        boolean estaDentro = !(signoPuntoA ^ signoPuntoB) && 
                             !(signoPuntoA ^ signoPuntoC) &&
                             !(signoPuntoA ^ signoTriang);
       
        System.out.println( "¿Punto dentro de la pirámide?: " + estaDentro);
    }
}
 
