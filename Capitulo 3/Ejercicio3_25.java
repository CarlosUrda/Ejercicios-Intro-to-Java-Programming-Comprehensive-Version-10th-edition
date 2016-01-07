import java.util.*;

/**
 * Ejercicio 25 del Capítulo 3: Encontrar el pto de intersección de dos rectas.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_25
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in); //.useLocale( Locale.ENGLISH);

        System.out.print( "Coordenadas X e Y del punto 1 de la recta 1: ");
        double p1Xr1 = entrada.nextDouble();
        double p1Yr1 = entrada.nextDouble();

        System.out.print( "Coordenadas X e Y del punto 2 de la recta 1: ");
        double p2Xr1 = entrada.nextDouble();
        double p2Yr1 = entrada.nextDouble();

        System.out.print( "Coordenadas X e Y del punto 1 de la recta 2: ");
        double p1Xr2 = entrada.nextDouble();
        double p1Yr2 = entrada.nextDouble();

        System.out.print( "Coordenadas X e Y del punto 2 de la recta 2: ");
        double p2Xr2 = entrada.nextDouble();
        double p2Yr2 = entrada.nextDouble();

        double a = p1Yr1 - p2Yr1;
        double b = p2Xr1 - p1Xr1;
        double c = p1Yr2 - p2Yr2;
        double d = p2Xr2 - p1Xr2;
        double e = a*p1Xr1 + b*p1Yr1;
        double f = c*p1Xr2 + d*p1Yr2;

        double det = a*d - b*c;
        if (det == 0)
        {
            System.out.println( "Las rectas son paralelas.");
            System.exit( -1);
        }

        double x = (e*d - b*f) / det;
        double y = (a*f - c*e) / det;
        
        System.out.printf( "Punto de intersección: (%.4f,%.4f)\n", x, y);
    }
}
 
