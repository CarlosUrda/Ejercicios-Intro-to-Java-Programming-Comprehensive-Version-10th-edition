import java.util.*;

/**
 * Ejercicio 14 del Capítulo 3: Acertar el resultado del lanzamiento de una
 * moneda.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_14
{
    public static void main(String[] args) 
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Cara (false) o Cruz (true): ");
        boolean ladoElegido = entrada.nextBoolean();
        boolean ladoResultado = (int)(Math.random()+0.5) == 1;
        System.out.println( "Has elegido " + (ladoElegido ? "Cruz" : "Cara"));
        System.out.println( "Ha salido " + (ladoResultado ? "Cruz" : "Cara"));
        System.out.println( ladoElegido==ladoResultado ? "¡Acierto!" : "Fallo");
    }
}

