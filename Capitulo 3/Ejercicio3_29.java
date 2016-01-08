import java.util.*;

/**
 * Ejercicio 29 del Capítulo 3: Determinar si un círculo está incluído dentro
 * de otro.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_29
{
    /**
     * Información de cómo están solapados dos círculos.
     *
     * @param x1 Coordenada X del centro del círculo 1.
     * @param y1 Coordenada Y del centro del círculo 1.
     * @param radio1 Radio del círculo 1.
     * @param x2 Coordenada X del centro del círculo 2.
     * @param y2 Coordenada Y del centro del círculo 2.
     * @param radio2 Radio del círculo 2.
     * @return 0 si los círculos están completamente separados.
     *         1 si se solapan pero no está incluído ninguno en el otro.
     *         2 si el círculo 1 está incluído en el círculo 2.
     *         3 si el círculo 2 está incluído en el círculo 1.
     */
    private static byte interseccionCirculos( double x1, double y1, double radio1,
                                              double x2, double y2, double radio2)
    {
        double dist = Math.sqrt( Math.pow( x1-x2, 2) + Math.pow( y2-y1, 2));

        if (dist < Math.abs(radio1-radio2))
            return (byte)((radio2 > radio1) ? 2 : 3); 
        
        if (dist <= radio1+radio2)
            return 1;

        return 0; 
    }


    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in); //.useLocale( Locale.ENGLISH);

        System.out.print( "Coordenadas X e Y del centro del círculo 1: ");
        double x1 = entrada.nextDouble();
        double y1 = entrada.nextDouble();

        System.out.print( "Radio del círculo 1: ");
        double radio1 = entrada.nextDouble();

        System.out.print( "Coordenadas X e Y del centro del círculo 2: ");
        double x2 = entrada.nextDouble();
        double y2 = entrada.nextDouble();

        System.out.print( "Radio del círculo 2: ");
        double radio2 = entrada.nextDouble();

        byte result = interseccionCirculos( x1, y1, radio1, x2, y2, radio2);
        
        switch (result)
        {
            case 0:
                System.out.println( "Los círculos están separados.");
                break;
            case 1:
                System.out.println( "Los círculos sólo se solapan.");
                break;
            case 2:
                System.out.println( "Círculo 1 incluido en el círculo 2.");
                break;
            case 3:
                System.out.println( "Círculo 2 incluido en el círculo 1.");
                break;
            default:
                break;
        }
    }
}
 
