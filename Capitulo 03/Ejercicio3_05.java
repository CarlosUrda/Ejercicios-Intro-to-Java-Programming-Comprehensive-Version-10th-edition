import java.util.*;

/**
 * Ejercicio 5 del Capítulo 3: Calcular el futuro día de la semana a partir de 
 * uno inicial. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_05
{

    private static String nombreDeDiaDeSemana( int dia)
    {
        String nombreDeDia = null;

        switch (dia)
        {
            case 0:
                nombreDeDia = "Lunes";
                break;
            case 1:
                nombreDeDia = "Martes";
                break;
            case 2:
                nombreDeDia = "Miércoles";
                break;
            case 3:
                nombreDeDia = "Jueves";
                break;
            case 4:
                nombreDeDia = "Viernes";
                break;
            case 5:
                nombreDeDia = "Sábado";
                break;
            case 6:
                nombreDeDia = "Domingo";
                break;
            default:
                break;
        }

        return nombreDeDia;
    }
   

    public static void main( String args[])
    {
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Introduce el número de día de la semana [0-6]: ");
        int hoy = entrada.nextInt() % 7;
        System.out.print( "Introduce el número de días a partir de hoy: ");
        int dias = entrada.nextInt();
        
        int futuro = (hoy + dias) % 7;
        if (futuro < 0) futuro += 7;
        
        System.out.println( "Hoy es " + nombreDeDiaDeSemana( hoy) + 
                            " y el futuro es " + nombreDeDiaDeSemana( futuro));
    }
}
