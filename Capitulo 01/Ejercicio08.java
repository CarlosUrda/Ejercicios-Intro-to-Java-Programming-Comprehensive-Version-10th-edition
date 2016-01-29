
/**
 * Ejercicio 08 del Capítulo 01.
 *
 * @author Carlos A. Gómez Urda
 * @version 1.0
 */
public class Ejercicio08
{
	private static final long maxN = 10000;
	

	/**
	 * Calcular PI utilizando el sumatorio: 4 * (1 - 1/3 + 1/5 - 1/7 ...1/(1+2N))
	 *
	 * @param maxN Máximo valor de N en el sumatorio
	 * @return Valor aproximado de PI
	 */
	private static double calcularPi( long maxN)
	{
		double resultado = 0;
		byte factor = 1;
		
		for (int i = 0; i < maxN; i++, factor *= -1)
			resultado += factor * 1.0 / (i*2 + 1);
		
		resultado *= 4;

		return resultado;
	}


	/**
	 * Calcular PI utilizando el sumatorio: 4 * (1 - 1/3 + 1/5 - 1/7 ...1/(1+2N)).
	 * El valor usado para N es maxN.
	 *
	 * @return Valor aproximado de PI
	 */
	private static double calcularPi()
	{
		return calcularPi( maxN);
	}


	public static void main( String args[])
	{
		final double radio = 5.5;
		double area;
		double perimetro;
		double pi;

		pi = calcularPi();
		perimetro = 2 * radio * pi;
		area = radio * radio * pi;

		System.out.println("Radio: " + radio);
		System.out.println("Perimetro: " + perimetro);
		System.out.println("Area: " + area);
	}
}
