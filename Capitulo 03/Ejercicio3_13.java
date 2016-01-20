import java.util.*;

/**
 * Ejercicio 13 del Capítulo 3: Calcular los impuestos a pagar por cada tipo
 * de contribuyente según sus ingresos anuales.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio3_13
{
    public static void main(String[] args) 
    {
        Locale.setDefault( Locale.ENGLISH);
        Scanner entrada = new Scanner( System.in);

        // Tipos de declaración
        final byte SOLTERO = 0;
        final byte CASADO_CONJUNTA = 1;
        final byte CASADO_SEPARADA = 2;
        final byte CABEZA_DE_HOGAR = 3;

        // Límites en los rangos de ganancias a aplicar impuestos.
        double tasaDeImpuestos[] = {0.1, 0.15, 0.25, 0.28, 0.33, 0.35};
        double limitesSoltero[] = {0, 8350, 33950, 82250, 171550, 372950};
        double limitesCasadoConjunta[] = {0, 16700, 67900, 137050, 208850, 372950};
        double limitesCasadoSeparada[] = {0, 8350, 33950, 68525, 104425, 186475};
        double limitesCabezaDeHogar[] = {0, 11950, 45500, 117450, 190200, 372950};

        System.out.print( "Introduce el tipo de contribuyente: ");
        byte tipoDeContribuyente = entrada.nextByte();
        System.out.print( "Introduce sus ingresos anuales: ");
        double ingresos = entrada.nextDouble();

        double limites[] = null;

        switch (tipoDeContribuyente)
        {
            case SOLTERO:
                limites = limitesSoltero;
                break;

            case CASADO_CONJUNTA:
                limites = limitesCasadoConjunta;
                break;
                
            case CASADO_SEPARADA:
                limites = limitesCasadoSeparada;
                break;
 
            case CABEZA_DE_HOGAR:
                limites = limitesCabezaDeHogar;
                break;

            default:
                break;
        }

        double impuesto = 0;
        for (int i = 0; i < tasaDeImpuestos.length; i++)
        {
            if (i+1 == tasaDeImpuestos.length || ingresos <= limites[i+1])
            {
                impuesto += (ingresos - limites[i]) * tasaDeImpuestos[i];
                break;
            }
            else
                impuesto += (limites[i+1] - limites[i]) * tasaDeImpuestos[i];
        }

        System.out.printf( "Los impuestos son: %.1f\n", impuesto);
    }
}

