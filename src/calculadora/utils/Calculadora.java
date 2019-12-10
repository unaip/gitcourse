package calculadora.utils;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class Calculadora {

	/**
	 * Método que calcula la media de un conjunto de valores. Tiene en cuenta como
	 * máximo los primeros 100 valores del array recibido como parámetro. Para
	 * calcular la media, solo tiene en cuenta aquellos valores comprendidos entre
	 * los limites minimo y maximo
	 * 
	 * @param valor  array de numeros enteros.
	 * @param minimo Límite mínimo para que un valor sea considerado válido.
	 * @param maximo Límite máximo para que un valor sea considerado válido.
	 * @return
	 */
	public double media(int[] valor, int minimo, int maximo) {

		int i, totalEntrada, totalValido, suma;
		double media;

		i = 0;
		totalEntrada = totalValido = 0;
		suma = 0;

		while ((valor[i] != -999) && (totalEntrada < 100)) {

			totalEntrada++;

			if (valor[i] >= minimo && valor[i] <= maximo) {

				totalValido++;
				suma = suma + valor[i];
			} // END IF

			i++;
		}

		if (totalValido > 0) {

			media = (double) suma / totalValido;

		} else {

			media = -1;

		}

		return media;

	} // END MEDIA

	/**
	 * Método que calcula el máximo de un conjunto de valores. 
	 * 
	 * @param valores  array de numeros enteros.
	 * @return Máximo número en el array de valores
	 */
	public int max(int[] valores) {

		int i, max;

		if (valores.length == 0) {

//			max = -1;
			throw new NoSuchElementException("Array vacío");

		} else {

			max = valores[0];
			i = 1;

			while (i < valores.length) {

				if (valores[i] > max) {
					max = valores[i];
				}

				i++;
			}
		}

		return max;

	}

	/**
	 * Método que calcula el máximo de un conjunto de valores. 
	 * 
	 * @param valores  array de numeros enteros.
	 * @return Máximo número en el array de valores
	 * @throws NoSuchElementException Si la lista de valores está vacía
	 */
	public int maxWithStreams(int[] valores) {

		return Arrays.stream(valores).max().getAsInt();

	}

	/**
	 * Método que calcula la media de un conjunto de valores. Tiene en cuenta como
	 * máximo los primeros 100 valores del array recibido como parámetro. Para
	 * calcular la media, solo tiene en cuenta aquellos valores comprendidos entre
	 * los limites minimo y maximo
	 * 
	 * @param valor  array de numeros enteros.
	 * @param minimo Límite mínimo para que un valor sea considerado válido.
	 * @param maximo Límite máximo para que un valor sea considerado válido.
	 * @return
	 */
	public double mediaWithStreams(int[] valor, int minimo, int maximo) {
	
		return Arrays.stream(valor).limit(100).filter(x -> x >= minimo && x <= maximo).average().getAsDouble();

	} // END MEDIA
}
