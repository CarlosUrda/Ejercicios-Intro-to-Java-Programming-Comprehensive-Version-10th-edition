import java.util.*;

/**
 * Ejercicio 3 del Capítulo 3: Calcular la solución de un sistema de dos 
 * ecuaciones usando la regla de Cramer. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_03
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce los coeficientes a, b, c, d, e y f: ");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double d = entrada.nextDouble();
        double e = entrada.nextDouble();
        double f = entrada.nextDouble();

        double det = a*d - b*c;
        if (det == 0)
        {
            System.out.println( "El sistema es linealmente dependiente y por " + 
                                "ende no tiene solución");
            System.exit( -1);
        }

        double x = (e*d - b*f) / det;
        double y = (a*f - c*e) / det;
        
        System.out.println( "Las soluciones son x = " + x + "; y = " + y);
    }
}
 
