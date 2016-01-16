import java.util.*;

/**
 * Ejercicio 05 del Capítulo 4: Calcular el área de un polígono regular. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_05
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "Introduce la longitud del lado del polígono: ");
        double lado = entrada.nextDouble();

        System.out.print( "Introduce el número de lados: ");
        int lados = entrada.nextInt();

        double area = lados * Math.pow(lado, 2) / (4 * Math.tan(Math.PI/lados));

        System.out.printf( "El área es: %.2f\n", area); 
        
         
    }
}

 
