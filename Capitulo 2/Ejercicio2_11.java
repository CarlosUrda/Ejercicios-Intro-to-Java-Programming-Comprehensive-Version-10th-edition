import java.util.*;

/**
 * Ejercicio 11 del Capítulo 2: Calcular la población en una serie de años 
 * introducidos por teclado.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_11
{
    public static void main( String args[])
    {
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        final double nacimientosPorSeg = 1.0/7.0;
        final double muertesPorSeg = 1.0/13.0;
        final double inmigrantesPorSeg = 1.0/45.0;
        final long segundosPorAnno = 365*24*60*60;
        long poblacion = 312032486;

        System.out.print( "Introduce los años: ");
        int annos = entrada.nextInt();
        
        System.out.println( "Año 0: " + poblacion);
        double cambioPoblacion = 0;
        double cambioPoblacionPorSeg = nacimientosPorSeg - muertesPorSeg + 
                                       inmigrantesPorSeg;
        double cambioPoblacionAnual = segundosPorAnno * cambioPoblacionPorSeg;
        for (int i = 0; i < annos; i++)
        {
            cambioPoblacion += cambioPoblacionAnual;
            System.out.println( "Año " + (i+1) + ": " + 
                                (long)(poblacion+cambioPoblacion));
        }
    }
}
