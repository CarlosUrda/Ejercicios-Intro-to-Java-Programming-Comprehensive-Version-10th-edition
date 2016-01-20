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
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "Introduce el radio de la circunferencia: ");
        double radio = entrada.nextDouble();

        double angulo = Math.rand() * 2*Math.PI;
        double x1 = radio * Math.cos( angulo);
        double y1 = radio * Math.sin( angulo);
        angulo = Math.rand() * 2*Math.PI;
        double x2 = radio * Math.cos( angulo);
        double y2 = radio * Math.sin( angulo);
        angulo = Math.rand() * 2*Math.PI;
        double x3 = radio * Math.cos( angulo);
        double y3 = radio * Math.sin( angulo);

        double m12 = (y2-y1) / (x2-x1);
        double m23 = (y3-y2) / (x3-x2);
        double m13 = (y3-y1) / (x3-x1);

        double angulo1 = Math.toDegrees( Math.atan( (m23-m12) / (1+m23*m12)));
        double angulo2 = Math.toDegrees( Math.atan( (m12-m13) / (1+m12*m13)));
        double angulo3 = Math.toDegrees( Math.atan( (m23-m13) / (1+m23*m13)));
        System.out.printf( "Ángulos del triángulo formado: %.3f, %f.3, %.3f\n", 
                           angulo1, angulo2, angulo3);
    }
}

 
