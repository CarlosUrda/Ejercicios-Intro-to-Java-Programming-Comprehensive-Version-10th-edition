import java.util.*;

/**
 * Ejercicio 04 del Capítulo 4: Calcular el área de un hexágono. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_04
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "Introduce la longitud del lado del hexágono: ");
        double lado = entrada.nextDouble();

        double area = 6 * Math.pow( lado, 2) / (4 * Math.tan( Math.PI/6));

        System.out.printf( "El área es: %.2f\n", area); 
        
         
    }
}

 
