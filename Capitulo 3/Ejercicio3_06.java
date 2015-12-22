import java.util.*;

/**
 * Ejercicio 6 del Capítulo 3: Calcular el índice de masa corporal. 
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_06
{
    public static void main(String[] args) 
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce el peso en libras: ");
        double libras = entrada.nextDouble(); 
        System.out.print("Introduce la altura en pies: ");
        double pies = entrada.nextDouble(); 
        System.out.print("Introduce la altura en pulgadas: ");
        double pulgadas = entrada.nextDouble(); 

        final double KILOS_POR_LIBRA = 0.45359237;
        final double METROS_POR_PULGADA = 0.0254; 
        final double PULGADAS_POR_PIE = 12; 

        double kilos = libras * KILOS_POR_LIBRA;
        pulgadas += pies * PULGADAS_POR_PIE;
        double metros = pulgadas * METROS_POR_PULGADA;
        double indice = kilos / (metros * metros);

        System.out.println("El Índice de Masa es " + indice);
        if (indice < 18.5)
            System.out.println("Underweight");
        else if (indice < 25)
            System.out.println("Normal");
        else if (indice < 30)
            System.out.println("Overweight");
        else
            System.out.println("Obese");
    }        
}
