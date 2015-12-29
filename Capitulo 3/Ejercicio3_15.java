import java.util.*;

/**
 * Ejercicio 15 del Capítulo 3: Juego de la lotería de 3 cifras.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_15
{
    public static void main(String[] args) 
    {
        //Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        
        System.out.println( "JUEGO DE LA LOTERÍA");
        System.out.print( "Introduce un número de 3 cifras: ");
        short numeroUsuario = entrada.nextShort();
        short numeroMaquina = (short)(Math.random()*1000);
        System.out.printf( "El número ganador es %03d\n", numeroMaquina);

        if (numeroUsuario == numeroMaquina)
        {
            System.out.println( "¡Has acertado el número exacto! => 10.000€");
            return;
        }

        byte digitosUsuario[] = {(byte)(numeroUsuario % 10), 
                                 (byte)((numeroUsuario / 10) % 10),
                                 (byte)((numeroUsuario / 100) % 10)};
        byte digitosMaquina[] = {(byte)(numeroMaquina % 10), 
                                 (byte)((numeroMaquina / 10) % 10),
                                 (byte)((numeroMaquina / 100) % 10)};

        byte numerosIguales = 0;
        for (byte i = 0; i < digitosUsuario.length; ++i)
        {           
            for (byte j = 0; j < digitosMaquina.length; ++j)
            {
                if (digitosMaquina[j] != -1 && 
                    digitosUsuario[i] == digitosMaquina[j])
                {
                    digitosMaquina[j] = -1;
                    ++numerosIguales;
                    break;
                }
            }            
        }

        switch (numerosIguales)
        {
            case 0:
                System.out.println( "No has acertado ningún número => 0€");
                break;
            case 1:
                System.out.println( "Has acertado un solo número => 500€");
                break;
            case 2:
                System.out.println( "Has acertado dos números => 1000€");
                break;
            case 3:
                System.out.println( "Has acertado todos los números pero no " +
                                    "en orden => 3000€");
                break;
            default:
                break;
        }
    }
}

