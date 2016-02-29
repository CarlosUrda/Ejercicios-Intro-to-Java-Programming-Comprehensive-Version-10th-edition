import java.util.*;

/**
 * Ejercicio 13 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_13
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        System.out.print( "Introduce el límite inferior al cual acercarse: ");
        int limite = sc.nextInt();

        int numero = 0;
        while (Math.pow( numero, 3) < limite) ++numero;
        --numero;

        double raiz = Math.cbrt( limite);
        if ((int)Math.ceil(raiz-1) == numero)
        {
            System.out.printf( "El mayor número cuyo cubo es menor que %d: %d\n", 
                               limite, numero);
            return;
        }

        System.out.printf( "El número obtenido %d es incorrecto.\n", numero);
    }
}



