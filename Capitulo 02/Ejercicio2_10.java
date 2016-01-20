import java.util.*;

/**
 * Ejercicio 10 del Capítulo 2: Calcular la cantidad de trabajo necesaria para
 * poder cambiar una cantidad determinada de agua de una temperatura inicial a 
 * una temperatura final.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_10
{
    public static void main( String args[])
    {
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.print( "Peso del agua en Kilos: ");
        double pesoAgua = entrada.nextDouble();
        System.out.print( "Temperatura inicial en grados Celsius: ");
        double temperaturaInicial = entrada.nextDouble();
        System.out.print( "Temperatura final en grados Celsius: ");
        double temperaturaFinal = entrada.nextDouble();

        double trabajo = pesoAgua * (temperaturaFinal-temperaturaInicial)* 4184;
        System.out.println( "Trabajo realizado: " + trabajo); 
    }
}
