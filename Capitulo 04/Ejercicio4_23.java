import java.util.*;

/**
 * Ejercicio 23 del Capítulo 4: Mostrar información de impuestos de un 
 * contribuyente.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio4_23
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        System.out.print( "Nombre del empleado: ");
        String nombre = entrada.nextLine();

        System.out.print( "Horas trabajadas a la semana: ");
        double horasPorSemana = entrada.nextFloat();

        System.out.print( "Remuneración a la hora: ");
        double cobroPorHora = (int)(entrada.nextFloat()*100)/100.0;

        System.out.print( "Impuesto Comunidad Autónoma (%): ");
        double tasaImpuestoAutonomia = (int)(entrada.nextFloat()*100)/100.0;

        System.out.print( "Impuesto Nacional (%): ");
        double tasaImpuestoNacion = (int)(entrada.nextFloat()*100)/100.0;

        System.out.println( "Nombre: " + nombre);
        System.out.println( "Horas trabajadas: " + horasPorSemana);
        System.out.println( "Cobro por Hora: €" + cobroPorHora);
        double cobroPorSemana = cobroPorHora * horasPorSemana;
        System.out.printf( "Cobro bruto a la semana: %.2f€\n", cobroPorSemana);
        System.out.println( "Deducciones: ");
        double impuestoAutonomia = tasaImpuestoAutonomia/100 * cobroPorSemana; 
        System.out.printf( "\tComunidad Autónoma: %.2f€\n", impuestoAutonomia);
        double impuestoNacion = tasaImpuestoNacion/100 * cobroPorSemana; 
        System.out.printf( "\tNación: %.2f€\n", impuestoNacion);
        System.out.printf( "\tDeducción total: %.2f€\n", 
                           impuestoAutonomia + impuestoNacion);
        System.out.printf( "Cobro neto a la semana: %.2f€\n", 
                           cobroPorSemana - impuestoNacion - impuestoAutonomia);
        
    }
}

