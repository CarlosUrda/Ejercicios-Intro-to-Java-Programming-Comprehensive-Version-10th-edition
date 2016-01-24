import java.util.*;

/**
 * Ejercicio 17 del Capítulo 4: Mostrar el número de días de un mes en un año
 * determinado.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_17
{
    private static String capitalizar( String cadena)
    {
        return cadena.substring(0, 1).toUpperCase() + 
               cadena.substring(1).toLowerCase();
    }


    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.setLocale( Locale.ENGLISH);
        
        System.out.print( "Introduce el año: ");
        int anno = sc.nextInt();
        System.out.print( "Introduce el mes: ");
        String mes = capitalizar( sc.next().trim());
        int dias = 0;

        switch (mes)
        {
            case "Ene": case "Mar": case "May": case "Jul":
            case "Ago": case "Oct": case "Dic":
                dias = 31;
                break;

            case "Abr": case "Jun": case "Sep": case "Nov":
                dias = 30;
                break;

            case "Feb":
                dias = anno%4 != 0 || anno%100 == 0 && anno%400 != 0 ? 28 : 29;
                break;

            default:
                System.out.println( "Mes incorrecto");
                return;
        }

        System.out.printf( "Días: %d\n", dias);
    }
}

 
