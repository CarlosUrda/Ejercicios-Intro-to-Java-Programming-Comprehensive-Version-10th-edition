import java.util.*;

/**
 * Ejercicio 06 del Capítulo 4: Obtener los ángulos de un triángulo formado por
 * tres puntos aleatorios dentro de una circunferencia. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_06
{
    /**
     * Distancia entre dos puntos.
     *
     * @param x1 Coordenada x del punto 1.
     * @param y1 Coordenada y del punto 1.
     * @param x2 Coordenada x del punto 2.
     * @param y2 Coordenada y del punto 2.
     */
    private static double distanciaDosPuntos( double x1, double y1, double x2, 
                                              double y2)
    {
        return Math.sqrt( Math.pow( x2-x1, 2) + Math.pow( y2-y1, 2));
    }


   
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "Introduce el radio de la circunferencia: ");
        double radio = entrada.nextDouble();

        double angulo = Math.random() * 2*Math.PI;
        double x1 = radio * Math.cos( angulo);
        double y1 = radio * Math.sin( angulo);
        angulo = Math.random() * 2*Math.PI;
        double x2 = radio * Math.cos( angulo);
        double y2 = radio * Math.sin( angulo);
        angulo = Math.random() * 2*Math.PI;
        double x3 = radio * Math.cos( angulo);
        double y3 = radio * Math.sin( angulo);

        double ladoA = distanciaDosPuntos( x1, y1, x2, y2);
        double ladoB = distanciaDosPuntos( x1, y1, x3, y3);
        double ladoC = distanciaDosPuntos( x3, y3, x2, y2);

        double anguloC = Math.acos((ladoC*ladoC - ladoB*ladoB - ladoA*ladoA) /
                                   (-2*ladoA*ladoB));
        double anguloA = Math.asin( ladoA * Math.sin( anguloC) / ladoC);
        anguloA = Math.toDegrees( anguloA);
        anguloC = Math.toDegrees( anguloC);
        double anguloB = 180 - anguloA - anguloC;

        System.out.printf( "Ángulos del triángulo formado: %.3f, %f.3, %.3f\n", 
                           anguloA, anguloB, anguloC);
        System.out.println("Suma de los ángulos: " + (anguloA+anguloB+anguloC));
    }
}

 
