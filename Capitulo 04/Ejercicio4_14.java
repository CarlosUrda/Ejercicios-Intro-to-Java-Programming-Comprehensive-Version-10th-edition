import java.util.*;

/**
 * Ejercicio 14 del Capítulo 4: Mostrar el valor correspondiente a una nota
 * representada por una letra.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_14
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        System.out.print( "Introduce la nota [A-F]: ");
        char nota = entrada.next().trim().toUpperCase().charAt(0);

        if (nota < 'A' || nota > 'F' || nota == 'E')
        {
            System.out.println( "La nota introducida no es válida.");
            return;
        }
    
        byte valor = (byte)(nota == 'F' ? 1 : 0);
        valor += 'A' - nota + 4;
        System.out.printf( "El valor para la nota %c es %d.\n", nota, valor);
    }
}

 
