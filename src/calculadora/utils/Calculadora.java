package calculadora.utils;

public class Calculadora {

	/**
	 * M�todo que calcula la media de un conjunto de valores. Tiene en cuenta como
	 * m�ximo los primeros 100 valores del array recibido como par�metro. Para
	 * calcular la media, solo tiene en cuenta aquellos valores comprendidos entre
	 * los limites minimo y maximo
	 * 
	 * @param valor  array de numeros enteros.
	 * @param minimo L�mite m�nimo para que un valor sea considerado v�lido.
	 * @param maximo L�mite m�ximo para que un valor sea considerado v�lido.
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

	public int max(int[] valores) {

		int i, max;

		if (valores.length == 0) {

//			max = -1;
			throw new IllegalArgumentException("Array vac�o");

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
}
