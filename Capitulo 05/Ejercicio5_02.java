import java.util.*;

/**
 * Ejercicio 02 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_02
{
    public static void main( String[] args)
    {
        // Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.print( "¿Cuántas preguntas deseas hacer?: " );
        int preguntas = sc.nextInt();
        System.out.print( "Valor máximo de los valores a calcular: ");
        int maxValor = sc.nextInt();

        String respuestas = "";
        double tiempoInicial = System.currentTimeMillis();
        int aciertos = 0;

        for (int i = 0; i < preguntas; ++i)
        {
            int valor1 = (int)(Math.random() * maxValor) + 1;
            int valor2 = (int)(Math.random() * maxValor) + 1;
            System.out.print( "=> ¿"+ valor1 + " + " + valor2 + "?: ");
            int respuesta = sc.nextInt();
            boolean acierto = respuesta == (valor1 + valor2);
            String patron = "%4d   + %3d = %3d  -> %6b\n";
            respuestas += String.format( patron, valor1, valor2, respuesta, acierto);

            if (acierto) ++aciertos;
        }

        double tiempoTotal = (System.currentTimeMillis() - tiempoInicial) / 1000;

        System.out.printf( "Tiempo empleado: %f sg\n", tiempoTotal);
        System.out.println( "Número de aciertos: " + aciertos);
        System.out.println( "RESPUESTAS:\n" + respuestas);

    }
}
 
