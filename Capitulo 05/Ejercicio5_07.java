import java.util.*;

/**
 * Ejercicio 07 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_07
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        System.out.print( "Introduce el precio inicial de la matrícula: ");
        double matricula = sc.nextDouble();

        System.out.print( "Años a obtener el valor de la matrícula: ");
        int annos = sc.nextInt();

        System.out.print( "Porcentaje de subida cada año: ");
        double porcentaje = sc.nextDouble()*0.01;

        System.out.print( "Años posteriores a calcular la subida: ");
        int annosPost = sc.nextInt();

        for (int i = 0; i < annos; ++i)
            matricula *= (1 + porcentaje);

        System.out.println( "La matrícula en el año " + annos + " es: " + matricula);

        double subida = 0;
        for (int i = 0; i < annosPost; ++i)
        {
            double subidaAnual = matricula * porcentaje;
            subida += subidaAnual;
            matricula += subidaAnual;
        }

        System.out.println( "Matrícula " + annosPost + " años posteriores: " + matricula);
        System.out.println( "Subida " + annosPost + " años posteriores: " + subida);
    }
}

