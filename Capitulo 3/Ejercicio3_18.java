import java.util.*;

/**
 * Ejercicio 18 del Capítulo 3: Calcular el coste de facturar un paquete según
 * su peso.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_18
{
    public static void main(String[] args) 
    {
        //Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.print( "Introduce el peso del paquete a facturar (kg): ");
        double peso = entrada.nextDouble();
        boolean facturado = true;
        double coste = 0;

        if (peso <= 1)
            coste = 3.5;
        else if (peso <= 3)
            coste = 5.5;
        else if (peso <= 10)
            coste = 8.5;
        else if (peso <= 20)
            coste = 10.5;                   
        else
            facturado = false;

        String mensaje = facturado ? "El coste de facturación es: " + coste
                                   : "El paquete no puede ser facturado";

        System.out.println( mensaje);
    }
}
 
