import java.util.*;

/**
 * Ejercicio 16 del Capítulo 3: Mostrar una coordenada aleatoria de un 
 * rectángulo de dimensiones determinadas por el usuario.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_16
{
    public static void main(String[] args) 
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce el centro del rectángulo (x,y): ");
        double centroX = entrada.nextDouble();
        double centroY = entrada.nextDouble();

        System.out.print( "Introduce el ancho y el alto: ");
        double ancho = entrada.nextDouble();
        double alto = entrada.nextDouble();


        double aleat = (int)(Math.random()*1000) / 999.0;
        double puntoX = (aleat-0.5) * ancho + centroX;
        aleat = (int)(Math.random()*1000) / 999.0;
        double puntoY = (aleat-0.5) * alto + centroY;
        System.out.printf( "El punto elegido es (%.3f,%.3f)\n", puntoX, puntoY);
    }
}

