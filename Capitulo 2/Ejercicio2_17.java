import java.util.*;

/**
 * Ejercicio 17 del Capítulo 2: Calcular la sensación térmica a partir de la
 * temperatura del ambiente y la velocidad del viento.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_17
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce la temperatura ambiente [-58ºF|41ºF]: ");
        final double temperaturaAmbiente = entrada.nextDouble();

        System.out.print( "Introduce la velocidad del viento (>=2): ");
        final double velocidadViento = entrada.nextDouble();
  
        final double potencia = Math.pow( velocidadViento, 0.16);
        final double sensacionTermica = 35.74 + 0.6215*temperaturaAmbiente - 
                                        35.75*potencia +
                                        0.4275*temperaturaAmbiente*potencia;
        System.out.printf( "Sensación Térmica: %.5f\n", sensacionTermica);
    }
}
