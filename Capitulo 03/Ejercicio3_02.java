import java.util.*;

/**
 * Ejercicio 2 del Capítulo 3: Comprobar si el usuario ha introducido 
 * correctamente la suma de tres números de una cifra.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_02
{
    public static void main( String args[])
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        byte digito1 = (byte)(Math.random()*10);
        byte digito2 = (byte)(Math.random()*10);
        byte digito3 = (byte)(Math.random()*10);

        System.out.print( "¿Cuál es la suma de " + digito1 + " + " + digito2 + 
                          " + " + digito3 + "?: ");

        int sumaUsuario = entrada.nextInt();
        int suma = digito1 + digito2 + digito3;

        String acierto = (suma == sumaUsuario) ? "correcta" : "errónea";
        System.out.println( "La suma introducida es " + acierto);
    }
}
 
