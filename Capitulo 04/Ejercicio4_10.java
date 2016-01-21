import java.util.*;

/**
 * Ejercicio 10 del Capítulo 4: Adivinar un día del mes a partir de la elección
 * de varios calendarios.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_10
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);//.setLocale( Locale.ENGLISH);

        String conjunto1 = "\nCALENDARIO 1\n" +
                           " 1  3  5  7\n"    +
                           " 9 11 13 15\n"    +
                           "17 19 21 23\n"    +
                           "25 27 29 31\n";
        String conjunto2 = "\nCALENDARIO 2\n" +
                           " 2  3  6  7\n"    +
                           "10 11 14 15\n"    +
                           "18 19 22 23\n"    + 
                           "26 27 30 31\n";
        String conjunto3 = "\nCALENDARIO 3\n" +
                           " 4  5  6  7\n"    + 
                           "12 13 14 15\n"    +
                           "20 21 22 23\n"    +
                           "28 29 30 31\n";
        String conjunto4 = "\nCALENDARIO 4\n" +
                           " 8  9 10 11\n"    +
                           "12 13 14 15\n"    +
                           "24 25 26 27\n"    +
                           "28 29 30 31\n";
        String conjunto5 = "\nCALENDARIO 5\n" +
                           "16 17 18 19\n"    +
                           "20 21 22 23\n"    +
                           "24 25 26 27\n"    +
                           "28 29 30 31\n";

        byte dia = 0;

        System.out.println( conjunto1);
        System.out.print( "¿Tú día pertenece al calendario 1? (S/N): ");
        char respuesta = entrada.next().trim().toUpperCase().charAt(0);
        if (respuesta == 'S')
            dia += 1;

        System.out.println( conjunto2);
        System.out.print( "¿Tú día pertenece al calendario 2? (S/N): ");
        respuesta = entrada.next().trim().toUpperCase().charAt(0);
        if (respuesta == 'S')
            dia += 2;

        System.out.println( conjunto3);
        System.out.print( "¿Tú día pertenece al calendario 3? (S/N): ");
        respuesta = entrada.next().trim().toUpperCase().charAt(0);
        if (respuesta == 'S')
            dia += 4;

        System.out.println( conjunto4);
        System.out.print( "¿Tú día pertenece al calendario 4? (S/N): ");
        respuesta = entrada.next().trim().toUpperCase().charAt(0);
        if (respuesta == 'S')
            dia += 8;

        System.out.println( conjunto5);
        System.out.print( "¿Tú día pertenece al calendario 5? (S/N): ");
        respuesta = entrada.next().trim().toUpperCase().charAt(0);
        if (respuesta == 'S')
            dia += 16;

        System.out.println( "\nEl día elegido es: " + 
                            ((dia == 0) ? "Ninguno" : dia));
    }
}

 
