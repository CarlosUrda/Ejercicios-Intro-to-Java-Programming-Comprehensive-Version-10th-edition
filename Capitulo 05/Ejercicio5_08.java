import java.util.*;

/**
 * Ejercicio 08 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_08
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        System.out.print( "Introduce el número de estudiantes: ");
        int estudiantes = sc.nextInt();

        double maxNota = 0;
        String maxNombre = null;
        for (int i = 0; i < estudiantes; ++i)
        {
            System.out.println( "Datos del estudiante número " + (i+1) + ":");
            System.out.print( "Nombre: ");
            String nombre = sc.next();
            System.out.print( "Nota: ");
            double nota = sc.nextDouble();
            if (nota > maxNota)
            {
                maxNota = nota;
                maxNombre = nombre;
            }
        }

        System.out.println( "Los datos del mejor alumno son: ");
        System.out.println( "Nombre: " + maxNombre);
        System.out.println( "Nota: " + nota);
    }
}

