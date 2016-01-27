import java.util.*;

/**
 * Ejercicio 26 del Capítulo 4: A partir de una cantidad inicial de dólares y
 * centavos desplegar la cantidad de dólares, cuartos de dólar, dimes de dólar,
 * níquel de dólar y peniques. 
 * Si una cantidad es cero no debe ser mostrada. Además debe aparecer el 
 * nombre del tipo de moneda en plural en caso de existir una cantidad mayor a
 * 1.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_26
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);

        System.out.print( "Introduce cantidad inicial de dólares.centavos: ");
        String[] datos = sc.next().split( "\\.", 2);
        int totalCentavos = Integer.parseInt( datos[0]) * 100;
        if (datos.length > 1)
            totalCentavos += Integer.parseInt( (datos[1]+"0").substring(0,2));
        
        final int dolares = totalCentavos / 100;
        int cantidadRestante = totalCentavos % 100;
        final int cuartos = cantidadRestante / 25;
        cantidadRestante = cantidadRestante % 25;
        final int dimes = cantidadRestante / 10;
        cantidadRestante = cantidadRestante % 10;
        final int niqueles = cantidadRestante / 5;
        cantidadRestante = cantidadRestante % 5;
        final int peniques = cantidadRestante;

        System.out.println( "Cantidad total");
        String tipoDeMoneda = null;
        if (dolares > 0)
        {
            tipoDeMoneda = dolares > 1 ? "Dólares" : "Dólar";
            System.out.println( tipoDeMoneda + ": " + dolares);
        }
        if (cuartos > 0)
        {
            tipoDeMoneda = cuartos > 1 ? "Cuartos" : "Cuarto";
            System.out.println( tipoDeMoneda + ": " + cuartos);
        }
        if (dimes > 0)
        {
            tipoDeMoneda = dimes > 1 ? "Dimes" : "Dime";
            System.out.println( tipoDeMoneda + ": " + dimes);
        }
        if (niqueles > 0)
        {
            tipoDeMoneda = niqueles > 1 ? "Níqueles" : "Níquel";
            System.out.println( tipoDeMoneda + ": " + niqueles);
        }
        if (peniques > 0)
        {
            tipoDeMoneda = peniques > 1 ? "Peniques" : "Penique";
            System.out.println( tipoDeMoneda + ": " + peniques);
        }
    }
}
