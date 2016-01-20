import java.util.*;

/**
 * Ejercicio 33 del Capítulo 3: Determinar qué compra ha sido más rentable. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_33
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in); //.useLocale( Locale.ENGLISH);

        System.out.print( "Peso del primer paquete: ");
        double peso1 = entrada.nextDouble();
        System.out.print( "Precio del primer paquete: ");
        double precio1 = entrada.nextDouble();

        System.out.print( "Peso del segundo paquete: ");
        double peso2 = entrada.nextDouble();
        System.out.print( "Precio del segundo paquete: ");
        double precio2 = entrada.nextDouble();

        double precioPorPeso1 = precio1 / peso1;
        double precioPorPeso2 = precio2 / peso2;
        
        if (precioPorPeso1 > precioPorPeso2)
            System.out.println( "El paquete 2 tiene mejor precio.");
        else if (precioPorPeso1 == precioPorPeso2)
            System.out.println( "Los dos paquetes tienen el mismo precio.");
        else
            System.out.println( "El paquete 1 tiene mejor precio.");
    }
}
 
