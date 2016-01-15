import java.util.*;

/**
 * Ejercicio 01 del Capítulo 4: Calcular el área de un pentágono. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_01
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "Introduce el radio del pentágono: ");
        double radio = entrada.nextDouble();

        final double pi5 = Math.PI / 5;
        double lado = 2 * radio * Math.sin( pi5);
        double area = 5 * Math.pow( lado, 2) / (4 * Math.tan( pi5));

        System.out.printf( "El área es: %.2f\n", area); 
        
         
    }
}

 
