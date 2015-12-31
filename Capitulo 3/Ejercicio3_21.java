import java.util.*;

/**
 * Ejercicio 21 del Capítulo 3: Calcular el día de la semana usando como 
 * algoritmo la congruencia de Zeller.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_21
{
    private static boolean esBisiesto( int anno)
    {
        return anno % 4 == 0 && anno % 100 != 0 || anno % 400 == 0;
    }


    private static byte diasEnMes( byte mes, int anno)
    {
        switch (mes)
        {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return (byte)(esBisiesto( anno) ? 29 : 28);
            default:
                return -1;
        }
    }


    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce el año: ");
        int anno = entrada.nextInt();
        System.out.print( "Introduce el mes [1-12]: ");
        byte mes = entrada.nextByte();
        System.out.print( "Introduce el día del mes [1-31]: ");
        byte diaDeMes = entrada.nextByte();
     
        byte dias = diasEnMes( mes, anno);
        if (diaDeMes < 1 || dias == -1 || diaDeMes > diasEnMes( mes, anno))
        {
            System.out.println( "Los datos del día, mes y año son incorrectos.");
            return;
        }

        if (mes < 3)
        {
            mes += 12;
            --anno;
        }

        byte annoDeSiglo = (byte)(anno % 100);
        int siglo = anno / 100;
        byte diaDeSemana = (byte)((diaDeMes + 26*(mes+1)/10 + annoDeSiglo + 
                                   annoDeSiglo/4 + 5*siglo + siglo/4) % 7);

        String diasDeSemana[] = {"Sábado", "Domingo", "Lunes", "Martes",
                                 "Miércoles", "Jueves", "Viernes"};

        System.out.println( "Día de la semana: " + diasDeSemana[diaDeSemana]);
    }
}
 
