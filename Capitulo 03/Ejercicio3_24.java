import java.util.*;

/**
 * Ejercicio 24 del Capítulo 3: Elegir una carta al azar de una baraja.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_24
{
    public static void main( String[] args)
    {
        int carta = (int)(52*Math.random());
        int palo = carta / 13;
        int valor = carta % 13;
        String palos[] = {"Bastos", "Copas", "Espadas", "Oros"};
        String valores[] = {"As", "Dos", "Tres", "Cuatro", "Cinco", "Seis", 
                            "Siete", "Ocho", "Nueve", "Diez", "Sota", "Caballo",
                            "Rey"};

        System.out.println( "La carta elegida es: " + valores[valor] + " de " +
                            palos[palo]);
    }
}
 
