import java.util.*;

/**
 * Ejercicio 07 del Capítulo 4: Calcular las coordenadas de los vértices de un
 * polígono regular en una circunferencia. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_07
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "Introduce el radio de la circunferencia: ");
        double radio = entrada.nextDouble();

        System.out.print( "Introduce las coordenadas X e Y del centro: ");
        double centroX = entrada.nextDouble();
        double centroY = entrada.nextDouble();

        System.out.print( "Introduce la orientación en grados partiendo de " +
                          "las 12 en punto en sentido contrario agujas: ");
        double angulo = Math.toRadians( entrada.nextDouble()) + Math.PI/2;

        System.out.print( "Introduce el número de lados del polígono: ");
        int lados = entrada.nextInt();

        double incRadianes = 2*Math.PI / lados;

        for (int i = 1; i <= lados; i++, angulo += incRadianes)
        {
            double x1 = radio * Math.cos( angulo) + centroX;
            double y1 = radio * Math.sin( angulo) + centroY;            
            System.out.printf( "Vértice %d => (%.4f,%.4f)\n", i, x1, y1);
        }
    }
}

 
