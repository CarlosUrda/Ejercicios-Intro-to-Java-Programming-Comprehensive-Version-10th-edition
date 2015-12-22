import java.util.*;

/**
 * Ejercicio 4 del Capítulo 3: Mostrar el nombre de un mes del año de manera
 * aleatoria. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_04
{
    public static void main( String args[])
    {
        int numeroDeMes = (int)(Math.random()*12) + 1;
        String nombreDeMes = null;

        switch (numeroDeMes)
        {
            case 1:
                nombreDeMes = "Enero";
                break;
            case 2:
                nombreDeMes = "Febrero";
                break;
            case 3:
                nombreDeMes = "Marzo";
                break;
            case 4:
                nombreDeMes = "Abril";
                break;
            case 5:
                nombreDeMes = "Mayo";
                break;
            case 6:
                nombreDeMes = "Junio";
                break;
            case 7:
                nombreDeMes = "Julio";
                break;
            case 8:
                nombreDeMes = "Agosto";
                break;
            case 9:
                nombreDeMes = "Septiembre";
                break;
            case 10:
                nombreDeMes = "Octubre";
                break;
            case 11:
                nombreDeMes = "Noviembre";
                break;
            case 12:
                nombreDeMes = "Diciembre";
                break;
            default:
                break;
        }

        System.out.println( numeroDeMes + " => " + nombreDeMes);
    }
}
