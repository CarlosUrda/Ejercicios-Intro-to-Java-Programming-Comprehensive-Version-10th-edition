import java.util.*;

/**
 * Ejercicio 2 del Capítulo 2.
 * Programa que calcula el área y volumen de un cilindro a partir del radio
 * y la altura.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.9
 */
public class Ejercicio2_02
{
    public static void main( String args[])
    {
        //Locale.setDefault( Locale.ENGLISH);
        //Scanner entrada = new Scanner( System.in);
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);
        System.out.println( "CÁLCULO DE UN CILINDRO");
        System.out.print( "Introduce el radio: ");
        double radio = entrada.nextDouble();
        System.out.print( "Introduce la altura: ");
        double altura = entrada.nextDouble();
        
        double area = radio*radio * Math.PI;
        double volumen = area * altura;

        System.out.println( "Área: " + area);
        System.out.println( "Volumen: " + volumen);
    }
}
