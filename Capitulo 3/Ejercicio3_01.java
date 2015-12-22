import java.util.*;

/**
 * Ejercicio 1 del Capítulo 3: Calcular las raíces de una ecuación cuadrática.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_01
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);
        System.out.print( "Introduce los coeficientes a, b y c: ");

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        double discriminante = b*b - 4*a*c;

        if (discriminante > 0)
        {
            double temp = Math.sqrt( discriminante);
            double raiz1 = (-b + temp) / (2*a);
            double raiz2 = (-b - temp) / (2*a);
            System.out.printf( "Raíces: %.6f y %.6f\n", raiz1, raiz2);
        }
        else if (discriminante == 0)
        {
            double raiz = -b / (2*a);
            System.out.printf( "Raíz única: %.6f\n", raiz);
        }
        else
        {
            System.out.println( "La ecuación no tiene raíces");
        }
    }
}
 
