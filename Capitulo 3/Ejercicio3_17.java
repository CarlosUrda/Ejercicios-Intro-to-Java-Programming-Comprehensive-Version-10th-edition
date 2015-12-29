import java.util.*;

/**
 * Ejercicio 17 del Capítulo 3: Juego del piedra papel o tijera.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_17
{
    private static String opcionElegida( byte opcion)
    {
        return opcion == 0 ? "Piedra" : opcion == 1 ? "Papel" : "Tijera";
    }

    public static void main(String[] args) 
    {
        //Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in).useLocale( Locale.ENGLISH);

        System.out.println( "PIEDRA, PAPEL O TIJERA");
        System.out.print( "Elige Piedra(0), Papel(1) o Tijera(2): ");
        byte opcionUsuario = entrada.nextByte();
        byte opcionMaquina = (byte)(Math.random()*3);

        System.out.println( "Elección de usuario: " + 
                            opcionElegida( opcionUsuario));
        System.out.println( "Elección de la máquina: " + 
                            opcionElegida( opcionMaquina));

        if (opcionUsuario == 0 && opcionMaquina == 2 ||
            opcionUsuario == 1 && opcionMaquina == 0 ||
            opcionUsuario == 2 && opcionMaquina == 1)
            System.out.println( "¡Has ganado!");
        else if (opcionUsuario == 0 && opcionMaquina == 0 ||
                 opcionUsuario == 1 && opcionMaquina == 1 ||
                 opcionUsuario == 2 && opcionMaquina == 2)
            System.out.println( "Empate");
        else
            System.out.println( "Gana la máquina");
    }
}

