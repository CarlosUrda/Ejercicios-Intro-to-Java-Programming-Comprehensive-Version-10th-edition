import java.util.*;

/**
 * Ejercicio 11 del Capítulo 3: Mostrar el número de días que tiene un mes
 * de un año elegido por el usuario.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_11
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Elige el número del mes: ");
        byte mes = entrada.nextByte();

        System.out.print( "Elige el año: ");
        short anno = entrada.nextShort();
        byte dias = -1;
           
        switch (mes)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;

            case 2:
                dias = (byte)((anno%4 == 0 && anno%100 != 0 || anno%400 == 0)
                              ? 29 : 28);
                break;


            default:
                break;                
        }

        System.out.println( "Año " + anno + ", Mes " + mes + " => " + dias + 
                            " dias");
    }
}

