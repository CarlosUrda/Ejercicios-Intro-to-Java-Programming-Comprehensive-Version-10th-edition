import java.util.*;

/**
 * Ejercicio 28 del Capítulo 3: Determinar si un rectángulo está incluído dentro
 * de otro.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_28
{
    /**
     * Información de cómo están solapados dos rectángulos.
     *
     * @param izqdo1 Coordenada X del lado izquierdo del rectángulo 1.
     * @param decho1 Coordenada X del lado derecho del rectángulo 1.
     * @param super1 Coordenada Y del lado superior del rectángulo 1.
     * @param infer1 Coordenada Y del lado inferior del rectángulo 1.
     * @param izqdo2 Coordenada X del lado izquierdo del rectángulo 2.
     * @param decho2 Coordenada X del lado derecho del rectángulo 2.
     * @param super2 Coordenada Y del lado superior del rectángulo 2.
     * @param infer2 Coordenada Y del lado inferior del rectángulo 2.
     * @return 0 si los triángulos están completamente separados.
     *         1 si se solapan pero no está incluído ninguno en el otro.
     *         2 si el rectángulo 1 está incluído en el rectángulo 2.
     *         3 si el rectángulo 2 está incluído en el rectángulo 1.
     */
    private static byte interseccionRectangulos( double izqdo1, double decho1,
                                                 double super1, double infer1,
                                                 double izqdo2, double decho2, 
                                                 double super2, double infer2)        
    {
        if (izqdo1 > decho2 || decho1 < izqdo2 || infer1 > super2 || 
            super1 < infer2)
            return 0;

        if (izqdo1 >= izqdo2 && decho1 <= decho2 && infer1 >= infer2 && 
            super1 <= super2)
            return 2;

        if (izqdo2 >= izqdo1 && decho2 <= decho1 && infer2 >= infer1 && 
            super2 <= super1)
            return 3;
        
        return 1; 
    }


    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in); //.useLocale( Locale.ENGLISH);

        System.out.print( "Coordenadas X e Y del centro del rectángulo 1: ");
        double rect1X = entrada.nextDouble();
        double rect1Y = entrada.nextDouble();

        System.out.print( "Ancho y alto del rectángulo 1: ");
        double rect1Ancho = entrada.nextDouble();
        double rect1Alto = entrada.nextDouble();

        System.out.print( "Coordenadas X e Y del centro del rectángulo 2: ");
        double rect2X = entrada.nextDouble();
        double rect2Y = entrada.nextDouble();

        System.out.print( "Ancho y alto del rectángulo 2: ");
        double rect2Ancho = entrada.nextDouble();
        double rect2Alto = entrada.nextDouble();

        double ladoIzqdoRect1 = rect1X - rect1Ancho/2;
        double ladoDechoRect1 = rect1X + rect1Ancho/2;
        double ladoIzqdoRect2 = rect2X - rect2Ancho/2;
        double ladoDechoRect2 = rect2X + rect2Ancho/2;
        double ladoSuperRect1 = rect1Y + rect1Alto/2;
        double ladoInferRect1 = rect1Y - rect1Alto/2;
        double ladoSuperRect2 = rect2Y + rect2Alto/2;
        double ladoInferRect2 = rect2Y - rect2Alto/2;

        byte result = interseccionRectangulos( ladoIzqdoRect1, ladoDechoRect1,
                                               ladoSuperRect1, ladoInferRect1, 
                                               ladoIzqdoRect2, ladoDechoRect2, 
                                               ladoSuperRect2, ladoInferRect2);
        switch (result)
        {
            case 0:
                System.out.println( "Los rectángulos están separados.");
                break;
            case 1:
                System.out.println( "Los rectángulos sólo se solapan.");
                break;
            case 2:
                System.out.println( "Rectángulo 1 incluido en el rectángulo 2");
                break;
            case 3:
                System.out.println( "Rectángulo 2 incluido en el rectángulo 1");
                break;
            default:
                break;
        }
    }
}
 
