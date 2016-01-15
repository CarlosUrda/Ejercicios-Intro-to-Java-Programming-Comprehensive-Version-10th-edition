import java.util.*;

/**
 * Ejercicio 03 del Capítulo 4: Calcular el área encerrada entre 4 puntos.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_03
{
    /**
     * Distancia entre dos puntos en una esfera. 
     *
     * @param lat1 Latitud del primer punto (en grados).
     * @param lon1 Longitud del primer punto (en grados).
     * @param lat2 Latitud del segundo punto (en grados).
     * @param lon2 Longitud del segundo punto (en grados).
     */
    private static double distanciaDePtosEnEsfera( double lat1, double lon1,
                                                   double lat2, double lon2)
    {
        final double radio = 6371.01;   // Radio de la Tierra

        // Conversión a radianes.
        lat1 = Math.toRadians( lat1);
        lon1 = Math.toRadians( lon1);
        lat2 = Math.toRadians( lat2);
        lon2 = Math.toRadians( lon2);

        return radio * Math.acos( Math.sin( lat1) * Math.sin( lat2) +
                                  Math.cos( lat1) * Math.cos( lat2) *
                                  Math.cos( lon1 - lon2));
    }


    /**
     * Área de un triángulo.
     *
     * @param lado1 Lado 1 del triángulo.
     * @param lado2 Lado 2 del triángulo.
     * @param lado3 Lado 3 del triángulo.
     */
    private static double areaTriangulo( double lado1, double lado2, 
                                         double lado3)
    {
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt( s * (s-lado1) * (s-lado2) * (s-lado3));
    }


    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "¿Deseas dar los datos en coordenadas planas o " +
                          "esféricas (P/E): ");
        char coordenadas = entrada.next().trim().toUpperCase().charAt(0);

        String mensajeTipoDatos = coordenadas == 'E' ? "latitud y longitud"
                                                     : "coordenadas x e y";

        System.out.println( "AVISO: Los puntos tiene que introducirse de " +
                            "mayor a menor segunda coordenada.");
        System.out.print( "Introduce " + mensajeTipoDatos + " del punto 1: ");
        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();

        System.out.print( "Introduce " + mensajeTipoDatos + " del punto 2: ");
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();

        System.out.print( "Introduce " + mensajeTipoDatos + " del punto 3: ");
        double x3 = entrada.nextDouble();
        double y3 = entrada.nextDouble();

        System.out.print( "Introduce " + mensajeTipoDatos + " del punto 4: ");
        double x4 = entrada.nextDouble();
        double y4 = entrada.nextDouble();

        double lado1, lado2, lado3, lado4, ladoCentral;

        if (coordenadas == 'P')
        {
            lado1 = Math.sqrt( Math.pow( x2-x1, 2) + Math.pow( y2-y1, 2));
            lado2 = Math.sqrt( Math.pow( x3-x1, 2) + Math.pow( y3-y1, 2));
            lado3 = Math.sqrt( Math.pow( x4-x2, 2) + Math.pow( y4-y2, 2));
            lado4 = Math.sqrt( Math.pow( x4-x3, 2) + Math.pow( y4-y3, 2));
            ladoCentral = Math.sqrt( Math.pow( x3-x2, 2) + Math.pow( y3-y2, 2));
        }
        else
        {
            lado1 = distanciaDePtosEnEsfera( x1, y1, x2, y2);
            lado2 = distanciaDePtosEnEsfera( x1, y1, x3, y3);
            lado3 = distanciaDePtosEnEsfera( x2, y2, x4, y4);
            lado4 = distanciaDePtosEnEsfera( x3, y3, x4, y4);
            ladoCentral = distanciaDePtosEnEsfera( x2, y2, x3, y3);
        }

        double area = areaTriangulo( lado1, lado2, ladoCentral) +
                      areaTriangulo( lado3, lado4, ladoCentral);
        System.out.printf( "El área encerrada entre los puntos es: %.3f km\n", 
                           area);
       
    }
}


