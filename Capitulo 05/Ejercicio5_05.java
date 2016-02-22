import java.util.*;

/**
 * Ejercicio 05 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_05
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        System.out.print( "¿Valor inicial de kilogramos?: " );
        int iniKilos = sc.nextInt();
        System.out.print( "¿Valor final de kilogramos?: " );
        int finKilos = sc.nextInt();
        System.out.print( "¿Valor inicial de libras?: " );
        int iniLibras = sc.nextInt();
        System.out.print( "¿Valor final de libras?: " );
        int finLibras = sc.nextInt();
        System.out.print( "Número de valores: ");
        double filas = sc.nextInt();
        System.out.print( "Conversión de kilos a libras: ");
        double kiloALibra = sc.nextDouble();


        double incKilos = (finKilos - iniKilos) / (filas-1);
        double incLibras = (finLibras - iniLibras) / (filas-1);
        System.out.println( "Kilogramos       Libras  |  Libras     Kilogramos ");
        for (int i = 0; i < filas; ++i)
        {
            double kilos = iniKilos + incKilos*i;
            double libras = iniLibras + incLibras*i;
            System.out.printf( "%-11.2f %11.2f  |  %-11.2f %11.2f\n", 
                               kilos, kilos*kiloALibra, libras, libras/kiloALibra);
        }

    }
}
 
