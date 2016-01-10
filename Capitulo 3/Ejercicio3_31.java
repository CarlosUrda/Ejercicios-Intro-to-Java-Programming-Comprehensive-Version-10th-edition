import java.util.*;

/**
 * Ejercicio 31 del Capítulo 3: Convertir de Euros a Dólares. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_31
{
    public static void main( String args[])
    {
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.print( "Tipo de cambio ($ => € [0]; € => $ [1]): ");
        byte tipoDeCambio = entrada.nextByte();

        char monedaInicial = ' ', monedaFinal = ' ';

        switch (tipoDeCambio)
        {
            case 0:
                monedaInicial = 'S';
                monedaFinal = '€';
                break;

            case 1:
                monedaInicial = '€';
                monedaFinal = '$';
                break;

           default:
                System.out.println( "Tipo de cambio incorrecto:");
                System.exit( -1);
        }

        System.out.print( "Introduce la razón de cambio de " + monedaInicial +
                          " a " + monedaFinal + ": ");
        double razonDeCambio = entrada.nextDouble();

        System.out.print( "Introduce la cantidad de " + monedaInicial + ": ");
        double cantidadInicial = entrada.nextDouble();

        double cantidadFinal = cantidadInicial * razonDeCambio;
        System.out.println( "El cambio en " + monedaFinal + " es: " + 
                            cantidadFinal);
    }
}
