import java.util.*;

/**
 * Ejercicio 09 del Capítulo 5:
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio5_09
{
    public static void main( String[] args)
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner sc = new Scanner( System.in);//.useLocale( Locale.ENGLISH);

        System.out.print( "Introduce el número de estudiantes: ");
        int estudiantes = sc.nextInt();

        double maxNota1 = -1, maxNota2 = -1;
        String maxNombre1 = null, maxNombre2 = null;
        for (int i = 0; i < estudiantes; ++i)
        {
            System.out.println( "Datos del estudiante número " + (i+1) + ":");
            System.out.print( "Nombre: ");
            String nombre = sc.next();
            System.out.print( "Nota: ");
            double nota = sc.nextDouble();

            if (nota <= maxNota2) continue;
            if (nota > maxNota1)
            {
                maxNota2 = maxNota1;
                maxNombre2 = maxNombre1;
                maxNota1 = nota;
                maxNombre1 = nombre;
                continue;
            }
            if (nota > maxNota2)
            {
                maxNota2 = nota;
                maxNombre2 = nombre;
            }
        }

        if (maxNombre1 == null)
        {
            System.out.println( "No hay alumnos suficientes");
            return;
        }

        System.out.println( "Los datos del mejor alumno son: ");
        System.out.println( "Nombre: " + maxNombre1);
        System.out.println( "Nota: " + maxNota1);
        if (maxNombre2 == null) return;
        System.out.println( "Los datos del segundo mejor alumno son: ");
        System.out.println( "Nombre: " + maxNombre2);
        System.out.println( "Nota: " + maxNota2);
        
    }
}

