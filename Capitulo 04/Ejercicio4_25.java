import java.util.*;

/**
 * Ejercicio 25 del Capítulo 4: Generación automática de una matrícula.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_25
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);
        String letras = "";

        for (int i = 0; i < 3; i++)
            letras += (char)(Math.random()*('Z'-'A'+1) + 'A');

        int numero = (int)(Math.random() * 10000);
        
        String matricula = String.format( "%s-%04d", letras, numero);

        System.out.println( "Matricula: " + matricula);
    }
}

