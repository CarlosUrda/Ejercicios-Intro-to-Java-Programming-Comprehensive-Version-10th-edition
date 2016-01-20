import java.util.*;

/**
 * Ejercicio 8 del Capítulo 2: Mostrar la hora actual en una franja horaria 
 * específica a partir de GMT. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio2_08
{
    public static void main( String args[])
    {
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.print( "Introduce la franja horaria desde GMT: ");
        byte franja = entrada.nextByte();
       
        if (franja < -12 || franja > 12)
        {
            System.out.println( "La franja horaria no puede ser mayor que 12.");
            return;
        }

        long segundosTotales = System.currentTimeMillis() / 1000;
        byte segundos = (byte)(segundosTotales % 60);
        long minutosTotales = segundosTotales / 60;
        byte minutos = (byte)(minutosTotales % 60);
        long horasTotales = minutosTotales / 60 + franja;
        byte horas = (byte)(horasTotales % 24);
        long diasTotales = horasTotales / 24;

        System.out.println( "Días transcurridos desde el inicio: " + 
                            diasTotales);
        System.out.println( "Hora actual: " + horas + ":" + minutos + ":" +
                            segundos);
    }
}
