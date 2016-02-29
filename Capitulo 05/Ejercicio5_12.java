import java.util.*;

/**
 * Ejercicio 12 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_12
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        System.out.print( "Introduce el límite inferior al cual acercarse: ");
        int limite = sc.nextInt();

        int numero = 0;
        while (numero*numero <= limite) ++numero;

        double raiz = Math.sqrt( limite);
        if ((int)(raiz+1) == numero)
        {
            System.out.printf( "El menor número cuyo cuadrado es mayor que %d: %d\n", 
                               limite, numero);
            return;
        }

        System.out.printf( "El número obtenido %d es incorrecto.\n", numero);
    }
}



